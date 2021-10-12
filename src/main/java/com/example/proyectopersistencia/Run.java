package com.example.proyectopersistencia;

import logica.*;

import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;

public class Run {

    private ManegementProducto mngProducto;
    private ManegementDomiciliario mngDomiciliario;
    private ManegementGestion mngGestion;

    public Run(){
        mngProducto = new ManegementProducto();
        mngDomiciliario = new ManegementDomiciliario();
        mngGestion = new ManegementGestion();
    }
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
       // myRun.main();
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
            String id = JOptionPane.showInputDialog("id");
            String nombre = JOptionPane.showInputDialog("Nombre");
            String

            mngDomiciliario.addDomiciliario( new Domiciliario( id,nombre) );
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
            String productos = JOptionPane.showInputDialog("Productos");
            double valorPedido = Double.parseDouble(JOptionPane.showInputDialog("Valor Pedido"));

            mngGestion.addGestion( new Gestion( numPedido,nombreUsusario,direccion,
                    nombreDomiciliario,productos,telefono,valorPedido,fecha) );

            JOptionPane.showMessageDialog(null,"Hecho","OK",JOptionPane.INFORMATION_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null,"No se Puede ya Existe","ERROR",JOptionPane.ERROR_MESSAGE);
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
    public void liquidacion(){

    }

    /**Modificar Datos de un producto*/
    public void cambiarDatosProductos(){
        String codigo = JOptionPane.showInputDialog("Codigo");
        if( mngProducto.findProducto( codigo ) == null ){

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
                JOptionPane.showMessageDialog(null,"Error al Grabar","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            System.exit(0);
        }
    }

}
