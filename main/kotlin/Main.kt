import model.Employee
import model.Post
import model.Sale
import java.text.DecimalFormat

fun main(args: Array<String>) {
    val employee = Employee(
        "Bruno", 1.200, Post.ATTENDANT
    )

    val sale = Sale(employee, 2.000)
    println(sale.saleComission())
}