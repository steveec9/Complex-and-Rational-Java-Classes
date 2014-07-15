README****
***README***
/*
*
* Version info
*
* Copyright notice
*
* Course : CSC171 SPRING 2014
*
* Assignment : LAB Project 1
*
* Author : Stephen Cool
*
* Lab Session : TR 2:00 - 3:15
*
* Lab TA : David Sekora and Yaron Shaverdi
*
* Last Revised : March 27, 2014
*
*/

******************************
Rational.java: Compile Test.java

To change numbers, go into Test.java and change 'x' and 'y' or 'a' and 'b'.

A lot of code was referenced from the Princeton website listed below for creating the Rational object with constructor, accessor, add(),sub(), mult(), and div() methods. The code arithmatic operations were then converted to static methods in Test.java. 

toString(), equals(), and compareTo() were added by myself. 
For compareTo() if a<b ->  -1; if a>b -> +1; if a=b ->0


Rational.java will throw a 'divide by 0' error, also. 

It prints as specified on the lab, i.e. 0/9 prints 0; or 1/-4 prints -1/4 

Reference: http://introcs.cs.princeton.edu/java/92symbolic/Rational.java.html

******************************
Complex.java: Compile TestC.java

To change numbers, go into TestC.java and change 'x' and 'y'.

A lot of code was referenced from the Kansas State website listed below for creating the Complex object with constructor, accessor, add,sub, mult, and div methods. The code arithmatic operations were then converted to static methods in Test.java. 

toString(), ang() and mod() were also my coding.
ang() returns angle of polar form. mod() returns radius.