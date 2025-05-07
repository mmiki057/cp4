package pl.mikailov.productcatalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HashMapProductStorage implements ProductStorage {

        // TECH
        private List<Product> products;

        public HashMapProductStorage() {
            this.products = new ArrayList<>();
        }

        @Override
        public List<Product> allProducts() {
            return Collections.unmodifiableList(products);
        } //TECH


        @Override
        public void save(Product newProduct) {
            this.products.add(newProduct);
        }

        @Override
        public Product loadProductById(String productId) {
            return products.stream()
                    .filter(product -> product.getId().equals(productId))
                    .findFirst()
                    .get(); // TECH
        }


}
