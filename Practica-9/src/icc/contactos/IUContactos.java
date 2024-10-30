package icc.contactos;
import java.util.Scanner;

public class IUContactos {
    private Scanner scanner;
    private Contactos contactos;

    public IUContactos(){
        scanner = new Scanner(System.in);
        contactos = new Contactos();
    }

    /**Metodo para leer el entero que escriba el usuario, donde la opcion mas pequeña es 1
     * @param mensaje
     * @return numero seleccionado dentro de los valores validos, si no se pedira que escriba uno valido
     */
    private int leeEntero(String mensaje){
        System.out.println("m\n" + //
                        "    ensaje");
        boolean error = false;
        int num = -1;
        try{
            num = Integer.parseInt(scanner.nextLine());
            if(num <= 0){
                error = true;
                System.out.println("El valor mas chico es uno");
            } 
        } catch (NumberFormatException nfe){
            error = true;
            System.out.println("Ingresa un numero valido");
        }
        if(error){
            num = leeEntero(mensaje);
        }
        return num;
    }

    /**Metodo para obtener los datos de algun nuevo contacto
     * @return los datos del nuevo contacto
     */
    private Registro solicitaDatosDeCont(){
        System.out.println("Ingresa los datos del nuevo contacto");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Direccion: ");
        String direccion = scanner.nextLine();
        System.out.println("Telefono: ");
        String telefono = scanner.nextLine();
        Registro nuevo = new Registro(nombre, direccion, telefono);
        return nuevo;
    }

    /**Metodo con las distintas opciones */
    private void imprMenu(){
        System.out.println("Opciones");
        System.out.println("1) Agregar contacto");
        System.out.println("2) Buscar contacto");
        System.out.println("3) Imprimir la lista de contactos");
        System.out.println("4) Salir");
    }

    /**Metodo para correr el menu y se muestre en la terminal tomando los anteriores metodos de esta clase para
     * su correcto funcionamiento
     */
    public void runMenu(){
        System.out.println("--------------------------");
        System.out.println("--- Lista de contactos ---");
        System.out.println("--------------------------");
        boolean continuar = true;
        while(continuar){
            imprMenu();
            int opciones = leeEntero("Favor de seleccionar una opcion");
            switch(opciones){
            case 1:
                Registro regi = solicitaDatosDeCont();
                contactos.insertContact(regi);
                break;
            case 2: 
                System.out.println("Escribe el nombre del contacto que buscas: ");
                String nom = scanner.nextLine();
                Registro regis = contactos.consulta(nom);
                if(regis == null){
                    System.out.println("No se encontro ningun registro con el nombre: " + nom);
                } else {
                    System.out.println("Se encontro a :");
                    System.out.println(regis.toString());
                }
                break;
            case 3:
                contactos.imprimeCont();
                break;
            case 4: 
                continuar = false;
                break;
            default:
                System.out.println("Opcion no valida, favor de seleccionar una opcion valida.");
            }
        }
    }

    /**Metodo main para el programa */
    public static void main(String[] args) {
        IUContactos interfazNueva = new IUContactos();
        interfazNueva.runMenu();
    }
}
