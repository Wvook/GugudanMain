import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        System.out.println("첫번째 수를 입력하세요 : ");
        Scanner sc1 = new Scanner(System.in);
        int first = sc1.nextInt();

        int result = first;

        while(true){
            System.out.println("기호를 입력하세요 : ");
            Scanner sc2 = new Scanner(System.in);
            String symbol = sc2.nextLine();

            if(symbol.equals("quit")){
                System.out.println("최종결과 : " + result);
                break;
            }

            System.out.println("다음 수를 입력하세요 : ");
            Scanner sc3 = new Scanner(System.in);
            int second = sc3.nextInt();

            if(symbol.equals("+")){
                result += second;
                System.out.println("덧셈 : " + result);
            }
            else if(symbol.equals("-")){
                result -= second;
                System.out.println("뺄셈 : " + result);
            }
            else if(symbol.equals("*")){
                result *= second;
                System.out.println("곱셈 : " + result);
            }
            else if(symbol.equals("/")){
                result /= second;
                System.out.println("나눗셈 : " + result);
            }
            else{
                System.out.println("연산 기호가 아닙니다.");
            }
        }
    }
}