package Dao;

import Model.Veiculo;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface VeiculoDao {

    public void salvar(Veiculo veiculo);

    public void alterar(Veiculo veiculo);

    public void apagar(Veiculo veiculo);

    public List<Veiculo> listar();

    public Veiculo getVeiculo(int idVeiculo);
    
    public Veiculo getVeiculoNome(String nome);
}
