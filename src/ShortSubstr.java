
public class ShortSubstr {

	public static void main(String[] args) throws Exception {
		ShortSubstr str = new ShortSubstr();
		String word = "banacnac";
		System.out.println(str.shortestSubstring(word));
	}

	static int maxDistinctChar(String word, int n) {
		// Contador com o total de caracteres disponiveis
		int count[] = new int[256];

		// Aumenta o contador se um caracter é encontrado
		for (int i = 0; i < n; i++)
			count[word.charAt(i)]++;

		int max = 0;
		for (int i = 0; i < 256; i++) {
			if (count[i] != 0) {
				max++;
			}
		}
		
		return max;
	}

	public int shortestSubstring(String s) {

		int n = s.length(); 

		// Numero maximo de caracteres distintos
		int maxDistinct = maxDistinctChar(s, n);
		int minl = n; 

		// Encontrar todas as substrings
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				String subs = null;
				if (i < j)
					subs = s.substring(i, j);
				else
					subs = s.substring(j, i);
				int subsLenght = subs.length();
				int subDistinctChar = maxDistinctChar(subs, subsLenght);

				if (subsLenght < minl && maxDistinct == subDistinctChar) {
					minl = subsLenght;
				}
			}
		}
		return minl;
	}

}
