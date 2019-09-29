package com.doheum.blackjack;

public class Gamer {
	//딜러가 게이머를 상속받을거라서 배열사이즈를 생성자한테 정하라고 하기
	private Card[] cardList;

	public Gamer() {
		cardList = new Card[49];
	}

	public void receiveCard(Card card) {
		for (int i = 0; i < cardList.length; i++) {
			if (cardList[i] == null) {
				cardList[i] = card;
				break;  //return; 적어줘도됨 > 메서드자체를 끄는 역할
			}
		}
	}
	
	public void print() {
		for(Card c: cardList) {
			if(c != null) {
				System.out.println(c);
			}
		}
		
	}
	
}