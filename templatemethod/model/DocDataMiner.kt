package templatemethod.model

class DocDataMiner: DataMiner() {
    override fun openFile(path: Any) {
        println("open doc")
    }

    override fun extractDocData(file: Any) {
        println("extract to doc")
    }

    override fun parseDocData(rawData: Any) {
        println("parse to doc")
    }

    override fun closeFile(file: Any) {
        println("close doc")
    }
}