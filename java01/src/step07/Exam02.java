/* 주제: 클래스 공용 변수 사용 */
package step07;

public class Exam03 {
  public static void main(String[] args) {
    // 1) 클래스 공용 변수 사용전
    // => 2 * 3 + 6 - 7 = ?
    int a = Calculator.multiple(2, 3);
    a = Calculator.plus(a, 6);
    a = Calculator.minus(a, 7);
    System.out.println(a);

    // 2) 클래스 공용 변수 사용후
    Calculator2.result = 0;
    Calculator2.plus(2);
    Calculator2.multiple(3);
    Calculator2.plus(6);
    Calculator2.minus(7);
    System.out.println(Calculator2.result);
  }
}
