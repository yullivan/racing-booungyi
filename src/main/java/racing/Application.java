package racing;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        CarWhile cwh = new CarWhile();
        CarWinner cW = new CarWinner();

        //TODo 클래스 호출
        Scanner sc = new Scanner(System.in);
        //todo 차를 입력받고 생성함
        System.out.println(("차 이름 입력 , 입력시 구분"));
        //TOdo 사용자입력을 받음
        String carNamesInput = sc.nextLine();
        List<Carname> carlist = cW.creatcarlist(carNamesInput);
        //Todo 랜덤 함수만큼 map value 에 "-' 추가
        //todo 우승자 표시
        cwh.carmap (carlist);
    }
}
