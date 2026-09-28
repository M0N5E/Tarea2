/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import modulo.Inventario;


/**
 *
 * @author Monserrath
 */
public class Menu {
    
    private Inventario in = new Inventario();
    
    private int opcion;
    
    public void menuPrincipal() {

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                SISTEMA DE TIENDA
                                                                **********Menu**********
                                                                1.Registar producto
                                                                2.Mostrar productos
                                                                3.Buscar producto por código
                                                                4.Vender unidades
                                                                5.Reabastecer producto
                                                                6.Calcular valor total del inventario
                                                                7.Salir
                                                                ************************
                                                                """));
            switch (opcion) {
                case 1:
                    in.RegistarProducto();
                    break;
                case 2:
                    in.MostrarProducto();
                    break;
                case 3:
                    in.BuscarCodigo();
                    break;
                case 4:
                    in.VenderUnidades();
                    break;
                case 5:
                    in.ReabastecerProducto();
                    break;
                case 6:
                    in.ValorToInventraio();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");

            }//fin switch
        } while (opcion !=7);
    }
            
}
/*1. Registrar producto: Solicitar todos los datos y guardar el objeto en la siguiente posición disponible. No se
permiten códigos repetidos.
2. Mostrar productos: Recorrer únicamente las posiciones ocupadas y mostrar los datos de cada producto.
3. Buscar producto por código: Solicitar un código, realizar una búsqueda lineal y mostrar el producto
encontrado o un mensaje si no existe.
4. Vender unidades: Buscar el producto y disminuir sus existencias. La venta solo se realiza si hay suficientes
unidades.
5. Reabastecer producto: Buscar el producto y aumentar la cantidad disponible. La cantidad ingresada debe
ser mayor que cero.
6. Calcular valor total del inventario: Sumar precio por cantidad disponible de todos los productos
registrados y mostrar el total con dos decimales.
7. Salir: Finalizar el programa mediante una opción válida del menú.*/