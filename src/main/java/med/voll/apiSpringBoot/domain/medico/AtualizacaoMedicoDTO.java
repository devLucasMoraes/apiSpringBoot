package med.voll.apiSpringBoot.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.apiSpringBoot.domain.endereco.DadosEnderecoDTO;

public record AtualizacaoMedicoDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecoDTO dadosEnderecoDTO
) {
}
