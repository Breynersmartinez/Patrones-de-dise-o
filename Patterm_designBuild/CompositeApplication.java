package com;

public class CompositeApplication {
public static void main(String args[])
{
// create de main department 
Department Sales = new SalesDepartment(1, "Sales Department");

// create subdepartments 
Department Head = new HeadDepartment(2, "Head Department");
Department Financial = new FinancialDepartment(3, "Financial Department");

// print the department names
Sales.printDepartmentName();
Head.printDepartmentName();
Financial.printDepartmentName();


}
}
