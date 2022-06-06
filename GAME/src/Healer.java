import java.util.Random;

public class Healer extends Character{
        java.util.Random Random = new Random();

        public Healer(){
        super();
        setIntelligence(6 + this.Random.nextInt(5));
        setStrength(3 + this.Random.nextInt(5));
        setVitality(1 + this.Random.nextInt(5));
        setHP();
        setInventorylimit(5);
        }

        @Override
        public void showstats()
        {
            System.out.println("Healer "+ "Intelligence: "+super.getIntelligence()+"Strength: "+super.getStrength()+"Vitality: "+super.getVitality()+"HP: "+super.getHP()+"Inventory Limit: "+super.getInventorylimit());
        }


    }

