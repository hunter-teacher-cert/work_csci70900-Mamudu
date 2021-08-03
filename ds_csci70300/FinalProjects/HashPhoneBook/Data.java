import java.io.*;
import java.util.*;
import java.lang.*;

public class Data {

  //private data;
  //private List<String> data =new ArrayList<String>();
  String data[]; 
  
  //constructor without value
  public Data() {
  data = new String[3];
  } 
  //constructor with value
  public Data(String lN, String fN,  String pN) {
    data = new String[3];
    data[0] = lN;
    data[1] = fN;
    data[2] = pN;
  } 

  public void add(String lN, String fN,  String pN) {
    data[0] = lN;
    data[1] = fN;
    data[2] = pN;
  }
// I don't need for now
  public void clear(){
  }

  public boolean contains (String s){
    if (data[0] == s){ 
      return true;
    }
    return false;
  }

  public String get (int index){
    return data[index];
  }
  public String toString(){
    String s =String.format("%-25s %-25s",data[0],data[1])+data[2].replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
    return s;
  }
}