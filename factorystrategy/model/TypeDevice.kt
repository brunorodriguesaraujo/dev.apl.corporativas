package factorystrategy.model

import factorystrategy.interfaces.CreateDevice

enum class TypeDevice : CreateDevice {

    SAMSUNGS20FE {
        override fun createDevice(): Samsung {
            return SamsungS20Fe()
        }
    },

    SAMSUNGS20ULTRA {
        override fun createDevice(): Samsung {
            return SamsungS20Ultra()
        }
    },

    SAMSUNGS20PLUS {
        override fun createDevice(): Samsung {
            return SamsungS20Plus()
        }
    }
}