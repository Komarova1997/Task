package task3;

public class Main {

    public static void main(String[] args){
        Product name1 = new Product(1, "Bread", 100, 354);
        Product name2 = new Product(2, "Milk", 70 , 77);
        Product name3 = new Product(3, "Sweets", 200, 500);
        Product name4 = new Product(4, "Tomato", 666, 50);
        Product name5 = new Product(5, "Potato", 100, 100);
        ProductCatalog catalog = new ProductCatalog();
        try {
            catalog.createProduct(name1);
            catalog.createProduct(name2);
            catalog.createProduct(name3);
            catalog.createProduct(name4);
            catalog.createProduct(name5);
        } catch (ProductAlreadyExists productAlreadyExists) {
            productAlreadyExists.printStackTrace();
        }
        for (Product product: catalog.getAllProducts()){
            product.productInformation();
            System.out.println();
        }

    }
}
