package factorystrategy.model

abstract class SamsungFactory {
    abstract fun createDevice(type: TypeDevice): Samsung
}