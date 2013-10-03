package Dao;

import Model.Carregamento;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface CarregamentoDao {

    public void salvar(Carregamento carregamento);

    public void alterar(Carregamento carregamento);

    public void apagar(Carregamento carregamento);

    public List<Carregamento> listar();

    public Carregamento getCarregamento(int idCarregamento);
}
