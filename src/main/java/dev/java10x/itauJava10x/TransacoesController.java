package dev.java10x.itauJava10x;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TransacoesController {

    @Autowired
    private TransacaoService transacaoService;


    @PostMapping
    public ResponseEntity adicionarTransacao(@RequestBody TransacaoRequest transacaoRequest){

        try{
            transacaoService.validarTransacao(transacaoRequest);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (IllegalArgumentException exception){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
        }



    }

}
