package que_5;

public interface Lioness extends Animal
{
	default String display() {
		return "Every King needs his Queen";
	}
}
