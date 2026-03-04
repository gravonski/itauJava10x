package dev.java10x.itauJava10x;

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

    @PostMapping
    public ResponseEntity adicionarTransacao(){
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
