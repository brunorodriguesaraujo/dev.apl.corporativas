package facade

import facade.model.ComputerFacade
import facade.model.Cpu
import facade.model.HardDrive
import facade.model.Memory

fun main() {

    val cpu = Cpu()
    val memory = Memory()
    val hardDrive = HardDrive()

    val computer = ComputerFacade(
        cpu, memory, hardDrive
    )

    computer.startComputer()
}