# Learning Target:
I can end a while loop in two (2) ways.

# Warm Up | Do Now
Write a program that will print "Python" 7 times.

# Mini Activity #1 | Count Variable:

c = 0
while (c < 7):
  c = c + 1
  print("Python")

This prints Python 7 times.

# Mini Activity #2 | User input:

n = int(input("enter #'s, -1 to stop"))
sum = 0
while (n != -1):
  sum = sum + n
  n = int(input ("enter #'s, -1 to stop"))
print("Total: " + str(sum))

The loop will continue summing numbers until the user has entered -1, at which point the loop will end.

# Checking for Understanding:
## In Mini Activity #1:
How will you print Python 10 times? 
Now print Python 10 times.

## In Mini Activity #2:
How many times will the program run?
How can you end the program?
Now end the program after 10 number entries.

# Classwork | Pair Programming

## Groupwork: Code Practice #1 (Coder #1)
Create a program that prompts the user for how old they are turning and then using a loop, output a virtual hug for every year old they are.

The following prints a single “virtual hug.”
print("**HUG**")

## Groupwork: Code Practice #2 (Coder #2)
Write a program that uses a while loop to calculate and print the multiples of 3 from 3 to 21. Your program should print each number on a separate line.

Expected Output:
3 
6
9
12
15
18
21

# Exit Ticket
## Question #1
Consider the following code:

x = int(input ("Enter a value: "))
c = 0
sum = 0

while (c < 10):
   x = int(input ("Enter a value: "))
   c = c + 1
   sum = sum + x
print ("\n\nSum: " + str(sum))

What type of loop is it?

## Question #2
This code loops until the user types in 17. It finds and prints the sum of all even numbers entered.

n = int(input ("Enter a number, 17 to stop."))
sum = 0

while (n != 17):
   if (n % 2 == 0):
      sum = sum + n
   n = int(input ("Enter a number, 17 to stop."))

print ("Sum: " + str(sum))

What type of loop is it?

# Homework
If you did not finish your work in class, please complete them as homework.

