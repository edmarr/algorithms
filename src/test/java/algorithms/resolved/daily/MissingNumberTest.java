package algorithms.resolved.daily;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {

	private MissingNumber problem;

	@Before
	public void SetUp() {
		problem = new MissingNumber();
	}

	@Test
	public void solution2Test() {
		int arr[] = { 3, 4, -1, 1 };
		Assert.assertEquals(2, problem.missingInteger(arr));
	}

	@Test
	public void solution3Test() {
		int arr[] = { 1, 2, 0 };
		Assert.assertEquals(3, problem.missingInteger(arr));
	}
	
	
	@Test
	public void solution2FastTest() {
		int arr[] = { 3, 4,0, 1 };
		Assert.assertEquals(2, problem.missingIntegerFast (arr));
	}

    
}

