package Exercise1DocumentConverter;

public class PDFConverter implements Converter {
    public void makeLine() {
        System.out.println("Linea con PDF");
    }

    public void makeParagraph() {
        System.out.println("Parrafo con PDF");
    }

    public void makeTable() {
        System.out.println("Tabla con PDF");
    }

}
