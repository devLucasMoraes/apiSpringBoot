package med.voll.apiSpringBoot.controller;

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
