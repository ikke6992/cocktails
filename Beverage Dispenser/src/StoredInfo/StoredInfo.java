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
			
		}
	}
	
	public void newBottle(int number, String name) {
		if (number >= 0 && number < 4) {
			bottles[number] = name;
		} else {
			System.out.println("number not valid");
		}
	}

}