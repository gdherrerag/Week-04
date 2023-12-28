package week4;

public class Week4CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			nxt(2,1); /* this method is described in coding step # 13 */
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 65}; /* array of Int declared and initialized on the same line*/ 
			nxt(1,'a');
			//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
			int firstValue = ages[0]; 
			int lastValue = ages[ages.length-1]; 
			System.out.println(lastValue-firstValue);
			/* since arrays are based in index 0, to find the first element we call the array name and 0 between braces. variable type is defined and both variables have been initialized accordingly. to find the last element we use ".length"  (you have to subtract 1 due to index starting with 0). It is an array property that tells how many elements the array has. finally the first element's value is deducted from the last element's value and it´s printed out to the console */
			nxt(1,'b');
			//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
				//i. Make sure that there are 9 elements of type int in this new array. 
				//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
				//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
			int[] ages2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 200};  
			int firstValue2 = ages2[0]; 
			int lastValue2 = ages2[ages2.length-1]; 
			System.out.println(lastValue2-firstValue2);
			/* second array of Int declared and initialized with 9 elements. this code will work with arrays of different lengths.  again the first element is declared and initialized using index 0, and to make sure we use the last element of the array we find the length of the array and subtract 1. finally the first element's value is deducted from the last element's value and it´s printed out to the console*/
			nxt(1,'c');
			//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			int sumAge = 0; 
			for (int i = 0; i < ages2.length; i++ ) { 
				sumAge += ages2[i]; 
			}
			System.out.println(sumAge/ages2.length);
			/* a variable "sumAge" is declared and initialized with value 0. this will be used to store the sum total. then we create a for loop that runs as many times as the number of elements in the array and increases the value of "sumAge" adding each element's value every time the for loop iterates. the average is printed out to the console by dividing the total by the amount of elements in the array */
					
			nxt(3,2);
//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			nxt(	1,'a');
			//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			int sumLetters = 0;  
			for (int i = 0; i < names.length; i++) { 
				sumLetters += names[i].length(); 
			}
			System.out.println(sumLetters / names.length); 
			/* first "names" array of String is declared and initialized with the elements of the array separated by commas. an int variable called "sumLetters" is declared and initialized it with value 0. With a for loop, the length of each element is found using the method ".length()" and is added to the value of "sumLetters" each time this for loop iterates. Finally, the average number of letters per name is printed out to the console by dividing the sumLetters value by the array length */
			nxt(1,'b');
			//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			String namesTogether = ""; 
			for (int i = 0; i < names.length; i++) { 
				namesTogether += names[i] + " "; 
			}
			System.out.println(namesTogether); 
			/* a String variable "namesTogether" is declared and initialized with no value. Then, Using a for loop we get each element in the array and concatenate it together with a blank space and add it to the value of "namesTogether" each time the for loop iterates. The final value of "namesTogether" is printed out to the console*/
			
			nxt(3,3);
//		3. How do you access the last element of any array?
			System.out.println(names[names.length-1]); 
			/* to access the last element of an array, you use the .length variable and subtract 1 (due to arrays being 0-based, which means that the first element occupies spot 0; the second element, spot 1; the third element, spot 2 and so on)*/
			
			nxt(3,4);		
//		4. How do you access the first element of any array?
			System.out.println(names[0]); 
			/* since arrays are 0-based, the first element is always on index 0.*/
			
			nxt(3,5);
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			int[] nameLengths = new int[names.length]; 
			for (int i = 0; i < names.length; i++) { 
				nameLengths[i] = names[i].length();
				System.out.println(nameLengths[i]);
			} 
			/* an array of int called "nameLengths" is declared and initialized with the same length from the array "names" in the previous code Step. then we use a for loop that gets the length of each element from array "names" and assigns that value to each element in the new array "nameLengths" */
			
			nxt(3,6);
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			int sumElements = 0; 
			for (int i = 0; i < nameLengths.length; i++) { 
				sumElements += nameLengths[i];
			}
			System.out.println(sumElements); 
			/* a new int variable "sumElements" is declared and initialized with value 0. Then with a for loop the value of each element in "nameLengths" is added to the value of "sumElements" on each iteration and finally it is printed out to the console*/
			
			nxt(3,7);
//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			System.out.println(wordToItself("cellphone",2));
			/* "wordToItself" method test is printed out to the console. the actual method is written below the main class */
			
			nxt(3,8);
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).		
			System.out.println(fullName("Gerardo", "Herrera"));
			/* "fullName" method test is printed out to the console. the actual method is written below the main class */
			
			nxt(3,9);
//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.		
			int[] arrTest = {5,6,7,8,9,10,1,3,98};
			System.out.println(greaterSum(arrTest));
			/* "greaterSum" method test is printed out to the console. the actual method is written below the main class */
			
			nxt(3,10);
//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
			double[] testArray = {4.5, 5.5, 6.5, 7.5, 8.5};
			System.out.println(averageOfDouble(testArray));
			/* "averageOfDouble" method test is printed out to the console. the actual method is written below the main class */

			nxt(3,11);
