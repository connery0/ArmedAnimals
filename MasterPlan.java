package ArmedAnimals;

public class MasterPlan {
	public static void main(String args[]) {
		BattleAnimal battleAnimal = new Dog();
		System.out.println(battleAnimal.getDescription() + "\t When in danger:\t" + battleAnimal.attack());
		
		BattleAnimal beverage2 = new Dolphin();
		beverage2 = new LaserHeadPiece(beverage2);
		beverage2 = new RocketLaunchers(beverage2);
		System.out
				.println(beverage2.getDescription()  + "\tWhen in danger:\t" + beverage2.attack());
		
		BattleAnimal beverage3 = new Dog();
		beverage3 = new RocketLaunchers(beverage3);
		System.out
				.println(beverage3.getDescription() + "\tWhen in danger:\t"  + beverage3.attack());
	}
}