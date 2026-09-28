/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author Monserrath
 */
public class Principal {

    public static void main(String[] args) {
        Menu m= new Menu();
        m.menuPrincipal();
    }
}
/*Una pequeña tienda necesita controlar hasta 10 productos. De cada producto se conoce su código, nombre, precio
y cantidad disponible. El programa debe permitir registrar productos, consultar la información almacenada y
actualizar las existencias mediante un menú de opciones.

ATRIBUTOS DE LA CLASE PRODUCTO
• int codigo
• String nombre
• double precio
• int cantidadDisponible
Los atributos deben ser privados. 
La clase debe incluir un constructor vacío, un constructor con parámetros y los
métodos get y set correspondientes.

OPCIONES OBLIGATORIAS DEL MENÚ
1. Registrar producto: Solicitar todos los datos y guardar el objeto en la siguiente posición disponible. No se
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
7. Salir: Finalizar el programa mediante una opción válida del menú.

REGLAS DE FUNCIONAMIENTO:
• La variable cantidad debe indicar cuántas posiciones del arreglo están ocupadas.
• El registro debe impedir que se exceda la capacidad de 10 productos.
• El código y la cantidad disponible deben ser números enteros positivos. El precio debe ser mayor que
cero.
• Las búsquedas deben realizarse mediante un recorrido del arreglo.
• No se debe crear un arreglo nuevo dentro de cada método.
• La clase Principal solamente inicia el programa. No debe contener el menú ni la lógica del inventario.
• Los mensajes y nombres utilizados en el programa deben ser claros y coherentes.

MÉTODOS MÍNIMOS SUGERIDOS PARA INVENTARIO
Cada método debe conservar una sola responsabilidad.
• registrarProducto()
• mostrarProductos()
• buscarProducto()
• venderUnidades()
• reabastecerProducto()

DATOS INICIALES DE PRUEBA
Antes de entregar, pruebe el sistema como mínimo con los siguientes casos:
• Registrar tres productos diferentes.
• Buscar un código registrado y otro que no exista.
• Intentar vender más unidades de las disponibles.*/