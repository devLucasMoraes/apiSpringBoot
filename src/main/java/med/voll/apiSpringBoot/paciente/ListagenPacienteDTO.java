package med.voll.apiSpringBoot.paciente;

public record ListagenPacienteDTO(
        Long id,
        String nome,
        String email,
        String cpf
) {
    public ListagenPacienteDTO(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
