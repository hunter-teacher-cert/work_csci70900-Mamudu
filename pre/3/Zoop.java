Pre03-Void Methods-Exercise 1-Chapter 4
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1.  What is the output?

No I wag.
You wugga wag.
I wug.

———
Reasoning:  
ping: 	.
baffle: wag.
zoop:  	wag.
       	You wugga wag.
main: 	No, I wag.
     	You wugga wag.
    	I wug.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2.  Stack Diagram
Main 
	“No, I”
	zoop
	“I”
	baffle

zoop
	baffle
	“You wugga “
	baffle 
baffle
	“wug”
	ping
ping
	.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
3.  If you invoke baffle at the end of ping, the program will keep looping back and forth between baffle and ping.