package ch11.quiz11;

import java.util.HashSet;
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

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	@Override
	public int hashCode() {
	    return this.team.charAt(team.length()-1)%5;
	}

	@Override
	public boolean equals(Object obj) { 
		
		boolean result = false;
		
	    if(obj != null && obj instanceof FootballPlayer) {
		      FootballPlayer sp = (FootballPlayer)obj;
		      result = team.equals(sp.getTeam()) && name.equals(sp.getName()) && age == sp.getAge();
		      // 문자끼리 비교할떄는 equals() 비교  /  int? 숫자비교는 그냥 == 으로 비교.
		}
		
		System.out.println(result);
		
		return result; 
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

//	public static void main(String[] args) {
//		
//		
//		List<FootballPlayer> players = new ArrayList<>();
//		FootballPlayer Player1 = new FootballPlayer("탁일준님", 00, "대한민국", 33); 
//		FootballPlayer Player2 = new FootballPlayer("델피에로", 10, "유벤투스", 39);
//		FootballPlayer Player3 = new FootballPlayer("네드베드", 11, "유벤투스", 38);
//		FootballPlayer Player4 = new FootballPlayer("트레제게", 17, "유벤투스", 37);
//		FootballPlayer Player5 = new FootballPlayer("칸나바로", 05, "유벤투스", 36);
//		FootballPlayer Player6 = new FootballPlayer("잠브로타", 19, "유벤투스", 35);
//		FootballPlayer Player7 = new FootballPlayer("마르키쇼", 07, "유벤투스", 34); 
//		}
//
//	
//	
//
}
