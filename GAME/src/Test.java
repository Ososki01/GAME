public class Test {
    public static void main(String[] args) {
        Character Fighter1= new Fighter();
        Character Tank1 = new Tank();
        Character Healer1 = new Healer();



        Fighter1.create();
        Fighter1.showstats();

        Tank1.create();
        Tank1.showstats();

        Healer1.create();
        Healer1.showstats();





    }
}
