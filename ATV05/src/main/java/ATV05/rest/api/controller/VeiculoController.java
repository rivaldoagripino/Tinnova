package ATV05.rest.api.controller;

import ATV05.rest.api.model.VeiculoModel;
import ATV05.rest.api.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VeiculoController {

    @Autowired
    private VeiculoRepository repository;

    @GetMapping(path = "/api/veiculos/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/veiculos/salvar")
    public VeiculoModel salvar(@RequestBody VeiculoModel usuario) {
        return repository.save(usuario);
    }

}
