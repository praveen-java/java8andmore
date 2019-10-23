package io.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PersonExample {
	public static void main(String[] args) {
	
	List<Person> people=new ArrayList<Person>();
			people.add(new Person("mahesh","kumar","40"));
			people.add(new Person("neeta","sharma","20"));
			people.add(new Person("anil","ahuja","40"));
			people.add(new Person("mukesh","sharma","22"));
			

	//sort list by lastName
	Collections.sort(people, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
	
//	printAll(people);
	
	
//print person lastname starts with s
	
//	printThem(people,(Person p)->p.getLastName().startsWith("s"));
	
	printThem(people,p->p.getFirstName().startsWith("m"));
//	people.stream()
//    .filter((p) -> (p.getLastName().startsWith("s")))
//    .forEach((p) -> System.out.printf("%s %s %s \n ", p.getFirstName(), p.getLastName(),p.getAge()));
//	
//	
	}
	


private static void printThem(List<Person> people,Predicate<Person> predicate) {
		for(Person p:people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
		
	}

//printing the list of people
//	private static void printAll(List<Person> people) {
//		for(Person p:people) {
//			System.out.println(p);
//		}
//		
//	}

}
