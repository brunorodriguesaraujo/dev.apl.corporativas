package templatemethod.model

class DocDataMiner: DataMiner() {
    override fun extractDocData(file: Any) {
        println("extract to doc")
    }

    override fun parseDocData(rawData: Any) {
        println("parse to doc")
    }
}