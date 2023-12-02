package com.rmd.business.productmanagement.data.repository

import com.rmd.business.productmanagement.data.dto.ProductDto
import com.rmd.business.productmanagement.domaine.model.Product

interface ProductRepository {
    suspend fun createProduct(product: Product): Boolean
    suspend fun getProducts(): List<ProductDto>?
    suspend fun getProduct(id: String): ProductDto
    suspend fun deleteProduct(id: String)
    suspend fun updateProduct(
        id: String, name: String, price: Double, imageName: String, imageFile: ByteArray
    )
}
