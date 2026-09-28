/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Monserrath
 */
public class Inventario {
    
    private Producto[] producto = new Producto[10];
    
    private int cantidad = 0;
    
    public void RegistarProducto(){
        cantidad = 0;

        for (int i = 0; i <producto.length; i++){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto"));
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del produto"));
            int cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la canridad disponible"));
           
            producto[i] = new Producto( codigo, nombre, precio, cantidadDisponible);
            
            cantidad++;
            

        }
    }
    public void MostrarProducto(){
        for(int i = 0; i < producto.length; i++){
            if (producto[i] != null){
                producto[i].informacionProducto();
            }else {
            JOptionPane.showMessageDialog(null, "No hay un producto en la posición " + i);
        }
        }
    }
    public void BuscarCodigo(){
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código a buscar:"));

        if (cod == -1) {
            JOptionPane.showMessageDialog(null, "El código debe ser ingresado");
        }//Fin de If.

        int fila = -1;

        for (int i = 0; i < producto.length; i++) {
                if (producto[i] != null && producto[i].getCodigo() == cod) {
                    fila = i;
                    break;
                }
        }

        if (fila != -1) {
            JOptionPane.showMessageDialog(null, "El código " + cod + " se encontró en la posición ["+ fila);
        } else {
            JOptionPane.showMessageDialog(null, "El código " + cod + " no existe en el arreglo.");
        }
    }

    public void VenderUnidades(){
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código a buscar:"));

        if (cod == -1) {
            JOptionPane.showMessageDialog(null, "El código debe ser ingresado");
        }
        int compra = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas veces desea comprar?"));
        int fila = -1;

        for (int i = 0; i < producto.length; i++) {
                if (producto[i] != null && producto[i].getCodigo() == cod) {
                    fila = i;
                    break;
                    
                }
                if (producto[i].getCantidadDisponible() >= 0) {
                    int valorActual = producto[i].getCantidadDisponible();
                    producto[i].setCantidadDisponible(valorActual - compra);
                    JOptionPane.showMessageDialog(null, "Se ha comprado.");

                } else {
                    JOptionPane.showMessageDialog(null, "No se logró comprar.");
                    
                }
        }
    }
    
    public void ReabastecerProducto(){
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto a reabastecer:"));

        if (cod == -1) {
            JOptionPane.showMessageDialog(null, "El código debe ser ingresado");
        }
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas veces desea reabastecer?"));
        int fila = -1;

        for (int i = 0; i < producto.length; i++) {
                if (producto[i] != null && producto[i].getCodigo() == cod) {
                    fila = i;
                    break;
                }//Fin método if.
                if (producto[i].getCantidadDisponible() >= 0) {
                    int valorActual = producto[i].getCantidadDisponible();
                    producto[i].setCantidadDisponible(valorActual + incremento);
                    JOptionPane.showMessageDialog(null, "Se rebastecio.");

                } else {
                    JOptionPane.showMessageDialog(null, "No se logró reabastecer.");
                    
                }
        }
    }
    
    public void ValorToInventraio(){
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto que desea saber su valor total"));

        for (int i = 0; i < producto.length; i++) {
                if (producto[i].getCantidadDisponible() >= 0) {
                    double sumaDeTodo = producto[i].getPrecio();
                    int valorActual = producto[i].getCantidadDisponible();
                    double total = sumaDeTodo * valorActual;
                    JOptionPane.showMessageDialog(null,"Esta es la suma total de todos los productos:"+total);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se logró obtener el total.");

                }
        }
    }
    
}//fin clase
    /*registrarProducto()
• mostrarProductos()
• buscarProducto()
• venderUnidades()
• reabastecerProducto()*/