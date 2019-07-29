package algorithms.resolved.udemy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UrlFyTest {
	private UrlFy problem;

	@Before
	public void setUp() {
		problem = new UrlFy();
	}

	@Test
	public void checkUrlTest() {
		Assert.assertEquals("My%20Home%20Page", problem.urlify("My Home Page    ", 16));
	}

}
