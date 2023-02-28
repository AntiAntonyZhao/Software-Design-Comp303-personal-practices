package chapter4;

import java.util.HashSet;

public class Card_HashSetCard {
	private Rank aRank;
	private Suit aSuit;

	/**
	 * Creates a new card object.
	 * 
	 * @param pRank The rank of the card.
	 * @param pSuit The suit of the card.
	 * @pre pRank != null
	 * @pre pSuit != null
	 */
	public static void main(String[] args)
	{
		Card_OptionalJoker card1 = new Card_OptionalJoker(Rank.ACE, Suit.CLUBS);
		Card_OptionalJoker card2 = new Card_OptionalJoker(Rank.ACE, Suit.DIAMONDS);
		Card_OptionalJoker card3 = new Card_OptionalJoker(Rank.ACE, Suit.CLUBS);
		HashSet<Card_OptionalJoker> set = new HashSet<>();
		set.add(card1);
		set.add(card2);
		assert card1.equals(card3);
		assert set.size() == 2;
		assert !set.add(card3);
		System.out.println("No errors");
	}

	
	private Rank aRank;
	private Suit aSuit;
	
	/**
	 * Creates a new card object.
	 * 
	 * @param pRank The rank of the card.
	 * @param pSuit The suit of the card.
	 * @pre pRank != null
	 * @pre pSuit != null
	 */
	public Card_HashSetCard(Rank pRank, Suit pSuit)
	{
		assert pRank != null && pSuit != null;
		aRank = pRank;
		aSuit = pSuit;
	}
	
	/**
	 * @return The rank of the card.
	 */
	public Rank getRank()
	{
		return aRank;
	}
	
	/**
	 * @return The suit of the card.
	 */
	public Suit getSuit()
	{
		return aSuit;
	}

	@Override
	public int hashCode()
	{
		return aSuit.ordinal() * Rank.values().length + aRank.ordinal();
	}

	@Override
	public boolean equals(Object pObject)
	{
		if(this == pObject)
		{
			return true;
		}
		if(pObject == null || getClass() != pObject.getClass())
		{
			return false;
		}
		Card_HashSetCard other = (Card_HashSetCard) pObject;
		return aSuit == other.aSuit && aRank == other.aRank;
	}

}