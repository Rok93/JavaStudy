import java.util.Scanner;

/**
 *  조건문 (if문) 학습 
 *  1 ~ 100점 까지의 점수 중에서
 *  80점이상 합격, 80점 미만 불합격 출력
 *  if else 문 사용하여서 출력하기!  
 *  삼항조건   a? b : c 구조와 차이점 파악하기  --> 참/거짓 에 따라서 수행되는 문장이 2개이상이면 조건식 활용!
 */

public class IfElseTest {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt();
		int score = (int) (Math.random()*100);
		String result;
//		String result = score >= 80? "합격" : "불합격";
//		System.out.println(result);
		
		if (score >= 80) {
			result = "합격";
		}
		
		else {
			result = "불합격";
		}
		
		System.out.println(score + " 점인 학생은 " + result + "입니다.");
		
		//자바 변수의 특징 지역변수, 전역변수 개념 if문 의 중괄호 { } 영역 안에서 선언한 변수는 그 블록을 벗어나면 
		//사용할 수 없다.
		
	}

}
