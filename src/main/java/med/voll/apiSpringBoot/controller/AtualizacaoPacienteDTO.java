package med.voll.apiSpringBoot.controller;

import jakarta.validation.constraints.NotNull;
import med.voll.apiSpringBoot.endereco.DadosEndereco;

public record AtualizacaoPacienteDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco dadosEndereco
) {
}
