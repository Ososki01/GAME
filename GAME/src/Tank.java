import java.util.Random;

public class Tank extends  Character{
    Random Random = new Random();
    public Tank()
    {
        super();
        setIntelligence(3 + this.Random.nextInt(5));
        setStrength(1 + this.Random.nextInt(5));
        setVitality(6 + this.Random.nextInt(5));
        setHP();
        setInventorylimit(4);
    }


    @Override
    public void showstats()
    {
        System.out.println("Tank "+ "Intelligence: "+super.getIntelligence()+"Strength: "+super.getStrength()+"Vitality: "+super.getVitality()+"HP: "+super.getHP()+"Inventory Limit: "+super.getInventorylimit());
    }


}