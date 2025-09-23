package com;

public class SalesDepartment implements Department {

     private int id;

    private String namedepartment;

    public SalesDepartment(int id, String namedepartment)
{
this.id=id;
this.namedepartment=namedepartment;

}


    @Override
    // Method to print the department name (metodo para imprimir el nombre del departamento)
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
