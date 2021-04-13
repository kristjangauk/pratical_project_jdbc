package UseClassObjects;

public class Demand {
    String custName, product;
    int qty;

    public Demand(String custName, String product, int qty) {
        this.custName = custName;
        this.product = product;
        this.qty = qty;
    }

    public int calculatePayment(int rate){
        int amount = qty * rate;
        return amount;
    }
}
