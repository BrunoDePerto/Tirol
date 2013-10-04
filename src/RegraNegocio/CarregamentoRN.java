package RegraNegocio;

import Dao.CarregamentoDao;
import Dao.Factory;
import Model.Carregamento;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class CarregamentoRN {

    private CarregamentoDao carregamentoDao;

    public CarregamentoRN() {
        carregamentoDao = Factory.createCarregamentoDao();
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
    public List<Carregamento> listar(){
        return carregamentoDao.listar();
    }
    public Carregamento getCarregamento(int idCarregamento){
        return carregamentoDao.getCarregamento(idCarregamento);
    }
}
