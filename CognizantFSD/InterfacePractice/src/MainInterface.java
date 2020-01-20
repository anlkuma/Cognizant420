
public class MainInterface {

	public static void main(String[] args) {
		Air air = new Air();
		Land land = new Land();
		Water water = new Water();
		air.setModelName("Kingfisher");
		air.setModelNumber(69);
		air.show();
		land.setModelName("Chengalpattu Express");
		land.setModelNumber(17652);
		land.show();
		water.setModelName("Titanic");
		water.setModelNumber(6969);
		water.show();

	}

}
