package intro_classes_objects;

import java.util.Scanner;

public class BookInputTest {
	public static void main(String[] args) {
		Book book1 = new Book();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter the title of the book");
		book1.title = reader.nextLine();
		
		System.out.println("Please enter the author name");
		book1.author = reader.nextLine();
		
		System.out.println("Please enter the number of pages");
		book1.numberOfPages = reader.nextInt();
		
		System.out.println("The book title is: "+book1.title);
		System.out.println("The book author is: "+book1.author);
		System.out.println("The book has "+book1.numberOfPages+" pages");

	}

}
