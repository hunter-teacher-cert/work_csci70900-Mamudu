import java.io.*;
import java.util.*;
import java.lang.*;

public class Driver{
  public static void main(String[] args) {
  PhoneBook s = new PhoneBook();
  Customer c = new Customer();

  Data d = new Data();
  Data d1 = new Data();
  Data d2 = new Data();

  // testing adding object to linked list customer 
  d.add("Sanneh","Fatou","3472639570");
  c.add(d);
  //Data d1 = new Data();
  //Data d2 = new Data();

  //System.out.println(c);
  //c.printCustomer();

  // ad another customer
  //d.clear();
  d1.add("Wally", "Mamudu", "6466016485");
  c.add(d1);
  // print customer with two linked element
  //System.out.println(c);

  //c.printCustomer();
  // add to PhoneBook
  s.add(0,c);


  // testing printing PhoneBook list
  System.out.println();
  System.out.println("Print linked customer of two element added without hashCode");

  //heaading
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  // phonebook list
   s.printPhoneBookList();


  // testing hashcode method
  System.out.println();
  System.out.println("Print hashCode of two element customer");
  System.out.println("hashcode Sanneh: "+ c.hashCode("Sanneh"));
  System.out.println("hashcode Wally: "+ c.hashCode("Wally"));

  // remove Flanagan from linked list
  //c=s.get(0);
  c.removeCustomer("Sanneh");

  // testing printing PhoneBook list
  System.out.println();
  System.out.println("Print linked customer  after remove Sanneh ");
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");

  s.printPhoneBookList();

  // remove Wally from linked list
  //c=s.get(0);
  c.removeCustomer("Wally");

  // testing printing PhoneBook list
  System.out.println();
  System.out.println("Print linked customer  after remove Wally empty customer");

  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  //if (c.peekLast() == null) 
  //c = new Customer();


  s.printPhoneBookList();

  // add Customer with hashcode
  Customer c1 = new Customer();
  c1.add(d);
  if (s.get(c.hashCode("Sanneh")) == null) {
    s.add(c.hashCode("Sanneh"),c1);
  }
  //s.printPhoneBookList();
  // add Customer with hashcode
  Customer c2 = new Customer();

  c1.add(d1);
  if (s.get(c2.hashCode("Wally")) == null) {
    s.set(c.hashCode("Wally"),c2);
  }
  // add Customer with hashcode
  Customer c3 = new Customer();

  d2.add("Persaud","Michele","2121234567");
  c3.add(d2);
  if (s.get(c3.hashCode("Persaud")) == null) {
   s.set(c.hashCode("Persaud"),c3);
  }
  
  // printing PhoneBook list
    System.out.println();
  System.out.println("Print linked customer  after adding 3 customer with hashcode");
  System.out.println();
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  s.printPhoneBookList();
/*
  //remove Sanneh
  s.set(c.hashCode("Wally"),null);
  // printing PhoneBook lisSystem.out.println();
  System.out.println("Print linked customer  after removing Sanneh");
  System.out.println();
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  s.printPhoneBookList();*/
  }
}

       