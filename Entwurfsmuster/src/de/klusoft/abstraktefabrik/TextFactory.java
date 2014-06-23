package de.klusoft.abstraktefabrik;


public class TextFactory extends AbstractFactory {

    @Override
    public Table createTable() {

	return new TextTable();
    }

    @Override
    public Header createHeader() {

	return new TextHeader();
    }

    @Override
    public Row createRow() {

	return new TextRow();
    }

    @Override
    public Cell createCell( String content ) {

	return new TextCell(content);
    }

}
