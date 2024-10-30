package icc.util;

public class Nodo{
    IComparable dato;
    Nodo nuevaref;

    /**COnstructor del nodo
     * @param dato
     * @param nuevaref
     */
    public Nodo(IComparable dato, Nodo nuevaref ){
        this. dato = dato;
        this. nuevaref = nuevaref;
    }

    /**Metodo getter para dato
     * @return el dato
     */
    public IComparable getDato(){
        return dato;
    }

    /**Metodo setter para el dato
     * @param dato
     */
    public void setDato(IComparable dato){
            this.dato = dato;
        
    }

    /**Metodo getter para nuevaref
     * @return la nuevaref
     */
    public Nodo getNuevaRef(){
        return nuevaref;
    }

    /**Metodo setter para la nuevaraf
     * @param nuevaref
     */
    public void setNuevaRef(Nodo nuevaref){
            this.nuevaref = nuevaref;
    }
    
}
