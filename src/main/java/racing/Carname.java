package racing;

public class Carname {
   private final String carname;

    public String getCarname() {
        return carname;
    }

    public Carname(String carname) {
        if (carname.length() > 10) {
            throw new IllegalArgumentException("이름은 10글자 이내로 해야 합니다.");
        }
        this.carname = carname;
    }

    @Override
    public String toString() {
        return carname;
    }
}
