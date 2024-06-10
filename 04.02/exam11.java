/**
 * The exam11 class is a program that calculates the average, maximum, and minimum scores
 * for a given set of subject scores.
 */
public class exam11 {

    /**
     * The main method is the entry point of the program.
     * It takes command line arguments as input and performs the necessary calculations.
     *
     * @param args The command line arguments containing the subject scores.
     */
    public static void main(String[] args) {

        String[] _strsubjects = { "국어", "영어", "수학" };// 과목명

        System.out.println("argv length: " + args.length);// 입력받은 인자의 개수

        double sum = 0;// 총점
        double average = 0;// 평균
        int nMAX = -999;// 최대값
        int nMIN = 999;// 최소값
        int nSum = 0;// 총합
        int Maxsubject = 0;// 최대값 과목
        int Minsubject = 0;//   

        for (int i = 0; i < args.length; i++) {// 입력받은 인자의 개수만큼 반복

            double score = Double.parseDouble(args[i]);//  입력받은 인자를 double형으로 변환

            System.out.println(_strsubjects[i] + " 점수: " + score);// 과목명과 점수 출력

        }
        for (int i = 0; i < args.length; i++) {// 입력받은 인자의 개수만큼 반복

            double score = Double.parseDouble(args[i]);//  입력받은 인자를 double형으로 변환

            sum += score;// 총점 계산

            if (nMAX < score) {// 최대값 계산
                nMAX = (int) score;// 최대값 저장
                Maxsubject = i;// 최대값 과목 저장
            }


            if (nMIN > score) {// 최소값 계산
                nMIN = (int) score;// 최소값 저장
                Minsubject = i;// 최소값 과목 저장
            }
        }

        System.out.println("평균: " + nSum / args.length);// 평균 출력
        System.out.println("최고 점수: " + _strsubjects[Maxsubject] + nMAX);// 최대값 출력
        System.out.println("최저 점수: " + _strsubjects[Minsubject] + nMIN);// 최소값 출력
    }
}