package TableModel;
///http://devsv.wordpress.com/2012/07/08/como-implementar-um-tablemodel/
import Model.Carregamento;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bruno
 */
public class CarregamentoTableModel extends AbstractTableModel {

    //Lista de carragemento a serem exibidos na tela
    private List<Carregamento> linhas;
    //Nome das colunas
    private String[] colunas = new String[]{"Data", "Hora Inicial", "Hora Final", "Transportadora", "Motorista", "Placa", "Veiculo", "Peso"};
    //Posição das colunas
    private static final int DATA = 0;
    private static final int HORAINICIAL = 1;
    private static final int HORAFINAL = 2;
    private static final int TRANSPORTADORA = 3;
    private static final int MOTORISTA = 4;
    private static final int PLACA = 5;
    private static final int VEICULO = 6;
    private static final int PESO = 7;

    // Cria um SocioTableModel sem nenhuma linha
    public CarregamentoTableModel() {
        linhas = new ArrayList<>();
    }

    public CarregamentoTableModel(List<Carregamento> listaDeCarragamentos) {
        linhas = new ArrayList<>(listaDeCarragamentos);
    }

    //O número de linhas da tabela é definido pelo número de elementos da lista de carregamentos. 
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    //Iremos aproveitar o array que criamos com os nomes das colunas para obter o número de colunas de nossa tabela.
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Mais uma vez usaremos o array com os nomes das colunas para retornar o nome referente ao índice passado por parâmetro. 
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    //Este método deve verificar o índice recebido por parâmetro e retornar o tipo de classe correspondente à coluna. 
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case DATA:
                return Date.class;
            case HORAINICIAL:
                return Date.class;
            case HORAFINAL:
                return Date.class;
            case TRANSPORTADORA:
                return String.class;
            case MOTORISTA:
                return String.class;
            case PLACA:
                return String.class;
            case VEICULO:
                return String.class;
            case PESO:
                return Float.class;
            default:
                // Não deve ocorrer, pois só existem essas colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    //A implementação deste método vai depender do critério utilizado para definir quais células são editáveis ou não. 
    //Neste primeiro momento vamos deixar o retorno sempre como false, assim nenhuma célula será editável.
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    //Aqui temos que retornar o conteúdo da célula especificada. 
    //Primeiro obtemos o sócio referente a linha e em seguida verificamos 
    //o índice da coluna para recuperar o campo correspondente.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Carregamento carregamento = linhas.get(rowIndex);
        switch (columnIndex) {
            case DATA:
                return carregamento.getData();
            case HORAINICIAL:
                return carregamento.getHoraInicial();
            case HORAFINAL:
                return carregamento.getHoraFinal();
            case TRANSPORTADORA:
                return carregamento.getTransportadora();
            case MOTORISTA:
                return carregamento.getMotorista();
            case PLACA:
                return carregamento.getPlaca();
            case VEICULO:
                return carregamento.getVeiculo().getNome();
            case PESO:
                return carregamento.getVeiculo().getPeso();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    //A implementação deste método possui uma estrutura parecida com a do getValueAt, 
    //porém devemos setar o valor do campo ao invés de retorná-lo. Além disso, 
    //precisamos dizer para a JTable que a célula em questão foi alterada, 
    //caso contrário o novo valor não será exibido na tela. 
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // Pega o carregamento referente a linha especificada.
        Carregamento carregamento = linhas.get(rowIndex);
        //Altera o valor setado
        switch (columnIndex) {
            case DATA:
                carregamento.setData((Date) aValue);
                break;
            case HORAINICIAL:
                carregamento.setHoraInicial((Date) aValue);
                break;
            case HORAFINAL:
                carregamento.setHoraFinal((Date) aValue);
                break;
            case TRANSPORTADORA:
                carregamento.setTransportadora((String) aValue);
                break;
            case MOTORISTA:
                carregamento.setMotorista((String) aValue);
                break;
            case PLACA:
                carregamento.setPlaca((String) aValue);
                break;
            case VEICULO:
                carregamento.getVeiculo().setNome((String) aValue);
                break;
            case PESO:
                carregamento.getVeiculo().setPeso((Float) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        //Notifica a mudança da tabela
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    //Retorna o carragemento da linha selecionada
    public Carregamento getCarregamento(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    //Adiciona o registro
    public void adicionarCarregamento(Carregamento carregamento) {
        //Adiciona a linha
        linhas.add(carregamento);
        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;
        //Notifica a mudança da tabela
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    //Remove uma linha especifica
    public void removeCarregamento(int indiceLinha) {
        //Remove a linha
        linhas.remove(indiceLinha);
        //Notifica a mudança da tabela
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    //Adiciona uma lista de sócios no final da lista
    public void addListaDeCarregamento(List<Carregamento> carregamentos) {
        // Pega o tamanho antigo da tabela, que servirá
        // como índice para o primeiro dos novos registros
        int indice = getRowCount();

        // Adiciona os registros.
        linhas.addAll(carregamentos);

        // Notifica a mudança.
        fireTableRowsInserted(indice, indice + carregamentos.size());
    }
    
    // Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
}