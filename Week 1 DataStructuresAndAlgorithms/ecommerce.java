// import java.util.Arrays;
// import java.util.Comparator;
// public class ecommerce {
//     static class Product {
//         int productId;
//         String productName;
//         String category;

//         public Product(int productId, String productName, String category) {
//             this.productId = productId;
//             this.productName = productName;
//             this.category = category;
//         }
//         public String toString() {
//             return "[" + productId + ", " + productName + ", " + category + "]";
//         }
//     }
//     public static Product linearSearch(Product[] products, String name) {
//         for (Product product : products) {
//             if (product.productName.equalsIgnoreCase(name)) {
//                 return product;
//             }
//         }
//         return null;
//     }
//     public static Product binarySearch(Product[] products, String name) {
//         Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
//         int left = 0, right = products.length - 1;
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             int cmp = products[mid].productName.compareToIgnoreCase(name);
//             if (cmp == 0) {
//                 return products[mid];
//             } else if (cmp < 0) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return null;
//     }
//     public static void main(String[] args) {
//         Product[] products = {
//             new Product(101, "Shoes", "Footwear"),
//             new Product(102, "Shirt", "Clothing"),
//             new Product(103, "Watch", "Accessories"),
//             new Product(104, "Bag", "Bags"),
//             new Product(105, "Laptop", "Electronics")
//         };

//         String searchName = "Watch";
//         Product result1 = linearSearch(products, searchName);
//         if (result1 != null) {
//             System.out.println("result: " + result1);
//         } else {
//             System.out.println("Products not found");
//         }
    
//         Product result2 = binarySearch(products, searchName);
//         if (result2 != null) {
//             System.out.println("result: " + result2);
//         } else {
//             System.out.println(" Product not found");
//         }
//     }
// }

    





public class ecommerce {
    static class Product {
        int productId;
        String productName;
        String category;
        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
        public String toString() {
            return   productId + "- " + productName  +" category:" ;
        }
    } 
    public static Product linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return products[i];
            }
        }
        return null;
    }
    public static void sortByProductId(Product[] products) {
        int n = products.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (products[j].productId > products[j + 1].productId) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "shirt", "cloths"),
            new Product(101, "Shoes", "Footwear"),
            new Product(103, "sunglass", "Accessories"),
            new Product(102, "computers and laptops", "electroics"),
            new Product(104, "lunch bag", "Bags")
        };
        int targetId = 101;
        Product foundLinear = linearSearch(products, targetId);
        if (foundLinear != null) {
            System.out.println("Found Linear: " + foundLinear);
        } else {
            System.out.println("Not found Linear");
        }
        sortByProductId(products);
        Product foundBinary = binarySearch(products, targetId);
        if (foundBinary != null) {
            System.out.println("FoundBinary: " + foundBinary);
        } else {
            System.out.println("Not found Binary");
        }
        System.out.println("\nAnalysis:");
        System.out.println("Linear Search : O(n)");
        System.out.println("Binary Search: O(log n) ");
        System.out.println("Binary search is more useful and significant for datasets. "
                + "Linear search is used as unsorted datasets.");
    }
}
