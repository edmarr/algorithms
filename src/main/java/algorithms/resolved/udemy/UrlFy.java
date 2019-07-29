package algorithms.resolved.udemy;

/**
 * Challenge: See if you can replaces all the spaces in a a string with the
 * ASCII symbol for space '%20'. Assume you are given the length of the final
 * string. Hint: Use array of char[] Assert.assertEquals("My%20Home%20Page",
 * urlConverter.urlify("My Home Page ", 16));
 *
 */
public class UrlFy {

	public String urlify(String string, int i) {
		StringBuilder sb  = new  StringBuilder(string.replaceAll(" ", "%20"));
		return sb.toString().substring(0, i);
	}

}
