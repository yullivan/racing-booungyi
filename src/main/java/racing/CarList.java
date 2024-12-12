package racing;

import java.util.*;

public class CarList {
    //Todo 사용자 입력을 받아서 List 객체를 생성하는 함수 만들기
    List<Carname> creatcarlist(String string) {
        List<Carname> carlist = new ArrayList<>();
        for (String str : string.split(",")) {
            Carname carname = new Carname(str);
            carlist.add(carname);
        }
        return carlist;
    }

    // Todo List<String,String> 을 받아와서 string""값을 가지는 carmap 생성
    //Todo map 에 random 함수 호출후 value 의 값추가


}
