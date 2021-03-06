package Model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Carregamento generated by Bruno
 */
@Entity
@Table(name = "carregamento", catalog = "tirol_carregamento")
public class Carregamento implements java.io.Serializable {

    private Integer idCarregamento;
    private Veiculo veiculo;
    private Date data;
    private Date horaInicial;
    private Date horaFinal;
    private String transportadora;
    private String motorista;
    private String placa;
    private float peso;
    private char situacao;
    private BigDecimal valorExtra;
    private String motivo;

    public Carregamento() {
    }

    public Carregamento(Veiculo veiculo, Date data, Date horaInicial, Date horaFinal, String transportadora, String motorista, String placa, float peso, char situacao) {
        this.veiculo = veiculo;
        this.data = data;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.transportadora = transportadora;
        this.motorista = motorista;
        this.placa = placa;
        this.peso = peso;
        this.situacao = situacao;
    }

    public Carregamento(Veiculo veiculo, Date data, Date horaInicial, Date horaFinal, String transportadora, String motorista, String placa, float peso, char situacao, BigDecimal valorExtra, String motivo) {
        this.veiculo = veiculo;
        this.data = data;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.transportadora = transportadora;
        this.motorista = motorista;
        this.placa = placa;
        this.peso = peso;
        this.situacao = situacao;
        this.valorExtra = valorExtra;
        this.motivo = motivo;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_carregamento", unique = true, nullable = false)
    public Integer getIdCarregamento() {
        return this.idCarregamento;
    }

    public void setIdCarregamento(Integer idCarregamento) {
        this.idCarregamento = idCarregamento;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_veiculo", nullable = false)
    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = false, length = 10)
    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_inicial", nullable = false, length = 8)
    public Date getHoraInicial() {
        return this.horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_final", nullable = false, length = 8)
    public Date getHoraFinal() {
        return this.horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    @Column(name = "transportadora", nullable = false, length = 200)
    public String getTransportadora() {
        return this.transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    @Column(name = "motorista", nullable = false, length = 200)
    public String getMotorista() {
        return this.motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    @Column(name = "placa", nullable = false, length = 8)
    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Column(name = "peso", nullable = false, precision = 12, scale = 0)
    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Column(name = "situacao", nullable = false, length = 1)
    public char getSituacao() {
        return this.situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }

    @Column(name = "valor_extra", precision = 10)
    public BigDecimal getValorExtra() {
        return this.valorExtra;
    }

    public void setValorExtra(BigDecimal valorExtra) {
        this.valorExtra = valorExtra;
    }

    @Column(name = "motivo", length = 300)
    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
