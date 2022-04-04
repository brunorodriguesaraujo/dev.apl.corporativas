package templatemethod.model

class CSVDataMiner: DataMiner() {
    override fun openFile(path: Any) {
        println("open csv")
    }

    override fun extractDocData(file: Any) {
        println("extract to csv")
    }

    override fun parseDocData(rawData: Any) {
        println("parse to csv")
    }

    override fun closeFile(file: Any) {
        println("close csv")
    }
}