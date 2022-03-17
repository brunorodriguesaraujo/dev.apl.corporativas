package model

enum class Post: CalculateComission {

    DIRECTOR{
        override fun calculateComission(value: Double): Double {
            return value * 0.4
        }
    },
    MANAGER {
        override fun calculateComission(value: Double): Double {
            return value * 0.2
        }
            },
    SELLER {
        override fun calculateComission(value: Double): Double {
            return value * 0.15
        }
    },
    ATTENDANT {
        override fun calculateComission(value: Double): Double {
            return value * 0.1
        }
    }
}