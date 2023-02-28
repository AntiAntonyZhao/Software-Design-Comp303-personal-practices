package chapter3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hand_InterfaceSegregation implements HandView{
	private List<Card> aCards = new ArrayList<>();
	private int maxN;
	
	public Hand_InterfaceSegregation (int pM) {
		assert pM > 0;
		this.maxN = pM;
	}
	@Override
	public boolean contains(Card c) {
		assert c != null && this.isFull()== false;
		return aCards.contains(c);
	}

	@Override
	public boolean isEmply() {
		return aCards.size() <= 0;
	}

	@Override
	public boolean isFull() {
		return aCards.size() >= maxN;
	}

	@Override
	public Iterator<Card> iterator() {
		return aCards.iterator();
	}

}
