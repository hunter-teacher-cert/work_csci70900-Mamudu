import java.io.*;
import java.util.*;
import java.lang.*;

public class Driver{
  public static void main(String[] args) {
  PhoneBook s = new PhoneBook();
  Customer c = new Customer();
  Data d = new Data();

  // testing adding object to linked list customer 
  c.clear();
  d.add("Flanagan","Elen","9174780750");
  c.addFirst(d);
  //print customer
  c.printCustomer();

  // ad another customer
  d.add("Hadjahmed", "Chaouiki", "9174780756");
  c.addFirst(d);
  // pront customer with two linked element
  //System.out.println(c.get(0).get(0));

  c.printCustomer();

  // add to PhoneBook
  s.add(0,c);


  // testing printing PhoneBook list
  //heaading
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");

  // phonebook list
   s.printPhoneBookList();


  // testing hashcode method
  System.out.println("hashcode Flanagan: "+ c.hashCode("Flanagan"));
  System.out.println("hashcode Haadjahmed: "+ c.hashCode("Hadjahmed"));

  // remove Flanagan from linked list
  //c=s.get(0);
  c.removeCustomer("Flanagan");

  // testing printing PhoneBook list
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  s.printPhoneBookList();

  // remove Hadjahmed from linked list
  //c=s.get(0);
  c.removeCustomer("Hadjahmed");

  // testing printing PhoneBook list
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  s.printPhoneBookList();

  // add Customer with hashcode
  c.clear();
  d.add("Flanagan","Elen","9174780750");
  c.add(d);
  if (s.get(c.hashCode("Flanagan")) == null) {
    s.set(c.hashCode("Flanagan"),c);
  }
  // add Customer with hashcode
  c.clear();
  d.add("Hadjahmed", "Chaouiki", "9174780756");
  c.add(d);
  if (s.get(c.hashCode("Hadjahmed")) == null) {
    s.set(c.hashCode("Hadjahmed"),c);
  }
  // add Customer with hashcode
  c.clear();
  d.add("Persaud","michele","212 123-4567");
  c.add(d);
  if (s.get(c.hashCode("Persaud")) == null) {
    s.set(c.hashCode("Persaud"),c);
  }
  
  // printing PhoneBook list
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  s.printPhoneBookList();
  }
}

       