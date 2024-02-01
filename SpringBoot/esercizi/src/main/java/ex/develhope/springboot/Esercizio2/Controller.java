package ex.develhope.springboot.Esercizio2;

import ex.develhope.springboot.Esercizio1.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping("/saluta")
    public User saluta(@RequestParam String nome,
                       @RequestParam String regione){
        return new User(nome, regione);
    }

}
