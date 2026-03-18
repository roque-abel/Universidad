package com.universidad.matricula.infrastructura.gateway;

import com.universidad.matricula.infrastructura.entity.InformacionAlumnoEntity;
import com.universidad.matricula.service.dto.InformacionAlumnoDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
@AllArgsConstructor
@Slf4j
public class HttpProsesorGateway implements ProsesorInterfaceGateWay {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Boolean validarRequisitos(InformacionAlumnoDto informacionDto) {
        try {
            String url = "http://127.0.0.1:3000/v1/validascion-de-requisitoa";

            Boolean validado = this.restTemplate.postForObject(
                    url,
                    informacionDto,
                    Boolean.class
            );

            log.info("validacion realizada: {}", validado);
            return validado;

        } catch (Exception e) {
            log.error("Error iniciando validacion: {}", e.getMessage());
            throw new RuntimeException("Error iniciando validacion");
        }
    }

    @Override
    public String generarMatricula(InformacionAlumnoDto informacionAlumnoDto) {
        HttpClient client = HttpClient.newHttpClient();

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(informacionAlumnoDto);

        String matricula = "";
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:3000/v1/generardor-matricula"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );
            System.out.println(response.body());
            matricula = response.toString();
            return matricula;
        } catch (Exception e) {
            log.warn("Error en conexcion con microservicio generar matricula");
        }
        return matricula;
    }
}
