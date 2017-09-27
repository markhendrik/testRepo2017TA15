package linkedList;
import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTests {

	@Test
	public void createdListHasNoElements() {
		MyLinkedList list = new MyLinkedList();
		assertEquals(list.size(), 0);
	}
	
}
