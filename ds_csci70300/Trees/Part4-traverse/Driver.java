import java.io.*;
import java.util.*;


public class Driver {
  public static void main(String[] args) {
    BSTree t = new BSTree();

    t.seed();
    int value;

    // testing search

    value = t.search(10);
    System.out.println(value);

    value = t.search(15);
    System.out.println(value);

    try {
      value = t.search(17);
      System.out.println(value);
    } catch (NullPointerException e) {
      System.out.println("17 not in tree");
    }

    // testing insert

    try {
      value = t.search(13);
      System.out.println(value);
    } catch (NullPointerException e) {
      System.out.println("13 not in tree");
    }
    System.out.println("Inserting 13...");
    t.insert(13);
    System.out.println(t.search(13));

    // testing traverse

    t.preorderTraverse();
    t.postorderTraverse();
    t.inorderTraverse();
  }

    
}