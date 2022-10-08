public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"lAPTOP","ASUS",3000,5,"mavi");
//        product.setName("Laptop");
//        product.id = 1;
//        product.setDescription("Asus Laptop");
//        product.setStockAmount(3);
//        product.setPrice(12500);
//        product.setRenk("mavi");


        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());
        //  System.out.println(product.name);

        product.getId();

    }
}