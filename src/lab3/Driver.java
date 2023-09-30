package lab3;

public class Driver {
    public static void main(String[] args) {
        McGillLibrary aMcGillLibrary = new McGillLibrary();

        Book LOTR = new Book("Lord of The Rings", "Tolkein", Genre.FANTASY);
        Book Hobbit = new Book("The Hobbit", "Tolkein", Genre.FANTASY);
        Book Bliss = new Book("Mr. Bliss", "Tolkein", Genre.CHILDREN);
        Book Eragon = new Book("Eragon", "Paolini", Genre.FANTASY);

        aMcGillLibrary.addItemToLibrary(LOTR);
        aMcGillLibrary.addItemToLibrary(Hobbit);
        aMcGillLibrary.addItemToLibrary(Bliss);
        aMcGillLibrary.addItemToLibrary(Eragon);
    }
}
