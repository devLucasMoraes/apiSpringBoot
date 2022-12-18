package med.voll.apiSpringBoot.medico;

public record ListagenMedicoDTO(
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public ListagenMedicoDTO(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
