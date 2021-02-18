package whoLikes;



public class Solution {

	public static String whoLikesIt(String... names) {
		String textoDevuelto = "";
		if (names.length == 0) {
			textoDevuelto = "no one likes this";
		} else if (names.length == 1) {
			textoDevuelto = names[0] + " likes this";
		} else if (names.length == 2) {
			textoDevuelto = names[0] + " and " + names[1] + " likes this";
		} else if (names.length == 3) {
			textoDevuelto = names[0] + ", " + names[1] + " and " + names[2] + " likes this";
		} else {
			textoDevuelto = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others likes this";
		}
		return textoDevuelto;
	}
}
