package CodingExamples;

public class PoolPuzzle {
	public static void main(String [] args) {
		 int x = 0;
	        while ( x < 4 ){
	            System.out.print("a");
	            if( x < 1 ){
	                System.out.print(" ");
	            }
	            System.out.print("n");
	            if ( x > 1 ){
	                System.out.print(" oyster");
	                x = x + 2;
	            }
	            if ( x == 1 ){
	                System.out.print("noys");
	            }
	            if ( x < 1 ){
	                System.out.print("oise");
	            }
	            System.out.println("");
	            x = x + 1;
	        }
	    }
	}

/*
int x = 1;
while ( x < 10 ) {
x = x + 1;
if ( x > 3) {
System.out.println(“big x”);
}
}
} This will compile and run (no output), but
}
 without a line added to the program, it
would run forever in an infinite ‘while’ loop!
*/

/*
class Foo {
public static void main(String [] args) {
int x = 5;
while ( x > 1 ) {
x = x - 1;
if ( x < 3) {
System.out.println(“small x”);
}
}}}
 This file won’t compile without a
 class declaration, and don’t forget
 the matching curly brace !
*/

/*class Exercise1b {
public static void main(String [] args) {
int x = 5;
while ( x > 1 ) {
x = x - 1;
if ( x < 3) {
System.out.println(“small x”);
}}}

Code Magnets:
Exercise Solutions
The ‘while’ loop code must be inside
a method. It can’t just be
hanging out inside the class.
*/