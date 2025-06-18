package com.factoryExample;

public class Test {
	public static void main(String[] args) {
		DocumentFactory pdfDocument=new PdfDocumentFactory();
		Document pdf=pdfDocument.createDocument();
		pdf.genDocument();


		DocumentFactory wordDocument=new WordDocumentFactory();
		Document word=wordDocument.createDocument();
		word.genDocument();

		DocumentFactory excelDocument=new ExcelDocumentFactory();
		Document excel=excelDocument.createDocument();
		excel.genDocument();

	}

}
