package med.voll.apiSpringBoot.domain.medico;

import med.voll.apiSpringBoot.domain.endereco.Endereco;

public record DetalhamentoMedicoDTO(
        String nome,

        String email,

        String telefone,

        String crm,

        Especialidade especialidade,

        Endereco endereco
) {
    public DetalhamentoMedicoDTO(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getCrm(), medico.getEspecialidade(), medico.getEndereco());
    }
}
