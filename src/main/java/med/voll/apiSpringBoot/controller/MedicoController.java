package med.voll.apiSpringBoot.controller;

import jakarta.validation.Valid;
import med.voll.apiSpringBoot.medico.CadastroMedicoDTO;
import med.voll.apiSpringBoot.medico.ListagenMedicoDTO;
import med.voll.apiSpringBoot.medico.Medico;
import med.voll.apiSpringBoot.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;



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
    public Page<ListagenMedicoDTO> listar(Pageable pageable){
        return repository.findAll(pageable).map(ListagenMedicoDTO::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizacaoMedicoDTO dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }
}
