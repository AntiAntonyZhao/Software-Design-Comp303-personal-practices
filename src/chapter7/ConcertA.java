package chapter7;

import chapter7.AbstractShow;

public class ConcertA extends AbstractShow
{
    protected String aPerformer;

    public ConcertA(String pTitle, String pPerformer, int pTime)
    {
        super(pTitle, pTime);
        aPerformer = pPerformer;
    }

    @Override
    public String description()
    {
        return String.format("%s by %s", title(), aPerformer);
    }
    @Override
    protected String extra()
    {
        return "by " + aPerformer;
    }

    @Override
    public Show clone() {
        return (ConcertA) super.clone();
    }
}