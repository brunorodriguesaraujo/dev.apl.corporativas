package factorystrategy.model

class SamsungS20Factory: SamsungFactory() {
    override fun createDevice(type: TypeDevice): Samsung {
        return type.createDevice()
    }
}