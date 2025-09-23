package com;

public class FinancialDepartment implements Department {

    private int id;

    private String namedepartment;

public FinancialDepartment(int id, String namedepartment)
{
this.id=id;
this.namedepartment=namedepartment;

}



@Override
// Method to print the department name (metodo para imprimir el nombre del departamento)
public void printDepartmentName()
{
    System.out.println(getClass().getSimpleName());
}

}
