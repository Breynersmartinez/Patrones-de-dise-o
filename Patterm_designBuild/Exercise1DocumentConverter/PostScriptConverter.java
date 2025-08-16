package Exercise1DocumentConverter;

public class PostScriptConverter implements Converter{

     public void makeLine()
    {
System.out.println("Linea con PostScript");
    }

    public void makeParagraph()
    {
System.out.println("Parrafo con PostScript");
    }

    public void makeTable()
    {
        System.out.println("Tabla con postScript");
    }

}
