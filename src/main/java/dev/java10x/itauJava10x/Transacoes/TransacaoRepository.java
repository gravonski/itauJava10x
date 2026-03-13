package dev.java10x.itauJava10x.Transacoes;

import dev.java10x.itauJava10x.Estatistica.EstatisticaDTO;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TransacaoRepository {
    //Salvar os dados em uma LISTA, apagar a lista depois de 60 segundos e apagar todas as transações da lista!
    List<TransacaoRequest> listaTransacoes = new ArrayList<>();

    public void salvarDados(TransacaoRequest transacaoRequest) {
        listaTransacoes.add(transacaoRequest);
    }

    public void limparDados(TransacaoRequest transacaoRequest) {

    }

    public void deletarDados() {
        listaTransacoes.clear();
    }

    public EstatisticaDTO calcularEstatisticas(OffsetDateTime horaLimite) {
        return new EstatisticaDTO(0,0.0,0.0,0.0,0.0);
    }
}
