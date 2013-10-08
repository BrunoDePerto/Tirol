package ComboBoxModel;

import Dao.Factory;
import Model.Veiculo;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.MutableComboBoxModel;

/**
 *
 * @author Bruno
 */
public class VeiculoComboBoxModel extends AbstractListModel implements MutableComboBoxModel {

    private List<Veiculo> veiculos;
    private int tamanho;

    public VeiculoComboBoxModel() {
    }

    public VeiculoComboBoxModel(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public int getSize() {
        return this.veiculos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.veiculos.get(index);
    }

    @Override
    public void addElement(Object item) {
        
    }

    @Override
    public void removeElement(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertElementAt(Object item, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeElementAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSelectedItem(Object anItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
