import java.util.Arrays;
import java.util.Comparator;
public class ecommerce {
    static class Product {
        int productId;
        String productName;
        String category;
        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
        public String toString() {
            return "[" + productId + ", " + productName + ", " + category + "]";
        }
    }
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String name) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) {
                return products[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Bag", "Bags"),
            new Product(105, "Laptop", "Electronics")
        };
        String searchName = "Watch";
        Product result1 = linearSearch(products, searchName);
        if (result1 != null) {
            System.out.println("result: " + result1);
        } else {
            System.out.println("Products not found");
        }  
        Product result2 = binarySearch(products, searchName);
        if (result2 != null) {
            System.out.println("result: " + result2);
        } else {
            System.out.println(" Product not found");
        }
    }
}

    
