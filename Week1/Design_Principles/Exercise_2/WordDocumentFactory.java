package com.factoryExample;

public class WordDocumentFactory extends DocumentFactory {

	@Override
	public Document createDocument() {
		return new WordDocumentImpl();
	}

}
