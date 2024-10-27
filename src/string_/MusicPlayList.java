package string_;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList {
	public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<>();
        //문자열 타입의 데이터를 저장할 수 있는 ArrayList 객체 playlist 생성, 곡 제목을 저장하는 용도
        Scanner input = new Scanner(System.in); //Scanner 객체 input 생성, 입력받는 기능

        // 곡 추가
        for (int i = 0; i < 3; i++) { //for 루프 사용하여 사용자에게 곡 제목을 3번 입력받기 위한 반복문
            System.out.print("곡 제목을 입력하세요: ");
            String song = input.nextLine();
            playlist.add(song);
        }

        // 플레이리스트 출력
        System.out.println("\n플레이리스트:");
        for (String song : playlist) { //for 루프 사용하여 playlist의 모든 곡 제목 순회
            System.out.println("- " + song);
        }

        // 특정 곡 삭제
        System.out.print("\n삭제할 곡 제목을 입력하세요: ");
        String songToRemove = input.nextLine();
        if (playlist.remove(songToRemove)) { //remove() 메서드 사용하여 playlist에서 songToRemove 삭제, 삭제 성공하면 true반환, 실패하면 false반환
            System.out.println(songToRemove + " 곡이 삭제되었습니다."); //삭제 성공 메시지 출력
        } else {
            System.out.println("곡을 찾을 수 없습니다."); //삭제 실패 처리
        }

        // 업데이트된 플레이리스트 출력
        System.out.println("\n업데이트된 플레이리스트:");
        for (String song : playlist) { //for 루프 사용하여 현재의 playlist에 남아있는 모든 곡 제목 순회
            System.out.println("- " + song);
        }
	}
}