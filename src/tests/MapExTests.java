package tests;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import exercises.MapExercises;

public class MapExTests {

	MapExercises mEx = new MapExercises();
	
	// getMapKeys({1 : "Yks", 2: "Kaks" }) -> [1, 2]
	@Test
	public void returnsMapKeys() {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Yks");
		map1.put(2, "Kaks");
		
		//assertThat(mEx.getMapKeys(map1)[0], is(1));
		//assertThat(mEx.getMapKeys(map1)[1], is(2));
		assertThat(mEx.getMapKeys(map1), is(new int[] {1,2}));
	}
	
	@Test
	public void returnsUpperMapValues() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "yks");
		map.put(2, "Kaks");
		map.put(3, "Kolm");
		
		assertThat(mEx.getUpperMapValues(map), is(new String[] {"Kaks","Kolm"}));
	}
	
}
