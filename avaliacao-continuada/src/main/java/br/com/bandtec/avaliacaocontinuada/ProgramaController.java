package br.com.bandtec.avaliacaocontinuada;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/programas")
public class ProgramaController {

    private List<Programa> programas = new ArrayList<>();

    @GetMapping
    public List listarProgramas() {
        return programas;
    }

    @GetMapping("/{id}")
    public Programa consultarPrograma (@PathVariable int id) {
        return programas.get(id-1);
    }

    @PostMapping
    public String cadastraPrograma(@RequestBody Programa novoPrograma) {
        programas.add(novoPrograma);
        return "Programa cadastrado com sucesso";
    }

    @DeleteMapping("/{id}")
    public String deletarPrograma(@PathVariable int id){
        programas.remove(id-1);
        return "Programa número " + id + "excluído com sucesso";
    }
}
