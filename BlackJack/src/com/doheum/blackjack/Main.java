package com.doheum.blackjack;

public class Main {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();

		Gamer gamer = new Gamer();
		gamer.receiveCard(cd.pick());
		gamer.receiveCard(cd.pick());
		
		Dealer dealer = new Dealer();
		dealer.receiveCard(cd.pick());
		dealer.receiveCard(cd.pick());
		dealer.moreCard(cd);
		
		Rule rule = new Rule();
		rule.whoIsWin(gamer,dealer);
	}
}