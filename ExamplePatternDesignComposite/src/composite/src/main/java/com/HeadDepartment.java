package com;
import java.util.*;

public class HeadDepartment implements Department {

    // Unique identifier for the department (identificador unico para el departamento)
    private int id;

    private String namedepartment;

    //Child departments list es para guardar los subdepartamentos
    private List<Department> childDepartments;
    
public HeadDepartment(int id, String namedepartment)
{
this.id=id;
this.namedepartment=namedepartment;
this.childDepartments = new  ArrayList<>();
}





 @Override
 // Method to print the department name (metodo para imprimir el nombre del departamento)
 public void printDepartmentName() 
 {
    childDepartments.forEach(Department::printDepartmentName);
 }

 // Method to add a child department (metodo para agregar un subdepartamento)
 public void addDepartment(Department department)
 {
  childDepartments.add(department);
 }

 // Method to remove a child department (metodo para eliminar un subdepartamento)
public void removeDepartment(Department department)
{
   
        childDepartments.remove(department);
 
}

}




















