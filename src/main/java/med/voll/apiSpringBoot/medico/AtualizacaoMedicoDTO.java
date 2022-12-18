package med.voll.apiSpringBoot.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.apiSpringBoot.endereco.DadosEndereco;

public record AtualizacaoMedicoDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}