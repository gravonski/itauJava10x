package dev.java10x.itauJava10x;

import dev.java10x.itauJava10x.Estatistica.EstatisticaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Service
public class TransacaoService {

    public EstatisticaDTO calcularEstatisticas;
    @Autowired
    private TransacaoRepository transacaoRepository;

    public void validarTransacao(TransacaoRequest transacaoRequest) {

        if (transacaoRequest.getValor() == null) {
            throw new IllegalArgumentException("Erro: A transferência deve conter um valor!");
        }

        if (transacaoRequest.getDataHora() == null) {
            throw new IllegalArgumentException("Erro: A transferência deve conter a data!");
        }

        if (transacaoRequest.getValor() < 0) {
            throw new IllegalArgumentException("Erro: Isso não é uma transação válida, transações devem ter valor maior que zero.");
        }

        if (transacaoRequest.getDataHora().isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("Erro: A transação não pode ser feita devida a data e/ou hora alterada/s.");
        }

    }

    public void deletarTransacao() {
        transacaoRepository.deletarDados();
    }
}