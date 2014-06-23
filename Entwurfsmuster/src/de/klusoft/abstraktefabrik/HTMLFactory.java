package de.klusoft.abstraktefabrik;


public class HTMLFactory extends AbstractFactory {

    @Override
    public Table createTable() {

	return new HTMLTable();
    }

    @Override
    public Header createHeader() {

	return new HTMLHeader();
    }

    @Override
    public Row createRow() {

	return new HTMLRow();
    }

    @Override
    public Cell createCell( String content ) {

	return new HTMLCell(content);
    }

}
