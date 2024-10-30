package icc.util;

public class ListaSL {
    private Nodo cabeza;

    public ListaSL(){
        this.cabeza = null;
    }

    /**Metodo getter para la cabeza usando la clase Nodo
     * @return la cabeza
     */
    public Nodo getCabeza(){
        return cabeza;
    }

    /**Metodo setter para la cabeza
     * @param cabeza
     */
    public void setCabeza(Nodo cabeza){
        this.cabeza = cabeza;
    }

    /**Metodo toSting para la cadena de la cabeza donde regresa los nodos de la lista
     * @return se salta la linea si es vacia la lista
     *         si no es una lista vacia, regresa los nodos de esta
     */
    @Override
    public  String toString(){
        if(cabeza == null){
            return "\n";
        }

        StringBuilder a = new StringBuilder();
        Nodo actual = cabeza;
        while(actual != null){
            a.append(actual.dato.toString());
            if(actual.nuevaref != null){
                a.append(" ");
            }
        } 
        return a.toString();
    }

    /**Metodo compareTo para ordenar la lista
     * @param p elemento de la lista
    */
    public void inserta(IComparable p){
        Nodo newNodo = new Nodo(p, null);

        if (cabeza == null){
            cabeza = newNodo;
            return;
        }

        if (p.comparaCon(cabeza.getDato()) < 0){
            newNodo.setNuevaRef(cabeza);
            cabeza = newNodo;
            return;
        }

        Nodo actual = cabeza;
        while(actual.getNuevaRef() != null && p.comparaCon(actual.getNuevaRef().getDato()) > 0){
            actual = actual.getNuevaRef();
        }

        newNodo.setNuevaRef(actual.getNuevaRef());
        actual.setNuevaRef(newNodo);
    }
}