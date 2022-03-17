package model

class Sale(
    private var employee: Employee,
    private var price: Double = 0.0
) {

    fun saleComission(): Double {
        val post = employee.post
        return post.calculateComission(price)
    }
}