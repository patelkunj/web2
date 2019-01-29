import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_Country {

	@Test
	void testFindIt() {
		Country c = new Country("India",2352345,23453543,56453465,6865765,786786);
		assertEquals("India", c.getName());
	}

	@Test
	void testgetY2013() {
		Country c = new Country("India",2352345,23453543,56453465,6865765,786786);
		assertEquals(c.getY2013(),2352345);
		
	}

	@Test
	void testgetY2014() {
		Country c = new Country("India",2352345,23453543,56453465,6865765,786786);
		assertEquals(23453543,c.getY2014());
		
	}
	@Test
	void testgetY2015() {
		Country c = new Country("India",2352345,23453543,56453465,6865765,786786);
		assertEquals(56453465,c.getY2015());
		
	}
	@Test
	void testgetY2016() {
		Country c = new Country("India",2352345,23453543,56453465,6865765,786786);
		assertEquals(6865765,c.getY2016());
		
	}
	@Test
	void testgetY2017() {
		Country c = new Country("India",2352345,23453543,56453465,6865765,786786);
		assertEquals(786786,c.getY2017());
		
	}
}
