import factorystrategy.model.SamsungS20Factory
import factorystrategy.model.TypeDevice

fun main() {
    val samsungUltra = SamsungS20Factory()
    println(samsungUltra.createDevice(TypeDevice.SAMSUNGS20ULTRA))

    val samsungPlus = SamsungS20Factory()
    println(samsungPlus.createDevice(TypeDevice.SAMSUNGS20PLUS))

    val samsungFe = SamsungS20Factory()
    println(samsungFe.createDevice(TypeDevice.SAMSUNGS20FE))

}