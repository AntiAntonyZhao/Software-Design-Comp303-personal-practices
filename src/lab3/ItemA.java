package lab3;

public abstract class ItemA implements Item{
    private final String aTitle;
    private final String aAuthor;
    private final Genre aGenre;
    private Integer aAvailableCopies;

    public ItemA(String pTitle, String pAuthor, Genre pGenre) {
        assert pTitle != null && pAuthor != null && pGenre != null;
        aTitle = pTitle;
        aAuthor = pAuthor;
        aGenre = pGenre;
    }
    public Integer getaAvailableCopies() {
        return aAvailableCopies;
    }
    public String getaAuthor() {
        return aAuthor;
    }
    public Genre getaGenre() {
        return aGenre;
    }
    public String getaTitle() {
        return aTitle;
    }

    public void getDetails() {
        System.out.println("Title: " + this.getaTitle());
    }
}
