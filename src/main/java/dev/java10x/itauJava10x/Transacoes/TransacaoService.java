package dev.java10x.itauJava10x.Transacoes;

import dev.java10x.itauJava10x.Estatistica.EstatisticaDTO;
import dev.java10x.itauJava10x.Estatistica.EstatisticaProperties;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class TransacaoService {

    @Autowired
    private EstatisticaProperties estatisticaProperties;

    @Autowired
    private TransacaoRepository transacaoRepository;

    public void validarTransacao(TransacaoRequest transacaoRequest) {

        if (transacaoRequest.valor() == null) {
            throw new IllegalArgumentException("Erro: A transferência deve conter um valor!");
        }

        if (transacaoRequest.dataHora() == null) {
            throw new IllegalArgumentException("Erro: A transferência deve conter a data!");
        }

        if (transacaoRequest.valor() < 0) {
            throw new IllegalArgumentException("Erro: Isso não é uma transação válida, transações devem ter valor maior que zero.");
        }

        if (transacaoRequest.dataHora().isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("Erro: A transação não pode ser feita devida a data e/ou hora alterada/s.");
        }

    }

    public void deletarTransacao() {
        transacaoRepository.deletarDados();
    }

    public EstatisticaDTO calcularEstatistica() {
        OffsetDateTime dataAtual = OffsetDateTime.now().minusSeconds(estatisticaProperties.segundos());
        return transacaoRepository.calcularEstatisticas(dataAtual);
    }

}