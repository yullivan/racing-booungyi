package racing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTests {

    @Test
    void CarnameTest() {
        Carname carname = new Carname("asd");
        System.out.println(carname.getCarname());
    }

    @Test
    void CarwinnerTest1() {
        Carname carname = new Carname("21");
        List<Carname> 비교군 = new ArrayList<>();
        비교군.add(carname);
        List<Carname> carnameList = new ArrayList<>();
        carnameList.add(carname);
        assertThat(carnameList).isEqualTo(비교군);
    }

    @Test
    void CarWinnerTest2() {


    }

    @Test
    void CarRandomTest() {
        int randomget = CarRandom.getRand();
        assertThat(randomget).isBetween(1, 6);
    }

}
//        @Test
//        void CarlistTest() {
//        CarlistMap carlist = new CarlistMap();
//        carlist.creatcarlist("122");
//        assertThat(carlist.creatcarlist("122"));



//    @Test
//    void CarlistMapTEST() {
//        CarlistMap carlist = new CarlistMap();
//        CarlistMap carmap = new CarlistMap();
//        carmap.carmap(carlist.creatcarlist("122"));
//        assertThat(carmap.carmap(carlist.creatcarlist("112"))).isEqualTo("122");
//    }

