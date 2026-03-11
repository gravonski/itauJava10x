package dev.java10x.itauJava10x;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoRequest {

    private Double valor;
    private OffsetDateTime dataHora;

}
