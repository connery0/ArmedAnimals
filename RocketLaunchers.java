package ArmedAnimals;

public class RocketLaunchers extends ArmsDecorator {
	BattleAnimal battleAnimal;

	public RocketLaunchers(BattleAnimal battleAnimal) {
		this.battleAnimal = battleAnimal;
	}

	public String getDescription() {
return battleAnimal.getDescription() + " with rocketlaunchers mounted on it's back";
}

	public String attack() {
		return battleAnimal.attack() + " while fireing a barage of rockets";
	}
}