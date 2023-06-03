package projectselenium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		
	
// Program 1 
	PersonA a = new PersonA("sneha","bhattarai",22,"kathmandu");
	PersonA b = new PersonA("neha","kapoor",20,"kathmandu");
	PersonA c = new PersonA("rita","khan",25,"kathmandu");
	PersonA d = new PersonA("ram","bhandari",32,"kathmandu");
	PersonA e = new PersonA("sita","bhat",34,"kathmandu");
	
	List<PersonA> students = (List<PersonA>) Arrays.asList(a,b,c,d,e); 
	System.out.println(students);
	List<Integer> addingTwo = students.stream().map(x -> x.age+ 2).collect(Collectors.toList()); 
	  System.out.println(addingTwo); 

	// Program 2
	
	List<Integer> number = (List<Integer>)Arrays.asList(2,3,4,5);
	System.out.println(number);
	List<Integer> multifive= number.stream().map(x->x*5).collect(Collectors.toList());
	System.out.println(multifive);
	
	// program 3 
	
	List<Integer> number1 = (List<Integer>)Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	System.out.println(number1);
	List<Integer> multitwo= number1.stream().map(x->x*2).collect(Collectors.toList());
	System.out.println(multitwo);
	
	// program 4
	

	List<PersonA> students1 = (List<PersonA>) Arrays.asList(a,b,c,d,e); 
	System.out.println(students1);
	List<String> namestratR = students1.stream().map(x -> x.firstName).collect(Collectors.toList()); 
	  System.out.println(namestratR ); 

	
}
}




class PersonA { 
	 String firstName; 
	 String lastName; 
	 int age; 
	 String city ; 
	 public PersonA(String firstName , String  lastName ,int age,String city) { 
	  this.firstName = firstName; 
	  this.lastName = lastName; 
	  this.age = age; 
	  this.city = city; 
	 } 
}