package lab3;

public class Book extends ItemA{


    private Librarian aLibrarian = new Librarian("Linus");

    public Book(String pTitle, String pAuthor, Genre pGenre) {
        super(pTitle, pAuthor, pGenre);

    }

    /** @pre pTitle != null
     *  @pre pAuthor != null
     *  @pre pGenre != null
     **/

    public String getaTitle() {
        return super.getaTitle();
    }

     //  @pre pNumberOfCopies != null
    public void addAvailableCopies(Integer pNumberofCopies) {
        assert pNumberofCopies != null;
        int aAvailableCopies = super.getaAvailableCopies() + pNumberofCopies;
        aLibrarian.update(aAvailableCopies);
    }

    //  @pre pNumberOfCopies != null
    public void removeAvailableCopies(Integer pNumberofCopies) {
        assert pNumberofCopies != null;
        int aAvailableCopies = super.getaAvailableCopies() + pNumberofCopies;
        aLibrarian.update(aAvailableCopies);
    }

    public void getDetails() {
        System.out.println("Genre: " + this.getaGenre());
        System.out.println("Available Copies: " + this.getaAvailableCopies());
    }

    private interface Observer {
        void update(int availableCopies);
    }

    private class Librarian implements Observer {
        private String LibrarianName;
        public Librarian(String aName) {
            LibrarianName = aName;
        }
        @Override
        public void update(int availableCopies) {
            if (availableCopies == 0) {
                System.out.println("There are no more copies available");
            }
        }
    }
}
