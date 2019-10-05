package com.doheum.blackjack;

public class Rule {
	private final int STAND_SCORE = 21;
	
	public void whoIsWin(Gamer gamer, Dealer dealer) {

		System.out.println("딜러");
		int dealerSum = dealer.open();
		System.out.println("게이머");
		int gamerSum = gamer.open();

		if (gamerSum > STAND_SCORE && dealerSum > STAND_SCORE || gamerSum == dealerSum) {
			System.out.println("비겼음");
		} else if (gamerSum > STAND_SCORE) {
			System.out.println("딜러가 이김");
		} else if (dealerSum > STAND_SCORE) {
			System.out.println("게이머가 이김");
		} else if (gamerSum > dealerSum) {
			System.out.println("게이머가 이김");
		} else {
			System.out.println("딜러가 이김");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
