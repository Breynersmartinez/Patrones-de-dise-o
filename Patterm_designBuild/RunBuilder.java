public class RunBuilder {

    public static void main(String [] args)
    {
        Converter objc1 = new ASCIIConverter();
        Converter objc2 = new PDFConverter();
        Converter objc3 = new PostScriptConverter();


        Reader objReader1 = new Reader("LINEA", objc1);
        
        Reader objReader2 = new Reader("LINEA", objc3);

        Reader objReader3 = new Reader("PARRAFO", objc2 );

        Reader objReader4 = new Reader("TABLA", objc3);


objReader1.parseInput("LINEA");
objReader2.parseInput("LINEA");
objReader3.parseInput("PARRAFO");
objReader4.parseInput("TABLA");

    }
}
