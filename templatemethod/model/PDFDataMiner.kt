package templatemethod.model

class PDFDataMiner: DataMiner() {
    override fun openFile(path: Any) {
        println("open pdf")
    }

    override fun extractDocData(file: Any) {
        println("extract to pdf")
    }

    override fun parseDocData(rawData: Any) {
        println("parse to pdf")
    }

    override fun closeFile(file: Any) {
        println("close pdf")
    }
}