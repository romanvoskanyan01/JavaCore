package homework.books;

import homework.books.command.CommandsAdmin;
import homework.books.command.CommandsUser;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.Role;
import homework.books.model.User;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.UserStorage;

import java.util.Scanner;


public class BooksDemo implements CommandsAdmin {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();

    private static User currentUser = null;

    public static void main(String[] args) {
        userStorage.add(new User("admin", "admin", "admin@mail.com", "admin", Role.ADMIN));
        boolean run = true;
        while (run) {
            CommandsAdmin.printLoginCommands();
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
                case LOGIN:
                    login();
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command, please try again");

            }
        }


    }

    private static void login() {
        System.out.println("Please input email, password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPasswrd = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPasswrd[0]);
        if (user == null) {
            System.out.println("User does not exists!");
        } else {
            if (!user.getPassword().equals(emailPasswrd[1])) {
                System.out.println("Password is wrong!");
            } else {
                currentUser = user;
                if (user.getRole() == Role.ADMIN) {
                    adminLogin();
                } else if (user.getRole() == Role.USER) {
                    userLogin();

                }
            }


        }
    }

    private static void register() {
        System.out.println("Please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input user data");
        } else {
            if (userStorage.getUserByEmail(userData[2]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setRole(Role.USER);
                userStorage.add(user);
                System.out.println("User registered!");
            } else {
                System.out.println("User with " + userData[2] + "already exists");
            }
        }
    }

    private static void adminLogin() {
        boolean run = true;
        while (run) {
            CommandsAdmin.printAdminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
                    currentUser = null;
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

    private static void userLogin() {
        System.out.println("Welcome," + currentUser.getName());
        boolean run = true;
        while (run) {
            CommandsUser.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case CommandsUser.LOGOUT:
                    run = false;
                    break;
                case CommandsUser.ADD_BOOK:
                    addBook();
                    break;
                case CommandsUser.PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case CommandsUser.PRINT_BOOKS_BY_AUTHOR:
                    System.out.println("Please input author");
                    String author = scanner.nextLine();
                    authorStorage.print();
                    break;
                case CommandsUser.PRINT_BOOKS_BY_GENRE:
                    System.out.println("Please input genre");
                    String genre = scanner.nextLine();
                    bookStorage.printBookaByGenre(genre);
                    break;
                case CommandsUser.PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                case CommandsUser.PRINT_ALL_AUTHOR:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again");
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
        Gender[] values = Gender.values();
        for (Gender value : values) {
            System.out.print(value + ",");
        }
        String genderStr = scanner.nextLine();
        Gender gender = Gender.valueOf(genderStr.toUpperCase());
        Author author = new Author(name, surname, email, gender);
        authorStorage.add(author);
        System.out.println("Author created!");
        System.out.println("Please input for gender");
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
                Book book = new Book(title, author, price, count, genre, currentUser);
                bookStorage.add(book);
                System.out.println("Thank you book added");
            } catch (AuthorNotFoundException e) {
                System.out.println("please input correct index");
                addBook();
            }
        }
    }

}
