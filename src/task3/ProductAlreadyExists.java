package task3;

class ProductAlreadyExists extends Exception {
    public ProductAlreadyExists(String message){
        System.out.println(message);
    }
}
