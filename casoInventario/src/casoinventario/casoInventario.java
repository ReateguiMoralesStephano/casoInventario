import java.util.Scanner;

public class casoInventario {
    public static void main(String[] args) {
//entrada de datos

        Scanner scanner = new Scanner(System.in);
        String nomprodu = "";
        int inventario;
        int categoria;
        double montotal;
        double precioprodu;
        System.out.println("nombre del producto: ");
        nomprodu = scanner.nextLine();
        System.out.println("cantidad en inventario: ");
        inventario = scanner.nextInt();
        System.out.println("precio del producto: ");
        precioprodu = scanner.nextDouble();
        System.out.println("tipo de producto: ");
        System.out.println("1: Productos electrónicos");
        System.out.println("2: Alimentos");
        System.out.println("3: Ropa");
        categoria = scanner.nextInt();

        //Salida de datos
        System.out.println("Resumen del inventario ");
        System.out.println("Producto: " + nomprodu);
        System.out.println("Cantidad: " + inventario);
        System.out.println("Precio unitario del producto: " + precioprodu);
        //calculo inicial

        montotal = (inventario * precioprodu);
        System.out.println("monto total antes de los descuentos: " + montotal);

        //requisitos para descuentos de monto mayor a 50
        if (inventario > 50) {
            montotal = (montotal - ((inventario * precioprodu) * 0.1));
            System.out.println("se aplico un descuento del 10%");
        } else if (inventario > 100) {
            montotal = (montotal - ((inventario * precioprodu) * 0.2));
            System.out.println("se aplico un descuento del 20%");
        } else if (inventario <= 50) {
            System.out.println("no cumple con los requisitos para el descuento");
        }


        //clasificacion de productos
        switch (categoria) {
            case 1:
                System.out.println("Producto electrónico. Revisar garantía.");
                break;
            case 2:
                System.out.println("Producto alimenticio. Revisar fecha de caducidad.");
                break;
            case 3:
                System.out.println("Producto de ropa. Revisar tallas disponibles.");
                break;

        }
        // salida de datos


        System.out.println("Precio final " + montotal);
        if (montotal > 500) {
            System.out.println("Atención: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
    }
}