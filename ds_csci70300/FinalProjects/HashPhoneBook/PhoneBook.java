import java.io.*;
import java.util.*;
import java.lang.*;

/*
Setup:
Project: Hash*/


public class PhoneBook{
  private ArrayList<Customer> phoneBook = new ArrayList<>();  // to store the customer

  /* Instance phonrbook 100 custoners */
  public PhoneBook(){
   //create a phonebook ArrayList with null element
   for(int i=0; i<100; i++) {
        phoneBook.add(null);
   } 
  }

/* Instance phonrbook size custoners */
  public PhoneBook(int size){ 
   
    for(int i=0; i<size ; i++) {
        phoneBook.add(null);
   } 
  }


  public void printPhoneBookList(){
    //print PhoneBook customers
    for(Customer element:phoneBook){
      if (element !=null){
      element.printCustomer();
      } 
    } 
    
  }
  public Customer get(int index){
    return this.phoneBook.get(index);
  }

  public void add(Customer c){
     this.phoneBook.add(c);
  }

  public void add(int index ,Customer c){
     this.phoneBook.add(index,c);
  }

  public void remove(int index ){
     this.phoneBook.remove(index);
  }

  
  public void set(int index ,Customer c){
     this.phoneBook.set(index,c);
  }

}//end class PhoneBook