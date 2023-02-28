package chapter3;

import java.util.Iterator;

public interface HandView extends Iterable<Card>{
	public boolean contains(Card c);
	public boolean isEmply();
	public boolean isFull();
	public Iterator<Card> iterator();

}
