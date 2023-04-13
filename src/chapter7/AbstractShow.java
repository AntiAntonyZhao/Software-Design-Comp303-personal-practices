package chapter7;

public class AbstractShow implements Show{

    private String aTitle;
    private int aTime;

    public AbstractShow(String pTitle, int pTime) {
        aTitle = pTitle;
        aTime = pTime;
    }
    @Override
    public String title() {
        return aTitle;
    }

    @Override
    public String description() {
        return String.format("%s: %s (%d minutes)", title(), extra(), time());
    }

    protected String extra() {
        return null;
    }

    @Override
    public int time() {
        return aTime;
    }

    @Override
    public Show clone() {
        try
        {
            return (AbstractShow) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            return null;
        }
    }
}
