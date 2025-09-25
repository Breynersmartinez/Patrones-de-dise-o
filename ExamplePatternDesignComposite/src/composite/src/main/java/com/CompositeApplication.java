package com;
<<<<<<< HEAD

import java.util.*;
=======
>>>>>>> 2e9491ed00038e8dee6c244024607606fd5da550
import java.util.Scanner;

public class CompositeApplication {
public static void main(String args[])
{

<<<<<<< HEAD

=======
Scanner scanner = new Scanner(System.in);

HeadDepartment headDepartment = new HeadDepartment(2, " Head Department ", scanner);


// create de main department 
>>>>>>> 2e9491ed00038e8dee6c244024607606fd5da550
Department salesDepartment = new SalesDepartment(1, " Sales Department ");

// create subdepartments 

Department financialDepartment = new FinancialDepartment(3, " Financial Department ");




// print the department names
headDepartment.addDepartment(salesDepartment);

headDepartment.addDepartment(financialDepartment);

headDepartment.printDepartmentName();



System.out.println("AGREGAR UN NUEVO DEPARTAMENTO");

// create de main department 
System.out.println(" Digite el nombre del departamento: ");
String namedepartment = scanner.nextLine();


System.out.println(" Digite el id del departamento: ");
int id = scanner.nextInt();

Department newHeadDepartment = new HeadDepartment(id, namedepartment, scanner);
headDepartment.addDepartment(newHeadDepartment);


System.out.println(headDepartment.toString());


}
}





