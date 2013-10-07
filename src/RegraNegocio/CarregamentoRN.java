package RegraNegocio;

import Dao.CarregamentoDao;
import Dao.Factory;
import Model.Carregamento;
import TableModel.CarregamentoTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.table.TableModel;
import javax.swing.text.Caret;
import org.hibernate.HibernateException;

/**
 *
 * @author Bruno
 */
public class CarregamentoRN {

    private CarregamentoDao carregamentoDao;
    private GregorianCalendar dataControle;
    private String[][] valoresTela;

    public CarregamentoRN() {
        carregamentoDao = Factory.createCarregamentoDao();
        dataControle = new GregorianCalendar();
        valoresTela = new String[][]{{"DATA", ""}, {"HORA", ""}, {"TRANSPORTADORA", ""},
            {"MOTORISTA", ""}, {"PLACA", ""}, {"VEICULO", ""}};
    }

    public void salvar(String[][] valores) throws ParseException {
        Carregamento carregamento = new Carregamento();
        try {
            carregamento.setData(new SimpleDateFormat("dd-MM-yyyy").parse(valores[0][1])); //DATA
            carregamento.setHoraInicial(new SimpleDateFormat("hh:mm").parse(valores[1][1])); //HORA
            carregamento.setTransportadora(valores[2][1]); //TRANSPORTADORA
            carregamento.setMotorista(valores[3][1]); //MOTORISTA
            carregamento.setPlaca(valores[4][1]); //PLACA
            carregamento.setVeiculo(new VeiculoRN().getVeiculoNome(valores[5][1])); //VEICULO
            carregamentoDao.salvar(carregamento);
        } catch (ParseException e) {
            throw new ParseException("Erro ao converter a Data ou Hora", 0);
        }catch(HibernateException he){
            throw new HibernateException("Erro ao gravar Carregamento", he);
        }
    }

    public void alterar(Carregamento carregamento) {
        carregamentoDao.alterar(carregamento);
    }

    public void apagar(Carregamento carregamento) {
        carregamentoDao.apagar(carregamento);
    }

    public List<Carregamento> listar() {
        return carregamentoDao.listar();
    }

    public Carregamento getCarregamento(int idCarregamento) {
        return carregamentoDao.getCarregamento(idCarregamento);
    }
    //Tabela carregamento

    public TableModel getCarregarModel() {
        List<Carregamento> carregamentos = carregamentoDao.listarCarregarDia(dataControle.getTime());
        return new CarregamentoTableModel(carregamentos);
    }
    //Tabela carregado

    public TableModel getCarregadoModel() {
        List<Carregamento> carregamentos = carregamentoDao.listarCarregarDia(dataControle.getTime());
        return new CarregamentoTableModel(carregamentos);
    }

    //Aumenta um dia na data de controle
    public void proximoDia() {
        dataControle.add(GregorianCalendar.DATE, 1);
    }

    //Diminui um dia na data de controle
    public void anteriorDia() {
        dataControle.roll(GregorianCalendar.DATE, 1);
    }

    public String[][] getValoresTela() {
        return valoresTela;
    }

    public void setValoresTela(String[][] valoresTela) {
        this.valoresTela = valoresTela;
    }

    public GregorianCalendar getDataControle() {

        return dataControle;
    }
}
