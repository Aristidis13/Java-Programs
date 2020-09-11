Here are 3 programs that are focusing in Java's Object Oriented abilities, exceptions and File handling.

# OOP Mini Project 
That was my first Object Oriented Analysis project. It contains basic methods and attributes that are shown in UML image.

# Calculator.java
This program calculates the mathematical expression: ((x-7)*y)/(x-2)
Different types of exceptions are used to ensure the execution of the program even if (x==2) || (x is not a number) || (y is not a number) 

# Exer3.java
This program checks for a file named src.txt file and then reads its contents and adds a second newline after every newline.
Also it replaces all blanks with the $ symbol.
Finally it presents the src.txt file size, the newfile.txt and the number of blanks that were replaced by $s.

One interesting part in exercise 3 is the fact that the number of characters of the text file that is read dictates the
size of the buffer and the file size of the newfile that the program creates.
In that way it is ensured that there is no overflow and the program can be used for any file as input.
It can be further modified so the text file name can be given as input and not be specific as src.txt. 
