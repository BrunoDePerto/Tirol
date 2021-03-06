package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Veiculo generated by Bruno
 */
@Entity
@Table(name = "veiculo", catalog = "tirol_carregamento")
public class Veiculo implements java.io.Serializable {

    private Integer idVeiculo;
    private String nome;
    private float peso;
    private List<Carregamento> carregamentos = new ArrayList<>();

    public Veiculo() {
    }

    public Veiculo(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Veiculo(String nome, float peso, List<Carregamento> carregamentos) {
        this.nome = nome;
        this.peso = peso;
        this.carregamentos = carregamentos;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_veiculo", unique = true, nullable = false)
    public Integer getIdVeiculo() {
        return this.idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    @Column(name = "nome", nullable = false, length = 150)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "peso", nullable = false, precision = 12, scale = 0)
    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "veiculo")
    public List<Carregamento> getCarregamentos() {
        return this.carregamentos;
    }

    public void setCarregamentos(List<Carregamento> carregamentos) {
        this.carregamentos = carregamentos;
    }
}
