package lab3;

public abstract class BookDecorator extends Book{
    /**
     * @param pTitle
     * @param pAuthor
     * @param pGenre
     * @pre pTitle != null
     * @pre pAuthor != null
     * @pre pGenre != null
     */
    protected Book decoratedBook;
    public BookDecorator(String pTitle, String pAuthor, Genre pGenre) {
        super(pTitle, pAuthor, pGenre);
    }
    public void setDecoratedBook(Book book) {
        decoratedBook = book;
    }
}
