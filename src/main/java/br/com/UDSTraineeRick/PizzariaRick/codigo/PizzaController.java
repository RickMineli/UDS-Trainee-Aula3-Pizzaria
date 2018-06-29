package br.com.UDSTraineeRick.PizzariaRick.codigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping
    public ResponseEntity criar(@RequestBody PizzaDTO pizzaDTO){
        PizzaDTO pizzaDTOCriada = this.pizzaService.criar(pizzaDTO);
        return new ResponseEntity(pizzaDTOCriada.toString(),
                HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity editar(@RequestParam("id")UUID id,
                                 @RequestBody PizzaDTO pizzaDTO){
        this.pizzaService.editar(id,pizzaDTO);
        return new ResponseEntity("Editado!", HttpStatus.OK);
    }

    @GetMapping
    public Set<PizzaDTO> listar(){
        return this.pizzaService.listar();
    }

    @GetMapping("/findBy")
    public PizzaDTO obter(@RequestParam("id")UUID id){
        return this.pizzaService.obter(id);
    }

    @DeleteMapping
    public ResponseEntity remover(@RequestParam("id")UUID id){
        this.pizzaService.remover(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }



}
