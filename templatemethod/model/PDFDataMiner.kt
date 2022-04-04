package templatemethod.model

class PDFDataMiner: DataMiner() {
    override fun extractDocData(file: Any) {
        println("extract to pdf")
    }

    override fun parseDocData(rawData: Any) {
        println("parse to pdf")
    }
}