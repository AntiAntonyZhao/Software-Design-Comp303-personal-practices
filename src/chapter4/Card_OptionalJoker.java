package chapter4;

import java.util.Optional;

public class Card_OptionalJoker implements Comparable<Card_OptionalJoker>{
private enum Joker{WHITE, BLACK}
private final Optional<Joker> aJ;
private final Optional<Rank> aR;
private final Optional<Suit> aS;


public Card_OptionalJoker(Rank pR, Suit pS) {
	assert pR != null && pS != null;
	aR = Optional.of(pR);
	aS = Optional.of(pS);
	aJ = Optional.empty();
}
public Card_OptionalJoker(boolean isWhite) {
	aR = Optional.empty();
	aS = Optional.empty();
	if(isWhite) {
		aJ = Optional.of(Joker.WHITE);
	}else {
		aJ = Optional.of(Joker.BLACK);
	}
}



public boolean isJoker() {
	return aJ.isPresent();
}
public boolean isBlack() {
	return aJ.isPresent()&& aJ.get()==Joker.BLACK;
}
public boolean isWhite() {
	return aJ.isPresent()&& aJ.get()==Joker.WHITE;
}
public Rank getRank()
{
	return aR.get();
}

/**
 * @return The suit of the card.
 */
public Suit getSuit()
{
	return aS.get();
}

@Override
public int compareTo(Card_OptionalJoker pC) {
	// TODO Auto-generated method stub
	if(this.isJoker() && pC.isJoker()) {
		return 0; // No indication of which of BLACK and WHITE is bigger
	}else if(this.isJoker() && !pC.isJoker()) {
		return 1;
	}else if(!this.isJoker() && pC.isJoker()) {
		return -1;
	}else {
		return this.getRank().compareTo(pC.getRank());
	}
}

}
