package lab3;

public class AvailibilityDecorator extends BookDecorator{
    public AvailibilityDecorator(String pTitle, String pAuthor, Genre pGenre) {
        super(pTitle, pAuthor, pGenre);
    }

    public void addAvailableCopies(Integer pNumberofCopies) {
        assert pNumberofCopies != null;
        int aAvailableCopies = super.getaAvailableCopies() + pNumberofCopies;
        System.out.println("There number of available copies is: " + aAvailableCopies);
    }

    public void removeAvailableCopies(Integer pNumberofCopies) {
        assert pNumberofCopies != null;
        int aAvailableCopies = super.getaAvailableCopies() - pNumberofCopies;
        System.out.println("There number of available copies is: " + aAvailableCopies);
    }
}
