package br.com.UDSTraineeRick.PizzariaRick.codigo;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Component
public class PizzaRepositoryImpl implements PizzaRepository {

    private Set<PizzaDTO> pizzas = new HashSet();


    @Override
    public PizzaDTO save(PizzaDTO pizzaDTO) {
        pizzas.add(pizzaDTO);
        return pizzaDTO;
    }

    @Override
    public PizzaDTO findOne(UUID id) {
        for (PizzaDTO pizzaDTO: pizzas){
            if(pizzaDTO.getId().equals(id))
                return  pizzaDTO;
        }
        return null;
    }

    @Override
    public void delete(UUID id) {
        PizzaDTO pizzaDTO = this.findOne(id);
        this.pizzas.remove(pizzaDTO);
    }

    @Override
    public Set<PizzaDTO> findAll() {
        return pizzas;
    }
}
