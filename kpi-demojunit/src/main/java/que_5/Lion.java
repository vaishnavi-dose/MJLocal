package que_5;

public interface Lion extends Animal 
{
	default String display() {
		return "I'm the King Jungle";
	}
}
