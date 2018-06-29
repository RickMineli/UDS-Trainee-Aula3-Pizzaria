package br.com.UDSTraineeRick.PizzariaRick.codigo;

import java.util.Set;
import java.util.UUID;

public interface PizzaRepository {
    PizzaDTO save(PizzaDTO pizzaDTO);

    PizzaDTO findOne(UUID id);

    void delete(UUID id);

    Set<PizzaDTO> findAll();
}
