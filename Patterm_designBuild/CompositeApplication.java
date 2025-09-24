package com;


public class CompositeApplication {
public static void main(String args[])
{
// create de main department 
Department salesDepartment = new SalesDepartment(1, "Sales Department");

// create subdepartments 
HeadDepartment headDepartment = new HeadDepartment(2, "Head Department");
Department financialDepartment = new FinancialDepartment(3, "Financial Department");

// print the department names
headDepartment.addDepartment(salesDepartment);
//
headDepartment.addDepartment(financialDepartment);

headDepartment.printDepartmentName();

}
}

