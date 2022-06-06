import java.util.Random;

public class Fighter extends  Character{
    Random Random = new Random();
    public Fighter()
    {
        super();
        setIntelligence(1 + this.Random.nextInt(5));
        setStrength(5 + this.Random.nextInt(6));
        setVitality(3 + this.Random.nextInt(5));
        setHP();
        setMaxHP(super.getHP());
        setInventorylimit(3);
    }



    @Override
    public void showstats()
    {
        System.out.println("Fighter "+ "Intelligence: "+super.getIntelligence()+"Strength: "+super.getStrength()+"Vitality: "+super.getVitality()+"HP: "+super.getHP()+"Inventory Limit: "+super.getInventorylimit());
    }


}
