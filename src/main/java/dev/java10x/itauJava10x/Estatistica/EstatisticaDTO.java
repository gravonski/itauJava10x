package dev.java10x.itauJava10x.Estatistica;

public record EstatisticaDTO(
        long count,
        Double sum,
        Double avg,
        Double min,
        Double max
) {
}