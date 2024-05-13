package com.example.typhoon.data//package com.example.typhoon.data

import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import com.example.typhoon.models.Product

class ProductModel : ViewModel() {
    private val products: MutableList<Product> = mutableListOf(
        Product("1", "Product 1", "10", "20.0","Black"),
        Product("2", "Product 2", "15", "25.0","Red"),
        Product("3", "Product 3", "20", "30.0","Pink")
        // Add more products as needed
    )

    // Function to deduct a product from inventory
    fun deductProductFromInventory(productId: String) {
        val product = products.find { it.id == productId }
        product?.let {
            val remainingQuantity = it.quantity.toInt() - 1
            if (remainingQuantity >= 0) {
                it.quantity = remainingQuantity.toString()
            }
        }
    }

//    // Function to view all products
    fun viewProducts(): List<Product> {
        return products
    }
//
//    // Function to delete a product
    fun deleteProduct(productId: String) {
        products.removeAll { it.id == productId }
    }
}
