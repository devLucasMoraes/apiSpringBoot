package med.voll.apiSpringBoot.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.apiSpringBoot.domain.endereco.DadosEnderecoDTO;

public record AtualizacaoPacienteDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecoDTO dadosEnderecoDTO
) {
}
