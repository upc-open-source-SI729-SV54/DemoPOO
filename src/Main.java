import sales.domain.model.aggregates.SalesOrdenItem;
import sales.domain.model.aggregates.SalesOrder;
import shared.Address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Open source welcome!");
        System.out.println("##########################");
        System.out.println("### Datos del cliente ##");
        System.out.println("Ingrese su nombre: ");
        String firstName = scanner.nextLine();

        System.out.println("Ingrese su Apellido");
        String lastName = scanner.nextLine();

        System.out.println("### datos del producto ###");
        System.out.println("Ingrese el producto");
        String productName = scanner.nextLine();

        System.out.println("Ingrese el precio del producto");
        double unitPrice = Double.parseDouble(scanner.nextLine()); //pasar lo que recibe a double

        System.out.println("Ingrese la cantidad del producto");
        int quantity = Integer.parseInt(scanner.nextLine()); // pasar lo que recibe a integer

        Address shippedAddress = new Address();
        SalesOrder salesOrder = new SalesOrder(shippedAddress, firstName);

        salesOrder.addItem(quantity, unitPrice, productName);

        double total = salesOrder.calculateTotal();

        System.out.println("La Orden de Compra es: " + salesOrder.getSalesOrderId());
        System.out.println("EL Cliente es: " + salesOrder.getCustomerName());
        System.out.println("El Total de la comprar es: " + total);


    }
}