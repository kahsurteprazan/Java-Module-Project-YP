public class Car {
    String name;
    int speed;

    public Car(String name, int score) {
        this.name = name;
        this.speed = score;
    }

    public int scoreKillometrs24(){
        return speed * 24;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}