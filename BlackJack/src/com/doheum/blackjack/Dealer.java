package com.doheum.blackjack;

public class Dealer extends Gamer {

	// 3칸짜리 카드리스트를 만드는 생성자
	public Dealer() {
		super(3);
	}

	public void moreCard(CardDeck cd) {
		int cardSum = 0;
				for (Card c : cardList) {
					if(c != null) {
						cardSum += c.getCalcValue();
					}
				}
			
		if (cardSum <= 16) {
			this.receiveCard(cd.pick());
		}
	}
}
