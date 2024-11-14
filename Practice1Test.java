package ram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Practice1Test {

	@Test
	void test() {
		//fail("Not yet implemented");
		Practice1 i=new Practice1();
		int[] arr= {10,20};
		Assertions.assertEquals(20, i.SI(10, 10, 10));
		Assertions.assertEquals(10, i.discount(10));
		Assertions.assertEquals(10, i.minvalue(arr));
		
	}
}
