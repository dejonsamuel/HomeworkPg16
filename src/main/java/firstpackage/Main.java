public class PhraseOMtic {
    public static void main(String[] args) {
        String[] wordListOne = {"smart", "king", "dynamic"};
        String[] wordListTwo = {"empowered", "outside-the-box", "focused"};
        String[] wordListThree = {"process", "vision", "space"};

        int oneLength = 3;
        int twoLength = 3;
        int threeLength = 3;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);









    }
}