package Lab01;

public class ImportedProduct extends Product{
    private double importTaxRate;
    private double shippingFee;

    public double getImportTaxRate() {
        return importTaxRate;
    }

    public void setImportTaxRate(double importTaxRate) {
        if(importTaxRate >= 2 || importTaxRate < 0){
            throw new IllegalArgumentException("Import tax must be from 0 to 1");
        }
        this.importTaxRate = importTaxRate;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(double shippingFee) {
        if(shippingFee < 0){
            throw new IllegalArgumentException("Shipping fee must not be a negative number!");
        }
        this.shippingFee = shippingFee;
    }

    public ImportedProduct(String iD, String name, double basePrice, double importTaxRate, double shippingFee) {
    super(iD, name, basePrice);
    setImportTaxRate(importTaxRate);
    setShippingFee(shippingFee);
}

    public ImportedProduct(){}

    @Override
    public double finalPrice() {
        return getBasePrice() + getBasePrice() * importTaxRate + shippingFee;
    }

    @Override
    public void printProduct(){
        super.printProduct();
        System.out.println("Importation tax rate: " + this.importTaxRate);
        System.out.println("Shipping Fee: " + this.shippingFee);
        System.out.println("Final Price: "+ finalPrice());
    }
}
