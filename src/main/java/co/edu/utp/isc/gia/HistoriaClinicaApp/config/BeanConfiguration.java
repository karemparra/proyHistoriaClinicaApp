package co.edu.utp.isc.gia.HistoriaClinicaApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class BeanConfiguration {

    @Bean
    ModelMapper modelMapper() {return new ModelMapper();}
}
