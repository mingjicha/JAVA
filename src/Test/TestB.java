package Test;

public class TestB {
    public static void main(String[] args) {
        /*
         * 1. 영희, 철수, 훈이의 국영수 점수를 임의로 주시오.
         * 2. 각 학생별 시험 점수 총합과 평균을 구하시오.
         * 3. 각 과목별 점수 총합과 평균을 구하시오.
         */
        // 1번
        int a = 80, b = 90, c = 100; // 영희
        int d = 90, e = 80, f = 70; // 철수
        int g = 100, h = 95, i = 90; // 훈이

        // 2번
        int sumA = a + b + c;
        int avgA = sumA/3;
        System.out.println("영희 시험 점수 총합 = " + sumA);
        System.out.println("영희 시험 점수 평균 = " + avgA);

        int sumB = d + e + f;
        int avgB = sumB/3;
        System.out.println("철수 시험 점수 총합 = " + sumB);
        System.out.println("철수 시험 점수 평균 = " + avgB);

        int sumC = g + h + i;
        int avgC = sumC/3;
        System.out.println("훈이 시험 점수 총합 = " + sumC);
        System.out.println("훈이 시험 점수 평균 = " + avgC);
    }
}
