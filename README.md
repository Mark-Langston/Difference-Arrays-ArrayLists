// CSC262 Programming in JAVA<br>
// Mark Langston    5/21/2024<br>

# Difference-Arrays-ArrayLists

This repository contains examples and descriptions of both arrays and ArrayLists in JAVA

## Arrays in JAVA

**Example of an array:**

String[] colors = {"red", "blue", "green"};
<br>
or alternatively
<br>
String[] colors;<br>
colors = new String[3];<br>
colors[0] = "red";<br>
colors[1] = "blue";<br>
colors[2] = "green;<br>
<br>
An array can't have mixed data types, so you can't mix int with String etc.
Once an array is created, it's size can't be changed. This makes arrays an
efficient choice for storing several related values of the same data type.
Arrays can also be in 2d form, in math it would be called a matrix. 2d arrays
have many applications, they can even be used to create tables of data or draw
images and patterns to the screen.

**Example of a 2d array:**<br><br>
int[][] grid = {<br>
 {10, 15, 27},<br>
 {22, 36, 15},<br>
 {48, 11, 99}<br>
};<br>
<br>
The example above is a 3x3 matrix of integers. Each element in a 2d array
can be accessed by using the row and column indices.
 
## ArrayLists in JAVA

**Example of an ArrayList:**

ArrayList<Integer> coins = new ArrayList<>();<br>
coins.add(1);<br>
coins.add(5);<br>
coins.add(10);<br>
coins.add(25);<br>
<br>
In the example above, more values can continue to be appended to the ArrayList.
A size did not need to be defined or locked down. Later in the program if more
coins need to be added or coins need to be removed from the ArrayList, it can be
done.
<br>
  * Add elements add()
  * Remove elements remove()
  * Acess elemnts get()
<br>
With all of this information, it makes sense that its more practical to use an
array when the number of elements in your list is fixed and when optimization
is critical. You should use ArrayLists when you need to be able to modify the
collected data in the list throughout the program.
<br>
Each are very useful data structures in JAVA that can meet specific program needs.

