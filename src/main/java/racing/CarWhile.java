package racing;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CarWhile {
    CarWinner cW = new CarWinner();
    Scanner sc = new Scanner(System.in);

    public Map<Carname, String> carmap(List<Carname> carnames) {
        int gameNumber = 1;
        Map<Carname, String> map = cW.initializeRace(carnames);
    

        // 게임 진행 루프
        while (true) {
            System.out.println("횟수를 입력해주세요.");
            int count = sc.nextInt();

            // 횟수 입력값 검증
            if (count <= 0) {
                System.out.println("유효한 횟수를 입력하세요.");
                continue;
            }

            for (int i = 0; i < count; i++) {
                System.out.printf("게임 #%d\n", gameNumber);

                // 자동차 경주
                boolean hasWinner = cW.raceCars(carnames, map);

                // 각 자동차의 상태 출력
                cW.printRaceStatus(map);;

                // 승자가 있으면 게임 종료
                if (hasWinner) {
                    cW.announceWinner(map);;
                    return map; // 게임 종료
                }

                gameNumber++;
            }
        }
        
    }
}
