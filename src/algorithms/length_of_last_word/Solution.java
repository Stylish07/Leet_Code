package algorithms.length_of_last_word;

public class Solution {
	public int lengthOfLastWord(String s) {
		int wordLength = 0;
		boolean findLastWord = false;

		for (int i = s.length() - 1; i >= 0; i--) {
			String nowChar = s.substring(i, i + 1);
			System.out.println(nowChar);

			if (!nowChar.equals(" ")) {
				wordLength++;
				findLastWord = true;
			}

			if (findLastWord && nowChar.equals(" ")) {
				return wordLength;
			}

		}

		return wordLength;
	}
}
