package med.voll.apiSpringBoot.controller;

import med.voll.apiSpringBoot.medico.CadastroMedicoDTO;
import med.voll.apiSpringBoot.medico.Medico;
import med.voll.apiSpringBoot.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody CadastroMedicoDTO dados){

        repository.save(new Medico(dados));
    }
}
