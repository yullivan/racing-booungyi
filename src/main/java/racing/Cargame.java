package racing;

import java.util.*;

public class Cargame {

    public static void main(String[] args) {
        //TODo 클래스 호출
        Scanner sc = new Scanner(System.in);
        CarList list = new CarList();
        CarWinner map = new CarWinner();
        //todo 차를 입력받고 생성함
        System.out.println(("차 이름 입력 (, 입력시 구분)"));
        String carNamesInput = sc.nextLine();

        List<Carname> carlist = list.creatcarlist(carNamesInput);
        //Todo 랜덤 함수만큼 map value 에 "-' 추가
        //todo 우승자 표시
        Map<Carname, String> carmap = map.carmap(carlist);

    }
}


//    }
//}
