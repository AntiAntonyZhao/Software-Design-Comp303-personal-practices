package chapter3;

import java.util.Comparator;

public class UniversalComparator implements Comparator<Hand>{
public enum Order{UP, DOWN}
private Order pO = Order.UP;

public UniversalComparator(Order tO) {
	this.pO = tO;
}
	@Override
	public int compare(Hand pHand1, Hand pHand2) {
		if( pO == Order.UP )
		{
			return pHand1.size() - pHand2.size();
		}
		else
		{
			return pHand2.size() - pHand1.size();
		}
	}
	
public void setOrder(Order O) {
	this.pO = O;
}
}
