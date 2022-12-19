package med.voll.apiSpringBoot.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.apiSpringBoot.controller.AtualizacaoPacienteDTO;
import med.voll.apiSpringBoot.endereco.Endereco;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    @Embedded
    Endereco endereco;
    private Boolean ativo;

    public Paciente(CadastroPacienteDTO dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.dadosEndereco());
        this.ativo = true;
    }

    public void atualizarInformacoes(AtualizacaoPacienteDTO dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.dadosEndereco() != null){
            this.endereco.atualizarInformacoes(dados.dadosEndereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
