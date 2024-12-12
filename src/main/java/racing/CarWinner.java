package racing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CarWinner {
    private CarRandom random = new CarRandom();
    private static Scanner sc = new Scanner(System.in);

    Map<Carname, String> carmap(List<Carname> carnames) {
        int game = 1;
        boolean stop = true;
        boolean winner = true;
        Map<Carname, String> map = new HashMap<>();

        for (Carname carname : carnames) {
            map.put(carname, " ");
        }
        while (stop) {
            System.out.println("횟수를 입력해주세요.");
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                System.out.printf("(%d)\n", game);
                for (Carname carname : carnames) {

                    if (random.getRand() >= 3) {
                        map.put(carname, map.get(carname).concat("-"));
                    }
                    if (map.get(carname).equals(" ----")) {
                        map.put(carname, map.get(carname).concat("win!"));
                        winner = false;
                    }
                }
                for (Map.Entry<Carname, String> entry : map.entrySet()) {
                    Carname key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println(key + " " + value);
                }
                if (!winner) {
                    System.out.printf("우승자는");
                    for (Map.Entry<Carname, String> entry : map.entrySet()) {
                        Carname key = entry.getKey();
                        String value = entry.getValue();
                        if (value.equals(" ----win!")) {
                            System.out.printf("%s! ", key);
                        }
                    }
                }
                game++;
                if (!winner) {
                    stop = false;
                    break;
                }
            }
        }
        return map;
    }
}
