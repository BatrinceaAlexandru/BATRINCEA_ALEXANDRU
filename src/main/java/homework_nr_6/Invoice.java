package homework_nr_6;

public class Invoice {

    String model;
    String aboutProduct;
    int numberOfProducts;
    double priceOfProduct;

    public Invoice(String model, String aboutProduct, int numberOfProducts, double priceOfProduct) {
        this.model = model;
        this.aboutProduct = aboutProduct;
        this.numberOfProducts = numberOfProducts;
        this.priceOfProduct = priceOfProduct;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAboutProduct() {
        return aboutProduct;
    }

    public void setAboutProduct(String aboutProduct) {
        this.aboutProduct = aboutProduct;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    double finalPrice;

     public void getAmount() {
        if (priceOfProduct > 0 && numberOfProducts > 0) {
            finalPrice = numberOfProducts * priceOfProduct;
        } else {
            finalPrice = 0;
        }
        System.out.println(finalPrice);
    }
}
