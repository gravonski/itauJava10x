package dev.java10x.itauJava10x;

import org.springframework.stereotype.Repository;

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

}
