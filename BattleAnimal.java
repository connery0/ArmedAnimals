package ArmedAnimals;

public abstract class BattleAnimal {
	protected String description = "Unknown Creature";

	public String getDescription() {
		return description;
	}

	public abstract String attack();
}