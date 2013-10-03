package Dao;

/**
 *
 * @author Bruno
 */
public class Factory {

    public static CarregamentoDao createCarregamentoDao() {
        return new CarregamentoDaoImp();
    }

    public static VeiculoDao createVeiculoDao() {
        return new VeiculoDaoImp();
    }
}
