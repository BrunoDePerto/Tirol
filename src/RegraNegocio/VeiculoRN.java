package RegraNegocio;

import Dao.Factory;
import Dao.VeiculoDao;
import Model.Veiculo;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class VeiculoRN {

    private VeiculoDao veiculoDao;

    public VeiculoRN() {
        veiculoDao = Factory.createVeiculoDao();
    }

    public void salvar(Veiculo veiculo) {
        veiculoDao.salvar(veiculo);
    }

    public void alterar(Veiculo veiculo) {
        veiculoDao.alterar(veiculo);
    }

    public void apagar(Veiculo veiculo) {
        veiculoDao.apagar(veiculo);
    }

    public List<Veiculo> listar() {
        return veiculoDao.listar();
    }

    public Veiculo getVeiculo(int idVeiculo) {
        return veiculoDao.getVeiculo(idVeiculo);
    }
    
    public Veiculo getVeiculoNome(String nome){
        return veiculoDao.getVeiculoNome(nome);
    }
}
