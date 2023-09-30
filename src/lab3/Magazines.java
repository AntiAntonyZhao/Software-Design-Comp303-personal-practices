package lab3;

public class Magazines extends ItemA{
    private String aFeaturedArticle;

    public Magazines(String pTitle, String pAuthor, Genre pGenre) {
        super(pTitle, pAuthor, pGenre);
    }


    public String getaFeaturedArticle() {
        return aFeaturedArticle;
    }

    // Overloading
    public void getDetails(String pFeaturedArticle) {
        System.out.println("Featured Article: " + pFeaturedArticle);
        System.out.println("Available Copies: " + super.getaAvailableCopies());
    }



}
