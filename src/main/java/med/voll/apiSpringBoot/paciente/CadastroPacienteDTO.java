package med.voll.apiSpringBoot.paciente;

import med.voll.apiSpringBoot.medico.DadosEndereco;

public record CadastroPacienteDTO(String nome, String email, String telefone, String cpf, DadosEndereco dadosEndereco) {
}
