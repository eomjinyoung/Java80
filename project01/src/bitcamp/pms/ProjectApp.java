/* 목표
- 다섯 명의 회원 정보를 입력 받아 출력하라
- 사용 문법:
  => 레퍼런스 배열을 이용하여 여러 인스턴스의 주소를 저장
  => 반복문 활용
*/
package bitcamp.pms;

import java.util.Scanner;
import bitcamp.pms.domain.Member;

public class ProjectApp {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    Member[] members = new Member[5];

    Member member = null;
    String input = null;
    for (int i = 0; i < members.length; i++) {
      member = new Member();

      System.out.print("이름? ");
      member.setName(keyScan.nextLine());

      System.out.print("이메일? ");
      member.setEmail(keyScan.nextLine());

      System.out.print("암호? ");
      member.setPassword(keyScan.nextLine());

      System.out.print("전화? ");
      member.setTel(keyScan.nextLine());

      do {
        System.out.print("저장하시겠습니까?(y/n) ");
        input = keyScan.nextLine().toLowerCase();
        if (input.equals("y")) {
          members[i] = member;
          System.out.println("저장하였습니다.");
          break;
        } else if (input.equals("n")) {
          i--;
          System.out.println("저장을 취소하였습니다.");
          break;
        } else {
          System.out.println("잘못된 명령어입니다.");
        }
      } while(true);
    }

    System.out.println("--------------------------------");

    for (int i = 0; i < members.length; i++) {
      System.out.println(members[i]);
    }
  }
}
