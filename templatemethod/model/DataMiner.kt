package templatemethod.model

abstract class DataMiner {

    fun converterDataMiner(path: Any) {
        val file = openFile(path)
        val rawData = extractDocData(file)
        val data = parseDocData(rawData)
        val analysis = analyzeData(data)
        sendReport(analysis)
        closeFile(file)
    }

    private fun closeFile(file: Any) {}
    private fun analyzeData(data: Any) {}
    private fun sendReport(analysis: Any) {}
    private fun openFile(path: Any) {}

    abstract fun extractDocData(file: Any)
    abstract fun parseDocData(rawData: Any)
}