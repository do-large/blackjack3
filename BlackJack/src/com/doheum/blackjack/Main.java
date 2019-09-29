package com.doheum.blackjack;

public class Main {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();		
		
		Gamer gamer = new Gamer();
		gamer.receiveCard(cd.pick());
		gamer.receiveCard(cd.pick());
		gamer.receiveCard(cd.pick());
		gamer.receiveCard(cd.pick());
		
		gamer.print();
	}
}










