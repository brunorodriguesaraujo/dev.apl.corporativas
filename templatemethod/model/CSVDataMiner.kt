package templatemethod.model

class CSVDataMiner: DataMiner() {
    override fun extractDocData(file: Any) {
        println("extract to csv")
    }

    override fun parseDocData(rawData: Any) {
        println("parse to csv")
    }
}