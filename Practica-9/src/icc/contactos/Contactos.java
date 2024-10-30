package icc.contactos;
import icc.util.ListaSL;
import icc.util.Nodo;

public class Contactos {
    public ListaSL listaDeContactos;

    public Contactos(){
        listaDeContactos = new ListaSL();
    }

    /**Metodo para insertar contactos a la lista
     * @param regi
     */
    public void insertContact(Registro regi){
        listaDeContactos.inserta(regi);
    }

    /**Metodo para imprimir los contactos */
    public void imprimeCont(){
        Nodo actual = listaDeContactos.getCabeza();

        if(actual == null){
            System.out.println("No hay contactos que se puedan mostrar");
            return;
        }

        while (actual != null){
            System.out.println(((Registro)actual.getDato()).toString());
            actual = actual.getNuevaRef();
        }
    }

    /**Metodo para consultar la lista de contactos y buscarlo
     * @param nombre
     * @return tomando registro se buscara los datos del primer contacto que se escriba deacuerdo al parametro nombre
    */
    public Registro consulta(String nombre){
        Nodo actual = listaDeContactos.getCabeza();
        while(actual != null){
            Registro regi = (Registro) actual.getDato();
            if(regi.getNombre().contains(nombre)){
                return regi;
            }
            actual = actual.getNuevaRef();
        }
        return null;
    }

    
}
