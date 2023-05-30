package org.example.modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

//Voy a implementar table model
public class ModeloTablaInsecto implements TableModel {
    //Definiendo un arraylist que contenga objetos de tipo insecto
    private ArrayList<Insectos> datos;
    public static final int COLS = 6;

    //Creando constructor por defecto, instanciando el objeto, inicializandolo
    public ModeloTablaInsecto() {
        datos = new ArrayList<>();
    }

    public ModeloTablaInsecto(ArrayList<Insectos> datos) {
        this.datos = datos;
    }

    //El RowCount lo necesita la vista para saber cuantos elementos va a pintar
    @Override
    public int getRowCount() {
        //con datos.size le estamos diciendo cuántos
        return datos.size();
    }

    //get column count lo necesita la tabla para saber cuantas columnas reservar
    @Override
    public int getColumnCount() {
        //En este caso 6, pero vamos a ponerlo en una constante
        return COLS;
    }

    //el gett column name es para que la tabla sepa los nombres de cada columna, cómo un titulo
    @Override
    public String getColumnName(int columnIndex) {
        //Haremos un caso swich, y si este no capta nada, devolverá una cadena vacía " "
        String nombreCol = " ";
        switch (columnIndex) {
            case 0:
                nombreCol = "ID";
                break;
            case 1:
                nombreCol = "Nombre";
                break;
            case 2:
                nombreCol = "Tipo o especie";
                break;
            case 3:
                nombreCol = "Tamaño en cm";
                break;
            case 4:
                nombreCol = "Alimentación";
                break;
            case 5:
                nombreCol = "Foto"; //WTFFFFFF
                break;
            default:
                nombreCol = " ";

        }
        return nombreCol;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        //Necesita saber qué tipo de dato va a recibir
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            //FOTOOOOO
            default:
                return String.class;
        }
    }

//Aqui vamos a definir si nuestras celdas serán editables
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Al poner true decimos que todas las celdas son editables
        return true;
    }
//aqui establecemos valores en determinados lugares (x,y)
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Con lo siguiente obtenemos el objeto que está en la posición que nos están pidiendo
        Insectos tmp= datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.get();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
