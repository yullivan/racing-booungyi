package racing;

import java.util.*;

public class CarWinner {
    private CarRandom random = new CarRandom();
    private static Scanner sc = new Scanner(System.in);

    private static final String WINNING_STR = " ----";
    private static final String WINNING_RESULT = "win!";

    public Map<Carname, String> carmap(List<Carname> carnames) {
        int gameNumber = 1;
        Map<Carname, String> map = initializeRace(carnames);

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
                boolean hasWinner = raceCars(carnames, map);

                // 각 자동차의 상태 출력
                printRaceStatus(map);

                // 승자가 있으면 게임 종료
                if (hasWinner) {
                    announceWinner(map);
                    return map; // 게임 종료
                }

                gameNumber++;
            }
        }
    }

    public static Map<Carname, String> initializeRace(List<Carname> carnames) {
        Map<Carname, String> map = new HashMap<>();
        // 자동차 이름과 초기 상태를 맵에 설정
        for (Carname carname : carnames) {
            map.put(carname, " ");
        }
        return map;
    }

    public boolean raceCars(List<Carname> carnames, Map<Carname, String> map) {
        boolean hasWinner = false;

        for (Carname carname : carnames) {
            // 무작위 확률로 자동차를 이동시킴
            if (random.getRand() >= 3) {
                map.put(carname, map.get(carname).concat("-"));
            }

            // 자동차가 승리했는지 확인
            if (map.get(carname).equals(WINNING_STR)) {
                map.put(carname, map.get(carname).concat(WINNING_RESULT));
                hasWinner = true;
            }
        }
        return hasWinner;
    }

    public void printRaceStatus(Map<Carname, String> map) {
        // 각 자동차의 상태 출력
        for (Map.Entry<Carname, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void announceWinner(Map<Carname, String> map) {
        // 승자가 있으면 결과 출력 후 게임 종료
        System.out.print("우승자는 ");
        for (Map.Entry<Carname, String> entry : map.entrySet()) {
            if (entry.getValue().equals(WINNING_STR + WINNING_RESULT)) {
                System.out.printf("%s! ", entry.getKey());
            }
        }
    }

    public List<Carname> creatcarlist(String string) {
        List<Carname> carlist = new ArrayList<>();
        for (String str : string.split(",")) {
            Carname carname = new Carname(str);
            carlist.add(carname);
        }
        return carlist;
    }
}
