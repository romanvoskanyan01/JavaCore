package homework.books;

import homework.books.command.Commands;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BooksDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR:
                    System.out.println("Please input author");
                    String author = scanner.nextLine();
                    authorStorage.print();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    System.out.println("Please input genre");
                    String genre = scanner.nextLine();
                    bookStorage.printBookaByGenre(genre);
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    System.out.println("Please input price");
                    double price = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input maxprice");
                    double maxprice = Integer.parseInt(scanner.nextLine());
                    bookStorage.printbooksByPriceRange(price, maxprice);
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }
        }
    }

    private static void addAuthor() {
        System.out.println("Please input author name");
        String name = scanner.nextLine();
        System.out.println("Please input author surname");
        String surname = scanner.nextLine();
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        System.out.println("Please input author gender");
        String gender = scanner.nextLine();
        if (gender.equals("male") || gender.equals("famale")){
            Author author = new Author(name, surname, email, gender);
            authorStorage.add(author);
            System.out.println("Author created!");
        } else {
            System.out.println("Please input for gender");
        }
    }
    private static void changeBookAuthor() {
        authorStorage.print();
        System.out.println("Please input author index");
        int index = Integer.parseInt(scanner.nextLine());
        Author author = authorStorage.getAuthorByIndex(index);
        if (author != null) {
            authorStorage.print();
            System.out.println("Please choose author index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author1 = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("Please input correct index");
                changeBookAuthor();
            } else {
                author.setName(author.getName());
                author.setSurname(author.getSurname());
                author.setEmail(author.getEmail());
                author.setGender(author.getGender());
            }
        }
    }


    private static void addBook() {
        if (authorStorage.getSize() == 0) {
            System.out.println("Please add author");
            addAuthor();
        } else {
            authorStorage.print();
            System.out.println("Please choose author index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("please input correct index");
                addBook();
            } else {
                System.out.println("Please input book title");
                String title = scanner.nextLine();
                System.out.println("Please input book price");
                String priceStr = scanner.nextLine();
                System.out.println("Please input book count");
                String countStr = scanner.nextLine();
                System.out.println("Please input book genre");
                String genre = scanner.nextLine();

                double price = Integer.parseInt(priceStr);
                int count = Integer.parseInt(countStr);
                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("Thank you book added");


            }


        }


    }
}
