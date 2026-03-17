package dev.java10x.itauJava10x.Estatistica;

import dev.java10x.itauJava10x.Transacoes.TransacaoRepository;
import dev.java10x.itauJava10x.Transacoes.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {

    @Autowired
    private TransacaoService transacaoService;

    @Autowired
    private TransacaoRepository transacaoRepository;



    @GetMapping
    public ResponseEntity<EstatisticaDTO> analisaDados() {

        return ResponseEntity.ok(transacaoService.calcularEstatistica());
    }

}
