package it.polito.tdp.spellchecker.model;

public class RichWord {
	
	private String word ;
	private boolean correct ;
	
	public RichWord(String word, boolean isCorrect) {
		super();
		this.word = word;
		this.correct = isCorrect;
	}

	public RichWord(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean isCorrect) {
		this.correct = isCorrect;
	}

	@Override
	public String toString() {
		return "RichWord [word=" + word + ", correct=" + correct + "]";
	}
	
}
