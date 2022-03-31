package facade.model

data class ComputerFacade(
    private var cpu: Cpu? = null,
    private var memory: Memory? = null,
    private var hardDrive: HardDrive? = null
) {

    fun startComputer() {
        cpu?.start()
        memory?.load()
        hardDrive?.read()
    }
}