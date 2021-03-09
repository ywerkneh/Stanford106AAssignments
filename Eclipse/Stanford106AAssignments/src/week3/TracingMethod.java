/*
* File: Mystery.java
* ------------------
* This program doesn't do anything useful and exists only to test
* your understanding of method calls and parameter passing.
*/
import acm.program.*;
public class TracingMethod extends ConsoleProgram {
public void run() { // excution starts here
ghost(13); // ghost method is called 
}
private void ghost(int x) {   // x = 13 ,y= 0 
int y = 0;
for (int i = 1; i < x; i *= 2) {
y = witch(y, skeleton(x, i));  // witch then skeleton method are called
}                              
println("ghost: x = " + x + ", y = " + y); // 
}
private int witch(int x, int y) {    // takes a copy of the variable X,Y
x = 10 * x + y;                      // new X =130
println("witch: x = " + x + ", y = " + y);
return x;
}
private int skeleton(int x, int y) {
return x / y % 2; // returns 65
}
}