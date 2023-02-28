package chapter4;

public interface Shufflable_NullInterface {
	public static final Shufflable_NullInterface NULL_SHUFFLABLE = new Shufflable_NullInterface() 
	{
		@Override
		public void shuffle()
		{ /* Do nothing */ }
	};
	
	/**
	 * Randomly reorder the objects that are the components
	 * of this object.
	 */
	void shuffle();
}
