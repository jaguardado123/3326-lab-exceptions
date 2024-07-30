import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayExceptionTest {
	
	@Test
	public void testing_get_index_at_0() {
		ArrayException obj = new ArrayException();
		assertEquals(7, obj.valueAt(0) );
	}

	@Test
	public void testing_get_index_at_6() {
		ArrayException obj = new ArrayException();
		assertEquals(101, obj.valueAt(6) );
	}

	@Test
	public void testing_get_index_at_20() {
		ArrayException obj = new ArrayException();
		obj.valueAt(20);
	}
}