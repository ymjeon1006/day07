package string_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		HashMap<String, String> member = 
				new HashMap<String, String>(); //id와 pw를 저장할 공간
		Set<String> set = member.keySet();
		Iterator<String> it = set.iterator();
		
		Scanner input = new Scanner(System.in);
		
		int n = 0; //사용자에게 입력받을 값
		String id = null;
		String pwd = null;
		boolean bool = true;
		
		while(bool) {
			System.out.println("------------------------------------");
			System.out.println("1.회원 가입");
			System.out.println("2.로그인");
			System.out.println("3.모든 회원 보기");
			System.out.println("4.비밀번호 찾기");
			System.out.println("5.종료");
			System.out.print(">>>>>>");
			n = input.nextInt();
			
			switch(n) { 
			case 1: //회원가입
				System.out.print("아이디 입력 : ");
				id = input.next();
				System.out.print("비밀번호 입력 : ");
				pwd = input.next();
				
				if (member.containsKey(id)) {
					System.out.println("이미 존재하는 아이디입니다.");
					
				} else
					member.put(id, pwd);
				
				break;
				
			case 2: //로그인
				System.out.print("아이디 입력 : ");
				id = input.next();
				System.out.print("비밀번호 입력 : ");
				pwd = input.next();
				
				if (member.containsKey(id)) {
                    if (pwd.equals(member.get(id))) {
                        System.out.println("로그인 성공");
                    } else {
                        System.out.println("비밀번호가 틀렸습니다.");
                    }
                } else {
                    System.out.println("존재하지 않는 아이디입니다.");
                }
                break;
		
			case 3: //모든 회원 보기
				
				it = set.iterator();
				if(!it.hasNext()) {
					System.out.println("등록된 회원이 없습니다.");
					break;
				}
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key + ", " + member.get(key));
				}
				break;
				
			case 4: //비밀번호 찾기
				System.out.print("아이디 입력 : ");
				id = input.next();
				if(member.containsKey(id)==true) {
					System.out.println(id + "의 비밀번호는" + member.get(id)+"입니다.");
					break;
				}else {
					System.out.println("해당 아이디는 존재하지 않습니다.");
					break;
				}
				
			case 5: //종료
				System.out.println("종료합니다.");
				bool = false;
			}
		}
	}
}