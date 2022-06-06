import java.util.Random;

public class Healer extends Character{

        java.util.Random Random = new Random();

        @Override
        public void create()
        {
            super.setIntelligence(6 + this.Random.nextInt(5));
            super.setStrength(3 + this.Random.nextInt(5));
            super.setVitality(1 + this.Random.nextInt(5));
            super.setHP();
            super.setMaxHP(super.getHP());

        }
        @Override
        public void showstats()
        {
            System.out.println("Healer "+ "Intelligence: "+super.getIntelligence()+"Strength: "+super.getStrength()+"Vitality: "+super.getVitality()+"HP: "+super.getHP());
        }


    }