//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.		
			double[] testArray1 = {5.5, 6.5, 7.5};
			double[] testArray2 = {2.5, 3.5, 4.5};
			System.out.println(averageOfGreaterDouble(testArray1, testArray2));
			/* "averageOfGreaterDouble" method test is printed out to the console. the actual method is written below the main class */

			nxt(3,12);
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			boolean isHotOutside = true;
			double moneyInPocket = 45.6;
			System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
			/* "willBuyDrink" method test is printed out to the console. the actual method is written below the main class */
			
			nxt(3,13);
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			/* "nxt" method is printed out to the console on each code step. the actual method is written below the main class */
			
		} //end of main class, all Methods are written below
		
//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			public static String wordToItself(String word, int n) {
				String concatenated = "";
				for (int i = 0; i < n; i++) {
					concatenated += word;	
				}
				return concatenated;
			} /* the first parameter of the method is a String called "word" and the second parameter is an int called "n". in the method body we create a String variable with empty value called "concatenated". then, using a for loop that iterates as many times as the variable "n", the variable "word" is added to the value of "concatenated". finally, the method returns the new value of "concatenated" */
			

//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			public static String fullName(String firstName, String lastName) {
				String firstAndLastName = firstName + " " + lastName;
				return firstAndLastName;
			}
			/* this method returns a String. The first parameter of the method is a String called "firstName" and the second parameter is a second String  called "lastName". in the method body we declare a new String variable called "firstAndLastName" and initialize it with the values of "firstName" and "lastName" concatenated together with a blank space in between. then the method returns the new value of "firstAndLastName" */
			
//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			public static boolean greaterSum (int [] arr) {
				int sum = 0;
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
				} if ( sum > 100) {
					return true;
				} else return false;
			}
			/* this method returns a boolean. the only parameter is an array of int called "arr". in the method body, an int variable "sum" is declared and initialized with value 0. then, using a for loop, the value of each element of the array is added to the value of "sum". using an if statement after the loop ends, the final value of sum is evaluated to be greater than 100. in the case the if statement evaluates to true, the method returns "true". finally, an else statement is used for the method to return "false" in the case the if statement evaluates to false   */

//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
			public static double averageOfDouble(double [] arr ) {
				double sum = 0.0;
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
				}
				sum /= arr.length;
				return sum;			
			}
			/* this method returns a double. the only parameter is an array of double called "arr". the body of the method creates a double variable called "sum" with value 0.0. then, using a for loop we get the value of each element in the array and add it to the value of "sum". after the loop, the method returns the value of "sum" divided by the array length */

//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			public static boolean averageOfGreaterDouble(double [] arr1, double [] arr2) {
				double sum1 = 0.0; 
				double sum2 = 0.0;
				for (int i = 0; i < arr1.length; i++) {
					sum1 += arr1[i];
				}
				sum1 /= arr1.length;
				for (int i = 0; i < arr2.length; i++) {
					sum2 += arr2[i];
				}
				sum2 /= arr2.length;
				if (sum1 > sum2) {
					return true;
				} else {
					return false;
				}				
			}
			/* this method returns a boolean. it takes two arrays of double as the two parameters being called "arr1" and "arr2". the body of the method creates two double variables called "sum1" and "sum2" with value 0.0. then, using a for loop we get the value of each element in "arr1" and add it to the value of "sum1". after the loop, "sum1" is divided by the  length of "arr1" giving "sum1" a final value. a second for loop is used to get the value of each element in "arr2" and add it to the value of "sum2". after the loop, "sum2" is divided by the length of "arr2" giving "sum2" a final value. finally, the method returns "true" if the value of "sum1" is evaluated to be greater than the value of "sum2" using an If Else statement which returns "false" if not. */

//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			public static boolean willBuyDrink(boolean temp, double cash) {
				if ((temp == true) && (cash > 10.5)) {
					return true;
				} else return false;
			}
			/* this method returns a boolean. the first parameter is a boolean called "temp" and the second parameter is a double called "cash". using an If else statement it evaluates that "temp" is true and "cash" to be greater than 10.5. the method returns true in the case both conditions are evaluated to be true and false if at least one is not */
			
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			public static void nxt(int linesToSpace, int codeStep ) {

				for (int i=0; i < linesToSpace; i++ ) {
					System.out.println();
				}
				System.out.println("---------------");
				System.out.println();
				System.out.println("Coding Step # " + codeStep + ") ");
			}
			public static void nxt(int linesToSpace, char codePart) {
				for (int i=0; i < linesToSpace; i++ ) {
					System.out.println();
				}
				System.out.println("Part " + codePart + ") ");
			}
			public static void nxt(int linesToSpace) {
				for (int i=0; i < linesToSpace; i++ ) {
				System.out.println();
				}
			}
			/* the return type for this method is void meaning that it does not return anything but only performs the code lines in the body. it has three parameter alternatives and does similar procedures. I created it to provide a nicer view on the console when printing out the tests for the current assignment. they all take a first parameter of int called "linesToSpace". it is used in the method body to print out to the console an empty line as many times using a for loop. the first version takes a second parameter of int called "codeStep". After the for loop, it prints an extra line with dashes, another empty line and a final line that concatenates the text "Coding Step # " plus the "codeStep" plus a closing parenthesis. the second version takes a second parameter of char called "codePart". After the for loop, it prints an extra line that concatenates the text "Part " plus the "codePart" plus a closing parenthesis. The third version only takes the first parameter as indicated before. */
			
	//
	}