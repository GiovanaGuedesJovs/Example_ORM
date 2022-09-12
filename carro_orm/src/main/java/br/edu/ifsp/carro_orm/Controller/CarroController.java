package br.edu.ifsp.carro_orm.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifsp.carro_orm.Model.Carro;
import br.edu.ifsp.carro_orm.Repository.CarroRepository;

@RestController
@CrossOrigin
public class CarroController {
    @Autowired
    CarroRepository carroRepository;

    @PostMapping("/carro")
    public void adicionaCarro (@RequestBody Carro novoCarro){
        carroRepository.save(novoCarro);
    }

    @GetMapping("/carro")
    public List<Carro> recuperaCarros(){
        return (List<Carro>) carroRepository.findAll();
    }
}
