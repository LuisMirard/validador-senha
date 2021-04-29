package validador.validador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import validador.validador.service.SenhaService;

@RestController
@RequestMapping(value = "/valida")
public class ValidadorController {

    @Autowired
    private SenhaService senhaService;

    @PostMapping
    public Boolean validaSenha(@RequestParam String senha){    
        return senhaService.validaSenha(senha);
    }
    
}
