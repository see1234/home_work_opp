package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

   private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }
    public Product getProductByName(String name) {
        for(Product product : productList) {
            if(product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }
    public void addProduct(Product product) {
        productList.add(product);
    }
    public Product getProductByCost(double cost) {
        for(Product product : productList) {
            if(product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }

    public VendingMachine() {
        this.productList = new ArrayList<Product>();
    }
}
