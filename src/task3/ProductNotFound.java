package task3;

class ProductNotFound extends RuntimeException {
    public ProductNotFound(String message) {
        System.out.println(message);
    }
}
