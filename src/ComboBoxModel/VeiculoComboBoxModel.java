package ComboBoxModel;

import Model.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.MutableComboBoxModel;

/**
 *
 * @author Bruno
 */
//http://www.guj.com.br/java/234433-problema-ao-selecionar-item-dentro-do-jcombobox
public class VeiculoComboBoxModel extends AbstractListModel implements MutableComboBoxModel {

    private Object selectedItem;
    private List<Veiculo> veiculos;

    public VeiculoComboBoxModel() {
        //Criar um novo ArrayList vazio
        veiculos = new ArrayList<>();
    }

    public VeiculoComboBoxModel(List<Veiculo> veiculos) {
        //Cria o List veiculo com o valor da lista passada por parametro
        this.veiculos = new ArrayList<>(veiculos);
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        //Seta uma lista de veiculos
        this.veiculos = veiculos;
    }

    @Override
    public int getSize() {
        //Retorna o tamanho da lista de veiculos
        return veiculos.size();
    }

    @Override
    public Object getElementAt(int index) {
        //Retorna o veiculo que esteja na posição indice
        try {
            return this.veiculos.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Valor fora da lista");
        }
    }

    @Override
    public Object getSelectedItem() {
        //Retornar o veiculo selecionado
        return selectedItem;
    }

    public Integer getSelectedIndex() {
        //Retorna o indice do veiculo selecionado
        int index = veiculos.indexOf(this.getSelectedItem());
        return index;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        //Seta o veicuo selecionado
        selectedItem = anItem;
        fireContentsChanged(this, -1, veiculos.size());
    }

    public void setElementAt(Object veiculo, int index) {
        //Seta o veiculo selecionado na posição indice
        veiculos.set(index, (Veiculo) veiculo);
        int length = getSize();
        fireIntervalAdded(this, length - 1, length - 1);
    }

    @Override
    public void addElement(Object veiculo) {
        //Adiciona um veiculo no final da lista
        this.veiculos.add((Veiculo) veiculo);
        int length = getSize();
        fireIntervalAdded(this, length - 1, length - 1);
    }

    @Override
    public void insertElementAt(Object veiculo, int index) {
        this.veiculos.add(index, (Veiculo) veiculo);
        fireIntervalAdded(this, index, index);
    }

    @Override
    public void removeElement(Object veiculo) {
        //Remove o veiculo recebido por parametro
        int index = veiculos.indexOf(veiculo);
        if (index != -1) {
            // Remove o veiculo 
            veiculos.remove((Veiculo)veiculo);
            // Atualiza o combobox  
            fireIntervalRemoved(this, index, index);
        }
    }

    public void removeAllItens() {
        //Remove todos os veiculos
        if (veiculos != null && veiculos.size() > 0) {
            veiculos.clear();
            fireContentsChanged(this, -1, veiculos.size());
        }
    }

    @Override
    public void removeElementAt(int index) {
        //Remove o veiculo da posição indice
        if (getSize() >= index) {
            // Remove an element at the specified position  
            veiculos.remove(index);
            // Removed from index, notify ListDataListener objects  
            fireIntervalRemoved(this, index, index);
        }
    }
}
