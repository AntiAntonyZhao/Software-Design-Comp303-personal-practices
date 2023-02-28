package chapter4;

import java.util.Comparator;

public class Game_NullComparator implements Shufflable7
{
	private static final Comparator<Card> nC = new Comparator<Card>(){
		@Override
		public int compare(Card o1, Card o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	};
   private Comparator<Card> aComparator = nC;
@Override
public void shuffle() { // Tester for question 7
	// TODO Auto-generated method stub
	
}
}


//public class Game
//{
//   private Comparator<Card> aComparator;
//}