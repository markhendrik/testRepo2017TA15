package exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		MapExercises mEx = new MapExercises();
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Yks");
		map1.put(2, "Kaks");
		
		System.out.println(Arrays.toString(mEx.getMapKeys(map1)));

	}

}
