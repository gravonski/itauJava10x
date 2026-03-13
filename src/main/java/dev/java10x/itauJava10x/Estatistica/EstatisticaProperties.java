package dev.java10x.itauJava10x.Estatistica;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "estatistica")
public record EstatisticaProperties(Integer segundos) {
}
