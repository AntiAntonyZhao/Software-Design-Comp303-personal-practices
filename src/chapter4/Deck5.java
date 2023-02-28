/*******************************************************************************
 * Companion code for the book "Introduction to Software Design with Java" 
 * by Martin P. Robillard.
 *
 * Copyright (C) 2019 by Martin P. Robillard
 *
 * This code is licensed under a Creative Commons 
 * Attribution-NonCommercial-NoDerivatives 5.0 International License.
 * 
 * See http://creativecommons.org/licenses/by-nc-nd/5.0/
 *******************************************************************************/
package chapter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of playing cards. Simple version that 
 * includes the jokers.
 */
public class Deck5
{
	private List<Card5> aCards = new ArrayList<>();
	
	/**
	 * Creates a new deck of 55 cards, shuffled.
	 */
	public Deck5()
	{
		shuffle();
	}
	
	/**
	 * Reinitializes the deck with all 55 cards, and shuffles them.
	 */
	public void shuffle()
	{
		aCards.clear();
		for( Suit suit : Suit.values() )
		{
            for( Rank rank : Rank.values() )
            {
                aCards.add( new Card5( rank, suit ));
            }
		}
		aCards.add(new Card5(true));
		aCards.add(new Card5(false));
		Collections.shuffle(aCards);
	}
	
	/**
	 * Draws a card from the deck: removes the card from the top
	 * of the deck and returns it.
	 * @return The card drawn.
	 * @pre !isEmpty()
	 */
	public Card5 draw()
	{
		assert !isEmpty();
		return aCards.remove(aCards.size() - 1);
	}
	
	/**
	 * @return True if and only if there are no cards in the deck.
	 */
	public boolean isEmpty()
	{
		return aCards.isEmpty();
	}
}
