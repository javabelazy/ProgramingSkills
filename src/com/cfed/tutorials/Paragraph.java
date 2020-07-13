/**
 * sharing a program to print sentence having maximum number of words in it...
 * 
 * As per my understanding, you may have one paragraph, which u can split() by passing "." . It will return String array of sentences.

Then u can iterate the sentence string array and split the sentence using " " (space), to get the array of words in the sentence. Then use the array.length to find the words in the sentence.

Using above approach u can find sentence with max words.

Plz share more details if there is any understanding gap.
 * 
 */
package com.cfed.tutorials;

/**
 * @author Consumerfed I T Section
 * 8281808029
 *
 */
public class Paragraph {

	private String paragraph = null;
	private int maxWordsSize = 0;
	private String maxWord = null;
	private String sentenceWithBiggestWord = null;
	private String sentenceWithMaxWordCount = null;

	public Paragraph(String paragraph) {
		this.paragraph = paragraph;
	}

	public String getSentenceWithMaxWords() {
		String[] sentenceList = paragraph.split("\\.");
		int wordCount = 0;
		for (String sentence : sentenceList) {

			String[] wordList = sentence.split("\\s");
			if (wordList.length > wordCount) {
				wordCount = wordList.length;
				sentenceWithMaxWordCount = sentence;
			}
			for (String word : wordList) {
				if (word.length() > maxWordsSize) {
					maxWordsSize = word.length();
					maxWord = word;
					sentenceWithBiggestWord = sentence;
				}

			}
		}
		return sentenceWithBiggestWord;
	}

	/**
	 * To return the sentences that contains the biggest word
	 * @return sentence : string
	 */
	public String getSentenceWithBiggestWord() {
		if (null != paragraph) {
			getSentenceWithMaxWords();
			return sentenceWithBiggestWord;
		}
		return "";
	}
	
	/**
	 * To return the sentences with the maximum number of words in it
	 * @return sentence : string
	 */
	public String getSentenceWithMaxWordCount() {
		if (null != paragraph) {
			getSentenceWithMaxWords();
			return sentenceWithMaxWordCount;
		}
		return "";
	}

	/**
	 * To return the biggest word in all the paragraph.
	 * @return
	 */
	public String gettheBiggestWord() {
		if (null != paragraph) {
			getSentenceWithMaxWords();
			return maxWord;
		}
		return "";
	}

	public static void main(String[] args) {

		String s = "javabelazyblog LONDON India’s onetime  jeweler to the stars. Nirav Modi, has been arrested in London and faces extradition to India to face allegations that he defrauded lenders. Nirav Modi built global jewelry empire, according to authorities, on web of illegal loans guaranteed by state-owned Punjab National Bank.Celebrity Jeweler Suspected in $2 Billion Fraud Arrested in London, Faces Extradition to India.";
		Paragraph p = new Paragraph(s);
		System.out.println(p.getSentenceWithMaxWords());
		System.out.println(p.sentenceWithMaxWordCount);
	}
}
