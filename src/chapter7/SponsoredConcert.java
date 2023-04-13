package chapter7;

public class SponsoredConcert extends ConcertA{
    private String aSponsor;
    private int sponsorTime;

    public SponsoredConcert(String pTitle, String pPerformer, int pTime, String pSponsorName, int pSponsorTime) {
        super(pTitle, pPerformer, pTime);
        aSponsor = pSponsorName;
        sponsorTime = pSponsorTime;
    }

    @Override
    public String description()
    {
        return String.format("%s by %s sponsored by %s", title(), aPerformer, aSponsor);
    }

    @Override
    public int time()
    {
        return super.time() + sponsorTime;
    }

    @Override
    public String extra()
    {
        return super.extra() + " sponsored by " + aSponsor;
    }

}
