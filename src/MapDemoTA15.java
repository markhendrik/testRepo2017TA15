import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

public class MapDemoTA15 {

	public static void main(String[] args) {
		
		// Mapi loomine
		Map<Integer, String> map = new HashMap<>();
		
		// Mapi lisamine
		map.put(4, "Ants");
		map.put(5, "Mari");
		map.put(75, "Kati");
		
		System.out.println("Esialgne map: " + map);
		
		// Mapi olemasoleva v�tmega v��rtuse lisamine.
		// Muudab paari v��rtust.
		map.put(4, "Johann");
		
		System.out.println("Muudetud map: " + map);
		
		// V��rtuse k�simine.
		System.out.println("V�tme j�rgi v��rtus: " + map.get(75));
		
		// Kontrollimine, kas vastava v�tmega v��rtus on olemas.
		System.out.println("Esineb paar " + map.containsKey(75));
		
		// Eemaldamine.
		map.remove(5);
		System.out.println("Peale eemaldamist: " + map);
		
		System.out.println("____________________");
		
		// Map l�bimine.
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("V�ti: " + entry.getKey() + " v��rtus: " + entry.getValue());
		}
		
		System.out.println("____________________");
		// Mapi v�tmed.
		System.out.println("Mapi v�tmed: " + map.keySet());
		for (Integer key : map.keySet()) {
			System.out.println("V�ti: " + key);
		}
		
		System.out.println("____________________");
		// Mapi v��rtused.
		System.out.println("Mapi v��rtused" + map.values());
		for (String value : map.values()) {
			System.out.println("V��rtus: " + value);
		}
		
		System.out.println("____________________");
		// Iteraatoriga l�bimine.
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> keyValue = itr.next();
			System.out.println(keyValue);
		}
		
		System.out.println("____________________");
		// Stream
		Map<Integer, String> filterMap = new HashMap<>();
		map.entrySet().stream()
					  .filter(e -> e.getValue().startsWith("K"))
					  .forEach(entry -> filterMap.put(entry.getKey(), entry.getValue()));
		System.out.println(filterMap);

	}

}
