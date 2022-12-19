package med.voll.apiSpringBoot.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.apiSpringBoot.endereco.DadosEnderecoDTO;

public record AtualizacaoPacienteDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecoDTO dadosEnderecoDTO
) {
}
