package ex.spring.develhope.esercizio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping("/saluta")
    public String chiediMeteo (@RequestParam String nome, @RequestParam String regione){
        return "Ciao " + nome + ", com'è il tempo in " + regione + " ?";
    }
}
