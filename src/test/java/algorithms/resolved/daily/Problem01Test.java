package algorithms.resolved.daily;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem01Test {

    private Problem01 problem;

    @Before
    public void SetUp() {
    	problem = new Problem01();
    }

    @Test
    public void solution17Test() {
    	int arr[] = { 10, 15, 3, 7 }; 
    	int result[] = problem.solution1(17, arr);
    	Assert.assertEquals (17, result[0]+result[1] );
    }

    @Test
    public void solution13Test() {
    	int arr[] = { 10, 15, 3, 7 }; 
    	int result[] = problem.solution1(13, arr);
    	Assert.assertEquals (13, result[0]+result[1] );
    }
    
}

