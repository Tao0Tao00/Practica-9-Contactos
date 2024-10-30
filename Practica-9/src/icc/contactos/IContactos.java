package icc.contactos;

public interface IContactos {
    /**Servira para insertar los datos del contacto
     * @param regi
     */
    public void insertContact(Registro regi);

    /**Servira para consultar y buscar los datos del contacto
     * @param nombre
     */
    public Registro consulta(String nombre);
}
