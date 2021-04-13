package UseClassObjects;

public class Supply {
    String supplierName,product;
    int rate;

    public Supply(String supplierName, String product, int rate) {
        this.supplierName = supplierName;
        this.product = product;
        this.rate = rate;
    }

    public void sayThankYou(String costumer) {
        System.out.println("Thank You, " + costumer + " for your business");
    }
}
