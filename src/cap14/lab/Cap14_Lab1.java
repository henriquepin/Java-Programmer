package cap14.lab;

import java.util.HashMap;
//import java.util.Map;

public class Cap14_Lab1 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> pessoaMap = new HashMap<>();
		
		pessoaMap.put("Roberto", 35);
		pessoaMap.put("Carla", 26);
		pessoaMap.put("Gabriel", 18);
		pessoaMap.put("Bruna", 17);
		
		System.out.println("--Pessoas--");
//		pessoaMap.get("Roberto");
//		System.out.println("Roberto: " + pessoaMap.get("Roberto"));
//		System.out.println("Carla: " + pessoaMap.get("Carla"));
//		System.out.println("Gabriel: " + pessoaMap.get("Gabriel"));
//		System.out.println("Bruna: " + pessoaMap.get("Bruna"));
		
		pessoaMap.forEach((n,i) -> System.out.println(n + ": " + i)); 
	}
}
