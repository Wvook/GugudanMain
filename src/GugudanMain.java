import java.util.Scanner;

public class GugudanMain {
        public static void main(String[] args) {
            System.out.println("입력하고자 하는 수를 입력하세요 (, 로 나눠 입력하기 필수) : ");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            String[] splitedValue = input.split(",");

            int first = Integer.parseInt(splitedValue[0]); // 8
            int second = Integer.parseInt(splitedValue[1]); // 7

            for(int i = 2; i <= first; i++){
                for(int j = 1; j <= second; j++){
                    System.out.print(i * j+ " ");
                }
                System.out.println();
            }
        }
    }

