import java.util.Scanner;

/**
 *  조건문 (if문) 학습 
 *  1 ~ 100점 까지의 점수 난수 3개 발생
 *  "이학생" 100 90 80    국어 수학 영어 점수 
 *  세과목의 (1) 총점 출력, 정수평균, 실수 평균 출력
 *  
 *  80점이상 합격, 80점 미만 불합격 출력
 *  if else 문 사용하여서 출력하기!  
 *  삼항조건   a? b : c 구조와 차이점 파악하기  --> 참/거짓 에 따라서 수행되는 문장이 2개이상이면 조건식 활용!
 */

public class IfElseTest2 {

	public static void main(String[] args) {

		String name = "이학생";
		int kor = (int) (Math.random()*100)+1;
		int mat = (int) (Math.random()*100)+1;
		int eng = (int) (Math.random()*100)+1;
		int sum = kor + mat + eng ;

		int avg = sum / 3;
		double avgDouble = ((double) sum / 3);

		//		String result = score >= 80? "합격" : "불합격";
		//		System.out.println(result);

		System.out.println("이름 =" + name);
		System.out.println("국어 =" + kor);
		System.out.println("수학 =" + mat);
		System.out.println("영어 =" + eng);
		System.out.println("총점 =" + sum);
		System.out.println("실수평균 =" + avgDouble);
		System.out.println("정수평균 =" + avg);

		
		// 정수 평균값이	90 점 이상 A 등급
		// 				70 이상 90미만 B
		//				50 이상 70미만 C
		//				50미만 재수강 출력
		
		String result;  // main 블록내 사용 
		
		if (avg >= 90) {
			result = "A";
		}
		else if (avg >= 70) {
			result = "B";
		}
		else if (avg >= 50) {
			result = "C";
		}
		else {
			result = "재수강";
		}
		
		System.out.println(result);
		
	}

	//자바 변수의 특징 지역변수, 전역변수 개념 if문 의 중괄호 { } 영역 안에서 선언한 변수는 그 블록을 벗어나면 
	//사용할 수 없다.

}

