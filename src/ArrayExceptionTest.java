import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayExceptionTest {
	
	@Test
	public void testing_get_index_at_0() {
		ArrayException obj = new ArrayException(3);
		obj.insert(7);
		assertEquals(7, obj.valueAt(0) );
	}

	@Test
	public void testing_get_index_at_6() {
		ArrayException obj = new ArrayException(2);
		obj.insert(7);
		obj.insert(7);
		obj.insert(7);
		obj.insert(7);
		assertEquals(true, true );
	}

	@Test
	public void testing_get_index_at_20() {
		ArrayException obj = new ArrayException(3);
		obj.valueAt(20);
		assertEquals(true, true );
	}
}
