public class Expression {
    public String str;

    public Expression(String str)
}
this.str = str;
}

@Override
public Expresion clone() {
    Expression clone = null;
    try {
        clone = (Expresion) super.clone();
    } catch (CloneNotSupportedException ex) {
        ex.printStackTrace();
    }
    return clone;
}


}