package br.com.UDSTraineeRick.PizzariaRick.codigo;

import java.util.Set;
import java.util.UUID;

public interface PizzaService {
    PizzaDTO criar(PizzaDTO pizzaDTO);

    void editar(UUID id, PizzaDTO pizzaDTO);

    PizzaDTO obter(UUID id);

    void remover(UUID id);

    Set<PizzaDTO> listar();
}
