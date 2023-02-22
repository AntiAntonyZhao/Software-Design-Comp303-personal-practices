package chapter3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand>, Iterable<Card>{
	private List<Card> aCards = new ArrayList<>();
	private int maxN;

	public void add(Card c) { //Q1
		assert c!=null;
		aCards.add(c);
	}
	public void remove(Card c) { //Q1
		assert c!=null && !aCards.isEmpty();
		aCards.remove(c);
	}
	public boolean contains(Card c) { //Q1
		assert c!=null && !aCards.isEmpty();
		return aCards.contains(c);
	}
	public boolean isEmpty() { //Q1
		if(this.size()==0) {
			return true;
		}else {
			return false;}
	}
	public int size() { //Q1
		assert !aCards.isEmpty();
		return this.aCards.size();
	}
	public boolean isFull() { //Q1
		return this.size()>=maxN;
	}
	@Override
	public int compareTo(Hand pH) {
		// TODO Auto-generated method stub
		return this.aCards.size()-pH.size();
	}
	public static Comparator<Hand> DescendingCompare(){
		return new Comparator<Hand>() {

			@Override
			public int compare(Hand o1, Hand o2) {
				return o2.aCards.size()-o1.aCards.size();
			}
		};
	}
	
	public static Comparator<Hand> RankCompare(Rank pR){
		return new Comparator<Hand>() {
			@Override
			public int compare(Hand o1, Hand o2) {
				return rankCount(o1, pR)-rankCount(o2, pR);
			}
			private int rankCount(Hand h, Rank r) {
				int n = 0;
				for(Card card : h) {
					if(card.getRank()==r) {
						n++;
					}
				}
				return n;
				
			}
		};
	}
	@Override
	public Iterator<Card> iterator() {
		// TODO Auto-generated method stub
		return aCards.iterator();
	}
	
}
