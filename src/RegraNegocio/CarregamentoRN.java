package RegraNegocio;

import Dao.CarregamentoDao;
import Dao.Factory;
import Model.Carregamento;
import TableModel.CarregamentoTableModel;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author Bruno
 */
public class CarregamentoRN {

    private CarregamentoDao carregamentoDao;
    private GregorianCalendar dataControle;

    public CarregamentoRN() {
        carregamentoDao = Factory.createCarregamentoDao();
        dataControle = new GregorianCalendar();
    }

    public void salvar(Carregamento carregamento) {
        carregamentoDao.salvar(carregamento);
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
    public TableModel getCarregarModel(){
        List<Carregamento> carregamentos = carregamentoDao.listarCarregarDia(dataControle.getTime());
        return new CarregamentoTableModel(carregamentos);
    }
    //Tabela carregado
    public TableModel getCarregadoModel(){
        List<Carregamento> carregamentos = carregamentoDao.listarCarregarDia(dataControle.getTime());
        return new CarregamentoTableModel(carregamentos);
    }
    
    //Aumenta um dia na data de controle
    public void proximoDia(){
        dataControle.add(GregorianCalendar.DATE, 1);
    }
    
    //Diminui um dia na data de controle
    public void anteriorDia(){
        dataControle.roll(GregorianCalendar.DATE, 1);
    }
}
