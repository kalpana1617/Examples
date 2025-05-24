package StringManipulation;

public class StringExamples {

	public static void main(String[] args) {

		String s2 = "kalpana";
		String s3 = "kalp";
		System.out.println(s2.compareTo(s3));

		String s4 = "kalpana";
		System.out.println(s4.length());

		char ch = s4.charAt(2);
		System.out.println(ch);

		System.out.println(s4.substring(4));

		String upper = s4.toUpperCase();
		System.out.println(upper);

		String lower = s4.toLowerCase();
		System.out.println(lower);

		String str = "  Java Programming  ";
		String trimmed = str.trim();
		System.out.println(trimmed);

		String string = "I love java";
		System.out.println(string.replace("java", "python"));

		String str2 = "Java Programming";
		boolean bool = str2.contains("Java");
		System.out.println(bool);

		String str3 = "Java";
		int index = str3.indexOf('v');
		System.out.println(index);

		String s9 = "kalpana";
		String[] words = s9.split("");
		System.out.println(words);
		for (String word : words) {
			System.out.println(word);

		}

	}

}
