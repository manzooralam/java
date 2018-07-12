package practice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class FileExamples {
	public static void main(String[] args) throws IOException {
		// File helps us to create, delete, get details about a file.
		File file = new File("FileName.txt");

		// Check if the file exists
		System.out.println(file.exists());

		// If file does not exist creates it and returns true
		// If file exists, returns false
		System.out.println(file.createNewFile());

		// Gets the full path of file
		System.out.println("file.getAbsolutePath() : " +file.getAbsolutePath());
		System.out.println("file.isFile() : " +file.isFile());// true
		System.out.println("file.isDirectory() : " +file.isDirectory());// false

		// Renaming a file
		File fileWithNewName = new File("NewFileName.txt");
		file.renameTo(fileWithNewName);
		// There is no method file.renameTo("NewFileName.txt");

		// A File class in Java represents a file and directory.
		File directory = new File("src/com/m");

		// prints full directory path
		System.out.println("directory.getAbsolutePath()" +directory.getAbsolutePath());
		System.out.println(directory.isDirectory());// true

		File fileInDir = new File(directory, "NewFileInDirectory.txt");
		// This does not create the actual file.

		// Actual file is created when we invoke createNewFile method
		System.out.println(fileInDir.createNewFile()); // true - First Time

		// Prints the files and directories present in the folder
		System.out.println(Arrays.toString(directory.list()));

		// Creating a directory
		File newDirectory = new File("newfolder");
		System.out.println(newDirectory.mkdir());// true - First Time

		// Creating a file in a new directory
		File notExistingDirectory = new File("notexisting");
		File newFile = new File(notExistingDirectory, "newFile");

		// Will throw Exception if uncommented: No such file or directory
		// newFile.createNewFile();

		System.out.println(newDirectory.mkdir());// true - First Time

		// Implementations of Writer and Reader abstract classes help us
		// to write and read (content of) files.

		// Writer methods - flush, close, append (text)
		// Reader methods - read, close (NO FLUSH)

		// Writer implementations - FileWriter,BufferedWriter,PrintWriter
		// Reader implementations - FileReader,BufferedReader

		// Write a string to a file using FileWriter
		// FileWriter helps to write stuff into the file
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("How are you doing?");
		// Always flush before close. Writing to file uses Buffering.
		fileWriter.flush();
		fileWriter.close();

		FileReader fileReader = new FileReader(file);
		char[] temp = new char[25];

		// Read from file using FileReader
		// fileReader reads entire file and stores it into temp
		System.out.println(fileReader.read(temp));// 18 - No of characters Read
													// from file

		System.out.println(Arrays.toString(temp));// output below
		// [H, o, w, , a, r, e, , y, o, u, , d, o, i, n, g, ?,  ,  ,  ,  ,  ,  ,
		//  ]

		fileReader.close();// Always close anything you opened :)

		// FileWriter Constructors
		// can accept file(File) or the path to file (String) as argument
		// When a writer object is created, it creates the file,
		// if it does not exist

		FileWriter fileWriter2 = new FileWriter("FileName.txt");
		fileWriter2.write("How are you doing Buddy?");
		// Always flush before close. Writing to file uses Buffering.
		fileWriter2.flush();
		fileWriter2.close();

		// FileReader Constructors
		// can accept file(File) or the path to file (String) as argument
		FileReader fileReader2 = new FileReader("FileName.txt");
		System.out.println(fileReader2.read(temp));// 24
		System.out.println(Arrays.toString(temp));// output below

		// BufferedWriter Constructors only accept another Writer as argument
		FileWriter fileWriter3 = new FileWriter("BufferedFileName.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter3);

		bufferedWriter.write("How are you doing Buddy?");
		bufferedWriter.newLine();
		bufferedWriter.write("I'm Doing Fine");
		// Always flush before close. Writing to file uses Buffering.
		bufferedWriter.flush();
		bufferedWriter.close();
		fileWriter3.close();

		// BufferedReader helps to read the file line by line
		// BufferedReader Constructors only accept another Reader as argument
		FileReader fileReader3 = new FileReader("BufferedFileName.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader3);

		String line;
		// readLine returns null when reading the file is completed.
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}

		// PrintWriter helps writing to file in a formatted way.
		// PrintWriter constructor supports varied kinds of arguments
		// File
		// String
		// Writer
		PrintWriter printWriter = new PrintWriter("PrintWriterFileName.txt");
		// Other than write function you can use format, printf, print, println
		// functions to write to PrintWriter file.

		// writes "        My Name" to the file
		printWriter.format("%15s", "My Name");

		printWriter.println(); // New Line
		printWriter.println("Some Text");

		// writes "Formatted Number : 4.50000" to the file
		printWriter.printf("Formatted Number : %5.5f", 4.5);
		printWriter.flush();// Always flush a writer
		printWriter.close();

		FileReader fileReader4 = new FileReader("PrintWriterFileName.txt");
		BufferedReader bufferedReader2 = new BufferedReader(fileReader4);

		String line2;
		// readLine returns null when reading the file is completed.
		while ((line2 = bufferedReader2.readLine()) != null) {
			System.out.println(line2);
		}

	}
}
