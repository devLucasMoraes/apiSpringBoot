package med.voll.apiSpringBoot.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.apiSpringBoot.endereco.DadosEnderecoDTO;

public record CadastroPacienteDTO(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank

        String telefone,
        @NotBlank

        String cpf,
        @NotNull @Valid
        DadosEnderecoDTO dadosEnderecoDTO
) {
}
