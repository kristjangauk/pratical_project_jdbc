public class GetterSetter {
    public static void main(String[] args) {

        Game obj = new Game();
        //obj.score = 100;
        obj.setScore(100);

        int s = obj.getScore();
        System.out.println(s);


    }
}


class Game {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
