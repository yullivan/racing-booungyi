package racing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTests {

    @Test
    void CarnameTest() {
        Carname carname = new Carname("asd");
        System.out.println(carname.getCarname());
    }

//    @Test
//    void CarlistTest() {
//        CarlistMap carlist = new CarlistMap();
//        carlist.creatcarlist("122");
//        assertThat(carlist.creatcarlist("122"));
//
//    }

//    @Test
//    void CarlistMapTEST() {
//        CarlistMap carlist = new CarlistMap();
//        CarlistMap carmap = new CarlistMap();
//        carmap.carmap(carlist.creatcarlist("122"));
//        assertThat(carmap.carmap(carlist.creatcarlist("112"))).isEqualTo("122");
//    }
}
