package med.voll.apiSpringBoot.controller;

import jakarta.validation.Valid;
import med.voll.apiSpringBoot.medico.CadastroMedicoDTO;
import med.voll.apiSpringBoot.medico.ListagenMedicoDTO;
import med.voll.apiSpringBoot.medico.Medico;
import med.voll.apiSpringBoot.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody @Valid CadastroMedicoDTO dados){

        repository.save(new Medico(dados));
    }

    @GetMapping
    public List<ListagenMedicoDTO> listar(){
        return repository.findAll().stream().map(ListagenMedicoDTO::new).toList();
    }
}
