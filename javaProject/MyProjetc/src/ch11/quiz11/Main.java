package ch11.quiz11;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서
		// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		ArrayList<FootballPlayer> myTeam = new ArrayList<FootballPlayer>();
		myTeam.add(new FootballPlayer("탁일준님", 00, "대한민국", 33));
		myTeam.add(new FootballPlayer("델피에로", 10, "유벤투스", 39));
		myTeam.add(new FootballPlayer("네드베드", 11, "유벤투스", 38));
		myTeam.add(new FootballPlayer("트레제게", 17, "유벤투스", 37));
		myTeam.add(new FootballPlayer("칸나바로", 05, "유벤투스", 36));
		myTeam.add(new FootballPlayer("잠브로타", 19, "유벤투스", 35));
		myTeam.add(new FootballPlayer("마르키쇼", 07, "유벤투스", 34));

		System.out.println("내팀 선수들 정보. ");
		for (FootballPlayer player : myTeam) {
			// player.showInfo();
			System.out.println(player);
		}

	}
}
