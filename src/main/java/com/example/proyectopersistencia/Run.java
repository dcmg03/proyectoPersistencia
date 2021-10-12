package com.example.proyectopersistencia;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de la parte logica funcional del proyecto
 tiene los metodos para añadir, mostrar, listar, liquidar,
 modificar, salir*/
import logica.*;
import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Run {

    private ManegementProducto mngProducto;
    private ManegementDomiciliario mngDomiciliario;
    private ManegementGestion mngGestion;
    /**Contructor de la clase Run*/
    public Run(){
        mngProducto = new ManegementProducto();
        mngDomiciliario = new ManegementDomiciliario();
        mngGestion = new ManegementGestion();
    }
    /**metodo main para la ejecucion*/
    public static void main(String[] args) {
        Run myRun = new Run();

        try {
            ManegementProducto aux = myRun.mngProducto.read("resources/files/","Productos.json");
            ManegementDomiciliario aux2 = myRun.mngDomiciliario.read("resources/files/", "Domiciliarios.json");
            ManegementGestion aux3 = myRun.mngGestion.read("resources/files/", "Gestion.json");
            if( aux != null ){
                myRun.mngProducto = aux;
                myRun.mngDomiciliario = aux2;
                myRun.mngGestion = aux3;
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error en el Archivo","ERROR",JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error la Clase","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    /**Metodo para añadir un nuevo producto*/
    public void addProducto() {
        String codigo = JOptionPane.showInputDialog("Codigo");
        if( mngProducto.findProducto( codigo ) == null ){
            String producto = JOptionPane.showInputDialog("Producto");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
            mngProducto.addProducto( new Producto( codigo,producto, valor ) );
            /**Añadido correctamente*/
        }else{
            /**No se puede ya existe producto*/
        }
    }

    /**Metodo para añadir un nuevo Domiciliario*/
    public void addDomiciliario() {
        String id = JOptionPane.showInputDialog("id");
        if( mngDomiciliario.findDomiciliario( id ) == null ){
            int pedidos = Integer.parseInt(JOptionPane.showInputDialog("Pedidos"));
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
            mngDomiciliario.addDomiciliario( new Domiciliario( id,nombre,pedidos,salario) );
            /**Añadido correctamente*/
        }else{
            /**No se puede ya existe domiciliario*/
        }
    }
    /**Metodo para añadir un nuevo pedido*/
    public void addGestion() {
        String numPedido = JOptionPane.showInputDialog("NumPedido");
        if( mngGestion.findGestion( numPedido ) == null ){
            LocalDate fecha = LocalDate.parse(JOptionPane.showInputDialog("Fecha"));
            String nombreUsusario = JOptionPane.showInputDialog("Nombre Usuario");
            String direccion = JOptionPane.showInputDialog("Direccion");
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Telefono"));
            String nombreDomiciliario = JOptionPane.showInputDialog("Nombre Domiciliario");
            ArrayList<Object> pedido = JOptionPane.showInputDialog("Pedido");
            float valorPedido = Float.parseFloat(JOptionPane.showInputDialog("Valor Pedido"));

            mngGestion.addGestion( new Gestion( numPedido,nombreUsusario,direccion,
                    nombreDomiciliario,pedido,telefono,valorPedido,fecha) );

            /**Añadido correctamente*/
        }else{
            /**No se puede ya existe domiciliario*/
        }
    }

    /**metodo para listar los productos*/
    public void listProductos() {
        mngProducto.getProductos().forEach( System.out::println);
    }
    /**metodo para listar los Domiciliarios
     * @return*/
    public Object listDomiciliario(){

      return mngDomiciliario.toString();
        //return mngDomiciliario.getDomiciliarios().forEach(System.out::println);
    }
    /**metodo para listar la gestion*/
    public void listGestion(){
        mngGestion.getGestions().forEach(System.out::println);
    }

    /**Liquidacion Domiciliarios*/
    private void liquidacion(float valorPedido) {
        /**digita el id del domiciliario para buscarlo*/
        String id = JOptionPane.showInputDialog("id");
        if (mngDomiciliario.findDomiciliario(id) == null) {
            if (mngDomiciliario.findDomiciliario(id).isBono() == true) {
                float costo = (valorPedido * 30) / 100;
                float sueldoDomi = (costo * 20) / 100;
                float sueldoEstablecimiento = (costo * 10) / 100;
                /**Sueldo de un domiciliario con mas pedidos*/
                float sueldo = (float) (sueldoDomi + 20.000);
            } else {
                float costo = (valorPedido * 30) / 100;
                float sueldoDomi = (costo * 20) / 100;
                float sueldoEstablecimiento = (costo * 10) / 100;
            }
        }
    }

    /**Modificar Datos de un producto*/
    public void cambiarDatosProductos(){
        String codigo = JOptionPane.showInputDialog("Codigo");
        if( mngProducto.findProducto( codigo ) == null ){
            //mngProducto.findProducto(codigo).setProducto(ingresa lo q usuario modifico del nombre del producto);
            //mngProducto.findProducto(codigo).setValor(ingresa lo q usuario modifico del valor);
        }else{
            /**producto no encontrado*/
        }
    }

    /**Modificar Datos de un Domiciliario*/
    private void cambiarDatosDomiciliario(){
        /**digita el id del domiciliario para buscarlo*/
        String id = JOptionPane.showInputDialog("id");
        if( mngDomiciliario.findDomiciliario( id ) == null ){
            //mngDomiciliario.findDomiciliario(id).setNombre(ingresa lo q usuario modifico del nombre);
            //mngDomiciliario.findDomiciliario(id).setNumPedidos(ingresa lo q usuario modifico de num pedidos);
            //mngDomiciliario.findDomiciliario(id).setBono(ingresa lo q el usuario modifico del bono);
        }else{
            /**producto no encontrado*/
        }
    }

    /**Salir y guardar cambios en el .json*/
    public void exit() {
        int exit = JOptionPane.showConfirmDialog(null,"Esta segur@ que desea cerrar el programa","Salir",JOptionPane.YES_NO_OPTION);
        if( exit == JOptionPane.YES_OPTION ){
            try {
                mngProducto.write("resources/files/","Productos.json");
                mngDomiciliario.write("resources/file/", "Domiciliarios.json");
                mngGestion.write("resources/file/", "Gestion.json");
            } catch (IOException e) {
                /**Error al grabar datos*/
            }
            System.exit(0);
        }
    }

}
