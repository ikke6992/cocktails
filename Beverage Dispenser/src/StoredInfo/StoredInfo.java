package StoredInfo;

public class StoredInfo {
	
	String[] bottles;
	Prefab[] prefabs;
	
	public StoredInfo() {
		bottles = new String[4];
		prefabs = new Prefab[2];
	}
	
	public void newPrefab(int number, Prefab prefab) {
		if (number >= 0 && number < 2) {
			prefabs[number] = prefab;
		} else {
			System.out.println("number not valid");
		}
	}
	
	public void newBottle(int number, String name) {
		if (number >= 0 && number < 4) {
			bottles[number] = name;
		} else {
			System.out.println("number not valid");
		}
	}
	
	public Prefab getPrefab(int number) {
		if (number >= 0 && number < 2) {
			return prefabs[number];
		} else {
			System.out.println("number not valid");
			return null;
		} 
	}
	
	public String getBottle(int number) {
		if (number >= 0 && number < 4) {
			return bottles[number];
		} else {
			System.out.println("number not valid");
			return null;
		}
	}

}
