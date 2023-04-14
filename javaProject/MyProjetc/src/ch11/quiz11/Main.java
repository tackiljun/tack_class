package ch11.quiz11;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서
		// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		HashSet<FootballPlayer> myTeam = new HashSet<FootballPlayer>();
		myTeam.add(new FootballPlayer("탁일준님", 00, "대한민국", 33));
		myTeam.add(new FootballPlayer("트레제게", 17, "유벤투스", 37));
		myTeam.add(new FootballPlayer("델피에로", 10, "유벤투스", 39));
		myTeam.add(new FootballPlayer("네드베드", 11, "유벤투스", 38));
		myTeam.add(new FootballPlayer("칸나바로", 05, "유벤투스", 36));
		myTeam.add(new FootballPlayer("잠브로타", 19, "유벤투스", 35));
		myTeam.add(new FootballPlayer("마르키쇼", 07, "유벤투스", 34));
		myTeam.add(new FootballPlayer("탁일준님", 00, "대한민국", 33));

		System.out.println("내팀 선수들 정보. ");
		for (FootballPlayer player : myTeam) {
			System.out.println(player);
		}

		// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록
		// Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		// 방법은 boolean equals(Object o) , Set<E>

		// 3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고,
		// 같은 팀의 선수들은 이름 순으로 정렬하고,
		// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.

		// TreeSet<E> 사용
		// 팀이름순 정렬.
		// 같은 팀선수들 -> 이름순 정렬.
		// 같은 이름선수들 -> 번호순 정렬.

	}

}
