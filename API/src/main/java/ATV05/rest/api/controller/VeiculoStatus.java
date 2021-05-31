package ATV05.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeiculoStatus {

    @GetMapping(path = "/api/veiculos/status")
    public String check() {
        return "Online!";
    }

}
