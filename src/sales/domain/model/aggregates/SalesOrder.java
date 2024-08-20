package sales.domain.model.aggregates;

import shared.Address;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SalesOrder {
    private final UUID salesOrderId;
    private final Address shippingAddress;
    private SalesOrderStatus status;
    private List<SalesOrdenItem> items;
    private String customerName;

    public SalesOrder(Address shippingAddress, String customerName) {
        this.salesOrderId = UUID.randomUUID();
        this.shippingAddress = shippingAddress;
        this.customerName = customerName;
        this.status = SalesOrderStatus.CREATED;
        this.items = new ArrayList<>();
    }

    public void addItem(int quantity, double unitPrice, String productName) {
        items.add(new SalesOrdenItem(productName, quantity, unitPrice));
    }

    public void confirm() {
        this.status = SalesOrderStatus.APPROVED;
    }

    public void cancel() {
        this.status = SalesOrderStatus.CANCELLED;
    }

    public void dispatch() {
        this.status = SalesOrderStatus.SHIPPED;
        items.forEach(SalesOrdenItem::dispach); // para cada objeto ejecuta el metodo dispach
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(SalesOrdenItem::calculatedItemPrice).sum();
    }

    public boolean isDispatched() {
        return items.stream().allMatch(SalesOrdenItem::isDispatched); // verifica si todos los items son despachado todos son true
        // retorna true si uno falla retorna false (operador: and)
    }

    /*
    public void dispatch () {
        items.forEach(salesOrdenItem -> dispatch); Ests expresion lambda hará que se llame de forma recursiva infinita
    }
    */

    // getters


    public UUID getSalesOrderId() {
        return salesOrderId;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public SalesOrderStatus getStatus() {
        return status;
    }

    public List<SalesOrdenItem> getItems() {
        return items;
    }

    public String getCustomerName() {
        return customerName;
    }
}
