package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapExercises {

	// 1. Mapi<Integer, String> kıik vıtmed panna eraldi massiivi.
	public int[] getMapKeys(Map<Integer, String> map) {
		int[] keys = new int[map.size()];
		int index = 0;
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {			
			keys[index] = entry.getKey();
			index++;
		}
		
		return keys;
	}
	
	// 2.Mapi v‰‰rtused, mis algavad suure t‰hega, tagastada eraldi massiivina.
	public String[] getUpperMapValues(Map<Integer, String> map) {
		List<String> upperValues = new ArrayList<String>();
		for (String value : map.values()) {
			if (Character.isUpperCase(value.charAt(0))) {
				upperValues.add(value);
			}
		}
		return upperValues.toArray(new String[upperValues.size()]);
	}
	
}
