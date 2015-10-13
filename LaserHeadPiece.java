package ArmedAnimals;

public class LaserHeadPiece extends ArmsDecorator {
	BattleAnimal battleAnimal;

	public LaserHeadPiece(BattleAnimal battleAnimal) {
		this.battleAnimal = battleAnimal;
	}

	public String getDescription() {
return battleAnimal.getDescription() + " wearing a helm with lasers";
}

	public String attack() {
		return battleAnimal.attack() + " and then fires it's lasers";
	}
}