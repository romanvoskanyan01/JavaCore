package homework.books;

import homework.books.command.Commands;
import homework.books.exception.AuthorNotFoundException;
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
        String login;
        String password;
        login = "admin";
        password = "123456";
        System.out.println("Please input login");
        String login1 = scanner.nextLine();
        System.out.println("Please input password");
        String password1 = scanner.nextLine();
        if (!login1.equals(login) || !password1.equals(password)) {
            System.out.println("Invalid login and password");
        }
        else {
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
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
                    printBooksByPriceRange();
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
}
    private static void printBooksByPriceRange() {
        double price = 0;
        try {
            price = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input price");
        }
        double maxprice = 0;
        try {
            maxprice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input maxprice");
        }


        bookStorage.printbooksByPriceRange(price, maxprice);
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
        if (gender.equals("male") || gender.equals("female")) {
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
        Author author = null;
        try {
            author = authorStorage.getAuthorByIndex(index);
        } catch (AuthorNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (author != null) {
            authorStorage.print();
            System.out.println("Please choose author index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            try {
                Author author1 = authorStorage.getAuthorByIndex(authorIndex);
                author.setName(author.getName());
                author.setSurname(author.getSurname());
                author.setEmail(author.getEmail());
                author.setGender(author.getGender());
            } catch (AuthorNotFoundException e) {
                System.out.println("Please input correct index");
                changeBookAuthor();
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
            try {
                Author author = authorStorage.getAuthorByIndex(authorIndex);
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
            } catch (AuthorNotFoundException e) {
                System.out.println("please input correct index");
                addBook();
            }
        }
    }
}
