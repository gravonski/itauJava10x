package dev.java10x.itauJava10x.Transacoes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoRequest {

    private Double valor;
    private OffsetDateTime dataHora;

}
