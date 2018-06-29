package br.com.UDSTraineeRick.PizzariaRick.codigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository repositoryPizza;

    @Override
    public PizzaDTO criar(PizzaDTO pizzaDTO) {
        return this.repositoryPizza.save(pizzaDTO);
    }

    @Override
    public void editar(UUID id, PizzaDTO pizzaDTO) {
        PizzaDTO pizzaRecuperada = this.obter(id);
        remover(id);
        pizzaRecuperada.setMassa(pizzaDTO.getMassa());
        pizzaRecuperada.setMolho(pizzaDTO.getMolho());
        pizzaRecuperada.setQueijo(pizzaDTO.getQueijo());
        pizzaRecuperada.setSabor(pizzaDTO.getSabor());
        pizzaRecuperada.setTempoDePreparo(pizzaDTO.getTempoDePreparo());
        this.repositoryPizza.save(pizzaRecuperada);
    }

    @Override
    public PizzaDTO obter(UUID id) {
        return this.repositoryPizza.findOne(id);
    }

    @Override
    public void remover(UUID id) {
        this.repositoryPizza.delete(id);
    }

    @Override
    public Set<PizzaDTO> listar() {
        return this.repositoryPizza.findAll();
    }
}
