package builder

import builder.model.Food

fun main(){
    val food = Food.Builder()
        .meat("rump steak")
        .condiments("oregano")
        .acompaniment("rice")
        .build()

    println(food.meat)
}