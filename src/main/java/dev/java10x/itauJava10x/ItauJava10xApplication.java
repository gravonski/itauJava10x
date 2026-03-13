package dev.java10x.itauJava10x;

import dev.java10x.itauJava10x.Estatistica.EstatisticaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(EstatisticaProperties.class)
public class ItauJava10xApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItauJava10xApplication.class, args);
	}

}
