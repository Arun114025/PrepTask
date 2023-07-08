package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Arun",1,15000,"Male",'P',"Assistant Manager");
		Employee e2=new Employee("Aravind",2,23000,"Male",'R',"Manager");
		Employee e3=new Employee("Ram",3,18000,"Male",'Y',"Deputy Manager");
		Employee e4=new Employee("Guru",4,12000,"Male",'X',"Manager");
		Employee e5=new Employee("Vijay",5,21000,"Male",'Z',"AGM");
		Employee e6=new Employee("Pavithra",6,65000,"Female",'G',"Team Lead");
		Employee e7=new Employee("Malini",7,75000,"Female",'V',"Lead");
		Employee e8=new Employee("Ramya",8,85000,"Female",'M',"Manager");
		Employee e9=new Employee("Usha",9,68000,"Female",'N',"Manager");
		Employee e10=new Employee("Swathi",10,45000,"Female",'O',"Assistant Manager");
		
	List<Employee> e=Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
	
//filter()	
//	List<Employee> salaryAbove20K=e.stream().filter(x->x.getSalary()>20000).collect(Collectors.toList());
//    salaryAbove20K.forEach(x->System.out.println(x));
	
	
//map()	
	
//	List<String> names=e.stream().map(x->x.getName()).collect(Collectors.toList());
//	names.forEach(x->System.out.println(x));
	
//count()	
	
//	Long noOfPerson=e.stream().map(x->x.getId()).count();
//	System.out.println(noOfPerson);
	
//sorted reverseOrder
	
//	List<String> namesrev=e.stream().map(x->x.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//   namesrev.forEach(x->System.out.println(x));
	
// sorted()
   
//   List<String> name=e.stream().map(x->x.getName()).sorted().collect(Collectors.toList());
//   name.forEach(x->System.out.println(x));
	
//	distinct()
	
//	List<String> gender=e.stream().map(x->x.getGender()).distinct().collect(Collectors.toList());
//    gender.forEach(x->System.out.println(x));

//Max()	
	
//	Employee maxSalary=e.stream().max(Comparator.comparing(Employee::getSalary)).get();
//    System.out.println(maxSalary);

//Min()	
	
	
//	Employee minSalary=e.stream().min(Comparator.comparing(Employee::getSalary)).get();
//     System.out.println(minSalary);
	
//limit()	
	
//	List<String> nameLimit=e.stream().map(x->x.getName()).sorted().limit(5).collect(Collectors.toList());
//    System.out.println(nameLimit);
	
//	List<String> namerevLimit=e.stream().map(x->x.getName()).sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
//    System.out.println(namerevLimit);
	

	//Skip
	
// int secondHighestSalary=e.stream().map(x->x.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
// System.out.println(secondHighestSalary);
	
	//anyMatch()
	
//	 Boolean name=e.stream().anyMatch(x->x.getName().equals("Arun"));
//	 System.out.println(name);
	

	//SummingInt()
	
//	int sumOfSalary=e.stream().collect(Collectors.summingInt(x->x.getSalary()));
//    System.out.println(sumOfSalary);
	
//    Map<Integer,Employee> salaryAbove20K=e.stream().filter(x->x.getSalary()>20000).collect(Collectors.toMap(x->x.getId(),y->y));
//    
//    salaryAbove20K.forEach((x,y)->System.out.println(x+" "+y));
	
    
//Set<Employee> salaryAbove20K=e.stream().filter(x->x.getSalary()>20000).collect(Collectors.toSet());
//    
//    salaryAbove20K.forEach(x->System.out.println(x));
	
	Map<Integer,List<Employee>>salaryAbove20K=e.stream().filter(x->x.getSalary()>20000).collect(Collectors.groupingBy(X->X.getSalary()));
 
      salaryAbove20K.forEach((x,y)->System.out.println(x+" "+y));
      
   
      
	
	
	
		
	}	
}
