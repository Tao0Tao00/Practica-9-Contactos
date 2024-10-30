package icc.contactos;
import icc.util.IComparable;

public class Registro implements IComparable{
    private String nombre;
    private String direccion;
    private String telefono;

    /**Metodo constructor de los atributos
     * @param nombre
     * @param direccion
     * @param telefono
     */
    public Registro(String nombre, String direccion, String telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**Metodo getter para el nombre
     * @return el nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**Metodo setter para el nombre donde si no se asigna uno, sera null
     * @param nombre
     */
    public void setNombre(String nombre){
        if(nombre != null){
            this.nombre = "sin asignar";
        }else{
            this.nombre = nombre;
        }
    }

    /**Metodo getter para la direccion
     * @return la direccion
     */
    public String getdireccion(){
        return direccion;
    }

    /**Metodo setter para el direccion donde si no se asignaq un valor este sera null
     * @param direccion
     */
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = "sin asignar";
        }else{
            this.direccion = direccion;
        }
    }

    /**Metodo getter para el telefono
     * @return el telefono
     */
    public String getTelefono(){
        return telefono;
    }

    /**Metodo setter para el telefono donde si no se asignaq un valor este sera null
     * @param telefono
     */
    public void setTelefono(String telefono){
        if(telefono != null){
        this.telefono = "sin asignar";
        }else{
            this.telefono = telefono;
        }
    }

    /**Metodo toString para obtener la cadena de los datos del contacto para el registro
     * @return datos del contacto
     */
    @Override
    public String toString(){
        return "[Nombre: " + nombre + "  Direccion: " + direccion + "  Telefono: " + telefono + "]";
    }

    /**Metodo compareTo de la clase IComparable
     * @param o
     * @return resultado del compareTo
     */
    @Override
    public int comparaCon(Object o){
        return this.nombre.compareTo(((Registro)o).nombre);
    }

    public static void main(String[] args) {
        Registro prueba = new Registro("Pedro", "Iztapalapa", "+5564986723");
        System.out.println(prueba);
    }


}