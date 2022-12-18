package med.voll.apiSpringBoot.medico;

public record CadastroMedicoDTO(String nome, String email, String telefone, String crm, Especialidade especialidade, DadosEndereco dadosEndereco) {
}
