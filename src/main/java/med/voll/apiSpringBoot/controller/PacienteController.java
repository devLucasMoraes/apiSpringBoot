package med.voll.apiSpringBoot.controller;

import med.voll.apiSpringBoot.paciente.CadastroPacienteDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @PostMapping
    public void cadastrar(@RequestBody CadastroPacienteDTO dados){
        System.out.println(dados);
    }
}