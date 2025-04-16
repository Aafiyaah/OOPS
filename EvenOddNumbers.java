import java.io.*; 
import java.util.Scanner; 
public class EvenOddNumbers { 
public static void main(String[] args) { 
try { 
Scanner inputScanner = new Scanner(System.in); 
System.out.print("Enter the name of the input file: "); 
String inputFileName = inputScanner.nextLine(); 
FileInputStream inputFile = new FileInputStream(inputFileName); 
Scanner fileScanner = new Scanner(inputFile); 
FileOutputStream evenFile = new FileOutputStream("even.txt"); 
FileOutputStream oddFile = new FileOutputStream("odd.txt"); 
PrintWriter evenWriter = new PrintWriter(evenFile); 
PrintWriter oddWriter = new PrintWriter(oddFile); 
while (fileScanner.hasNextInt()) { 
int number = fileScanner.nextInt(); 
if (number % 2 == 0) { 
evenWriter.println(number); 
} else { 
oddWriter.println(number); 
} 
} 
evenWriter.close(); 
oddWriter.close(); 
inputFile.close(); 
System.out.println("Even and odd numbers have been copied to separate files."); 
} catch (IOException e) { 
System.err.println("Error: " + e.getMessage()); 
} 
} 
} 
