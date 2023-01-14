package HomeWork1;

public class Main {
    public static void main(String[] args) {
       VendingMachine vendingMachine = new VendingMachine();
       vendingMachine.addProduct(new Product("Яблоко", 10));
        vendingMachine.addProduct(new Product("Груша", 20));
        vendingMachine.addProduct(new Product("Яблоко1", 10));
        vendingMachine.addProduct(new Baton("Батончик Марс", 10, 10.4324324234234));
        vendingMachine.addProduct(new SuperBaton("БОЛЬШОЙ Батончик Марс", 10, 15, TypeSize.BIG));
        vendingMachine.addProduct(new Milk(10));
        vendingMachine.addProduct(new Chocolate("Шоколад со зведочками", 10));
        for(Product product : vendingMachine.getProductList()) {
            System.out.println(product);
        }
    }


}
