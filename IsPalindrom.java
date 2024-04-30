public class IsPalindrom{
	public static void main(String args[]){
		if(args.length == 1 && args[0] != null){
			String word = args[0];
			if(word != null){
				System.out.println(isPalindrom(word.trim()));
				return;
			}
		}
		throw new IllegalArgumentException("Invalid word! " + args.length);
	}
	
	public static boolean isPalindrom(String word){
		System.out.println(word);
		if(word.length() == 0 || word.length() == 1) return true;
		
		char[] ch_word = word.toCharArray();
		if(ch_word[0] == ch_word[ch_word.length - 1])
			return isPalindrom(word.substring(1, word.length() - 1));
		else
			return false;
	}
}