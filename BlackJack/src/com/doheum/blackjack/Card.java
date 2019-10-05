package com.doheum.blackjack;

public class Card {
	// shape: 스페이드, 다이아몬드, 클럽, 하트
	private final String shape;
	private final String displayValue;
	private final int calcValue;

	public Card(String shape, String displayValue, int calcValue) {
		this.shape = shape;
		this.displayValue = displayValue;
		this.calcValue = calcValue;
	}

	public int getCalcValue() {
		return calcValue;
	}

	@Override
	public String toString() {
		return String.format("shape: %s, displayValue: %s, calcValue: %d",
				shape, displayValue, calcValue);
	}
}