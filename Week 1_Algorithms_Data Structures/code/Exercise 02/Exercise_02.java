import java.util.Arrays;

class Product {
    int productId;
    String productName;
    String category;
    
    public Product(int id, String name, String cat) {
        productId = id;
        productName = name;
        category = cat;
    }
}

public class Exercise_02 {
    
    static Product linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return products[i];
            }
        }
        return null;
    }
    
    static Product binarySearch(Product[] sortedProducts, int targetId) {
        int left = 0;
        int right = sortedProducts.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int midId = sortedProducts[mid].productId;
            
            if (midId == targetId) {
                return sortedProducts[mid];
            } else if (midId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    
    static void sortProducts(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].productId > products[j + 1].productId) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Product[] products = {
            new Product(102, "Running Shoes", "Footwear"),
            new Product(105, "Wireless Headphones", "Electronics"),
            new Product(101, "Coffee Maker", "Kitchen"),
            new Product(104, "Backpack", "Accessories"),
            new Product(103, "Water Bottle", "Kitchen")
        };
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        sortProducts(sortedProducts);
        int searchId = 104;
        //linear Search test
        Product linearResult = linearSearch(products, searchId);
        if (linearResult != null) {
            System.out.println("Linear Search found: " + linearResult.productName);
        } else {
            System.out.println("Linear Search: Product not found");
        }
        
        // Binary search test
        Product binaryResult = binarySearch(sortedProducts, searchId);
        if (binaryResult != null) {
            System.out.println("Binary Search found: " + binaryResult.productName);
        } else {
            System.out.println("Binary Search: Product not found");
        }
    }
}