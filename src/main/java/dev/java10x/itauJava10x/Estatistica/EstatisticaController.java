package dev.java10x.itauJava10x.Estatistica;

import dev.java10x.itauJava10x.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {

    @Autowired
    private TransacaoService transacaoService;

    @GetMapping
    public ResponseEntity<EstatisticaDTO> analisaDados() {
        EstatisticaDTO estatisticaDTO = transacaoService.calcularEstatisticas;
        return ResponseEntity.ok(estatisticaDTO);
    }

}
