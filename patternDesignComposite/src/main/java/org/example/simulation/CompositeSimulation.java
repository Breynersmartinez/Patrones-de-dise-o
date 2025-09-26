package org.example.simulation;

import org.example.composite.Department;
import org.example.composite.FinancialDepartment;
import org.example.composite.HeadDepartment;
import org.example.composite.SalesDepartment;

import java.util.Scanner;

public class CompositeSimulation {


    public void simulation()
    {


        Scanner scanner = new Scanner(System.in);

        HeadDepartment headDepartment = new HeadDepartment(2, " Head Department ");


// create de main department

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

        headDepartment = new HeadDepartment(id, namedepartment);
        headDepartment.addDepartment(headDepartment);


        System.out.println(headDepartment.toString());

    }
}
