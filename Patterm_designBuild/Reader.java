public class Reader {


    private String element;
    private Converter converter;

    public Reader(String element, Converter converter)
    {
        this.element = element;
        this.converter = converter;
    }


    public void parseInput( String element)
    {
        switch (element) {
            case "LINEA":
                converter.makeLine();
                break;

             case "Parrafo":
                converter.makeParagraph();
                break;

                 case "Tabla":
                converter.makeTable();
                break;

            default:
                break;
        }
    }
}
