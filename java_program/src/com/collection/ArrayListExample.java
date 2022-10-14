package com.collection;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		Employee e1=new Employee(111,"Feroze",25000.0f);
       Employee e2=new Employee(222,"Haroon",35000.0f);
       Employee e3=new Employee(333,"Hamza",50000.0f);
       ArrayList<Employee> al=new ArrayList<Employee>();
       al.add(e1);
       al.add(e2);
       al.add(e3);
       Iterator itr=al.iterator();
       while(itr.hasNext()) {
    	Employee emp=(Employee)itr.next();   
        System.out.println(emp.empid+" "+emp.name+" "+emp.salary);
        
        

  
       }
       
	}

}
