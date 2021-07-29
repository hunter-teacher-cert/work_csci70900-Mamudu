#####################################################
Create a lesson plan for a concept covered in the pre-work or the first programming course in this program (not data structures).
This should be a lesson plan for a High School class, ~45 miutes in length.
Assume the appropriate level of prior knowledge.
You need not create supplemental materials like sample code, assignments, etc.
You could use the template found here, but you do not need to, or you cna modify it.
Use whatever file format that is more convenient for you, but name the file 01_lesson and put it in your meth1 folder.

#########################################################3
//Start of Lesson plan
Topic: One-Dimensional Arrays

/*
What this lesson is about:
This lesson explores arrays, which are used to store large amounts of information without needing to set up separate variables for each piece of information.
*/

Learning Objectives:
The students will:
1. Learn what an array data type is, and how to declare    and initialize an array
2. Learn how to extract and edit data which is
   contained in an array
3. Understand how array elements are indexed

Components:
1. Do Now - 5 minutes
2. Code Along Exercise - 10 minutes
3.Checking for Understanding - 5 minutes
4. Coding Activities (2) - 20 minutes
5. Exit Ticket: 5 minutes

#################################################
Actual Lesson

One-Dimensional
Arrays

In Java, an object is a variable of a class type.
It can hold lots of data and has methods.
It is different than a primitive type.

Arrays are Objects
An array is an object that holds more than one
thing in memory.
All items in the array are the same data type.
Arrays can hold primitive types or class types.

To Create:
int [] list = new int[7];
This creates an array called list of 7 integers.
Use the new command - this is what stores the
reference to where data is in memory.

Vocabulary:
element - The box of the array. Each box holds a
value. All values are the same data type.
index - The address of the elements. Starts at 0 and
ends at (length -1).
initialize - Stores known values in an array.

To Create:
int[] list = new int[7];
Why does it stop at 6 if there are 7 boxes?
Index start at 0 and go to (length -1)
0 1 2 3 4 5 6

Example:
14 -10 1 0 9 -7 3 // Array
0    1 2 3 4  5 6 //Index
list[4]++; 
list[0] = list[1] + 2;
list[6] = list[6] *4;

Initializer lists:
int [] list = {14, -10, 1, 0, 9, -7, 3};
Java sets the size based on the number of elements
given.
Automatically sets the values in an array.

Classwork //Try it yourself // Code Practice
Declare an array of ten ints with the values 0 - 9 in order.
Test your array by printing out the numbers 0, 5, and 9.

##############################################
*/
What to Emphasize:
Arrays in Java store multiple elements of the same data type in a fixed order indexed starting from 0. The data type stored can be anything as long as it is the same for the whole array.
/*

/*Additional Comments:
While Arrays are stored as reference data and even inherit methods from java.lang.Object, there is no page for an array class in the API reference (the class Arrays just contains static methods for working on array objects). Technically for each possible data type stored in an array a new class is created. The few methods and variables for these classes can be found in chapter 10 of the java language specification.

Want extra practice?
Download this worksheet for your students to complete individually or in groups.

Worksheet: Basic Arrays (.pdf)
Worksheet: Basic Arrays Solutions (.pdf)
Curricular Standards:
This lesson adheres to the following curricular requirements defined by the College Board: VAR-2.A, VAR-2.A.1-7
/*

