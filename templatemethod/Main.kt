package templatemethod

import templatemethod.model.DocDataMiner
import templatemethod.model.PDFDataMiner

fun main() {
    val path = ""

    val converterPdf = PDFDataMiner()
    converterPdf.converterDataMiner(path)

    val converterDoc = DocDataMiner()
    converterDoc.converterDataMiner(path)

    val converterCsv = DocDataMiner()
    converterCsv.converterDataMiner(path)
}