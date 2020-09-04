package br.com.bandtec.avaliacaocontinuada;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/programas")
public class ProgramaController {

    private List<Programa> programas = new ArrayList<>();

    @GetMapping
    public ResponseEntity listarProgramas() {
        if (programas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.ok(programas);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity consultarPrograma (@PathVariable int id) {
        if (programas.size() < id){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(programas.get(id-1));
        }
    }

    @PostMapping
    public ResponseEntity cadastraPrograma(@RequestBody Programa novoPrograma) {
        programas.add(novoPrograma);
        return ResponseEntity.created(null).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarPrograma(@PathVariable int id){
        if (programas.size() < id) {
            return ResponseEntity.notFound().build();
        }
        else {
            programas.remove(id - 1);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/lucros")
    public ResponseEntity lucrosGeral(@PathVariable int id){
        if (programas.size() < id) {
            return ResponseEntity.notFound().build();
        }
        else {
            Double total = 0.0;
            for (Programa p : programas) {
                total += p.calculaLucro();
            }
            return ResponseEntity.ok("O lucro total dessa emissora foi de " + total);
        }
    }

/*    @GetMapping("/lucros/{id}")
    public ResponseEntity lucrosPrograma(@PathVariable int id){
        if (programas.size() < id) {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok("O lucro total dessa emissora foi de " + programas);
        }
    }
*/
}
