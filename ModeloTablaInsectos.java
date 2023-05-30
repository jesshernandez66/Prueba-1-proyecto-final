package org.example.modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;


//IMplementamos tableModel
public class ModeloTablaInsectos implements TableModel {
    //Hacemos un arraylist que contenga elementos del tipo insecto, llamados datos
    private ArrayList<Insectos> datos;
//Constructor por defecto inicializado
    public static final int COLS = 6;
    public ModeloTablaInsectos() {
        datos = new ArrayList<>();
    }
    //Constructor sobrecargado ya instanciadoy con datos
    public ModeloTablaInsectos(ArrayList<Insectos> datos) {
        this.datos = datos;
    }
//get row count lo necesita la vista para saber cuantos elementos o lineas va a pintar
    @Override
    public int getRowCount() {
        //Obtendra la info de datos.size
        return datos.size();
    }
//get column count lo necesita la vista para saber cuantas columnas va a reservar para enseñar la info
    @Override
    public int getColumnCount() {
        //Haremos una constante COLS que muestre nuestras 6 columnas
        return COLS;

    }
//Column name es para saber los nombres de cada elemento en cada titulo de las columnas
    @Override
    public String getColumnName(int columnIndex) {
        String nombreCol = " ";
        switch (columnIndex) {
            case 0:
                nombreCol= "ID";
                break;
            case 0:
                nombreCol= "Nombre";
                break;
            case 0:
                nombreCol= "Tipo";
                break;
            case 0:
                nombreCol= "Tamaño en cm";
                break;
            case 0:
                nombreCol= "Alimentación";
                break;
            case 0:
                nombreCol= "Foto";
                break;
            default:
                nombreCol = "";

        }

        //Si el string no capta nada, va a regresar una cadena vacía
        return nombreCol;
    }

    //get column class sirve para saber de que tipo será cada columna y así pintarlas
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 0:
                return String.class;
            case 0:
               return String.class;
            case 0:
                return Double.class;
            case 0:
                return String.class;
            case 0:
                nombreCol= "Foto"; //WTFFFF tengo q ver q pedo
                break;
            default:
                return String.class;
    }
}
//Sirve para saber si podremos editar las celdas
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //con true diremos que si son editables
        return true;
    }
//daremos valor en cada posición (X,Y)
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Con lo siguiente obtendremos un objeto que esté en la posición que nos estén mandando
        Insectos tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.get
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
