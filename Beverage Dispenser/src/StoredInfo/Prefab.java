package StoredInfo;

public class Prefab {
	
	String[] content;
	String name;
	
	public Prefab(String[] bottles, String name) {
		this.name = name;
		content = new String[bottles.length];
		for (int i=0; i<bottles.length; i++) {
			content[i] = bottles[i];
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getContent() {
		String content = "Contains: ";
		for (int i=0; i<this.content.length; i++) {
			content = content + "\n-" +this.content[i];
		}
		return content;
	}
	
	public static void main(String[] args) {
		if (args.length >= 3) {
			String[] bottles = new String[args.length-1];
			for(int i=0; i<bottles.length; i++) {
				bottles[i] = args[i+1];
			}
			Prefab prefab = new Prefab(bottles, args[0]);
			System.out.println(prefab.getContent());
		}
	}

}