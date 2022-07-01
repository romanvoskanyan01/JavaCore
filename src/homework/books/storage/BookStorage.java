package homework.books.storage;

import homework.books.model.Book;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = book;
    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");

        }
    }

    public void printBooksByAuthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().equals(authorName)) {
                System.out.println(array[i]);
            } else {
                System.out.println("Invalid author please try again");
            }
        }
    }

    public void printBookaByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printbooksByPriceRange(double price, double maxprice) {
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if (book.getPrice() >= price && book.getPrice() <= maxprice) {
                System.out.println(book);
            }

        }
    }

}