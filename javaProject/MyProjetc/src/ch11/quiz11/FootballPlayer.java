package ch11.quiz11;

import java.util.ArrayList;
import java.util.List;

public class FootballPlayer {
	
	// 축구선수 클래스를 만들어 봅시다.
	
	private String name;
	private int number;
	private String team;
	private int age;
	// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
	// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
	
	public FootballPlayer(String name, int number ,String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age; 
	}
		
	public static void main(String[] args) {
		
		//List<Integer> numbers = new FootballPlayer<>();
		
		List<FootballPlayer> players = new ArrayList<>();
		FootballPlayer Player1 = new FootballPlayer("탁일준님", 00, "대한민국", 33); 
		FootballPlayer Player2 = new FootballPlayer("델피에로", 10, "유벤투스", 39);
		FootballPlayer Player3 = new FootballPlayer("네드베드", 11, "유벤투스", 38);
		FootballPlayer Player4 = new FootballPlayer("트레제게", 17, "유벤투스", 37);
		FootballPlayer Player5 = new FootballPlayer("칸나바로", 05, "유벤투스", 36);
		FootballPlayer Player6 = new FootballPlayer("잠브로타", 19, "유벤투스", 35);
		FootballPlayer Player7 = new FootballPlayer("마르키쇼", 07, "유벤투스", 34); 
		
		
		
		
	}

	
	

}
