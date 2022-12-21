package med.voll.apiSpringBoot.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.apiSpringBoot.domain.endereco.DadosEnderecoDTO;

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
