package com.universidad.matricula.infrastructura.ConfigRestemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ConfiguracionRestemplate {

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
