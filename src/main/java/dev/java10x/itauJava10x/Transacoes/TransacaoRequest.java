package dev.java10x.itauJava10x.Transacoes;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.OffsetDateTime;

public record TransacaoRequest(

        @NotNull
        @Min(value = 0)
        Double valor,

        @NotNull
        @PastOrPresent
        OffsetDateTime dataHora
) {}
