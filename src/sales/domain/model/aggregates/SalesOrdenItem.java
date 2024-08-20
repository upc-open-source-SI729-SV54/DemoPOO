package sales.domain.model.aggregates;

import java.util.UUID;

public class SalesOrdenItem {

    private final UUID itemId;
    private final String productName;
    private final int quantity;
    private final double unitPrice;
    private boolean dispatched;

    public SalesOrdenItem(String productName, int quantity, double unitPrice) {
        this.itemId = UUID.randomUUID();
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.dispatched = false;
    }

    public void dispach() {
        this.dispatched = true;
    }

    public boolean isDispatched() {
        return dispatched;
    }

    public double calculatedItemPrice() {
        return quantity * unitPrice;
    }
}
