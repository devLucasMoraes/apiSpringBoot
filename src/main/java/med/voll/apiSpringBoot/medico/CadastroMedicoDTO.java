package med.voll.apiSpringBoot.medico;

import med.voll.apiSpringBoot.endereco.DadosEndereco;

public record CadastroMedicoDTO(String nome, String email, String telefone, String crm, Especialidade especialidade, DadosEndereco dadosEndereco) {
}
