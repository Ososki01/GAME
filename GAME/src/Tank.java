import java.util.Random;

public class Tank extends  Character{
    Random Random = new Random();


    @Override
    public void create()
    {
        super.setIntelligence(3 + this.Random.nextInt(5));
        super.setStrength(1 + this.Random.nextInt(5));
        super.setVitality(6 + this.Random.nextInt(5));
        super.setHP();
        super.setMaxHP(super.getHP());

    }
    @Override
    public void showstats()
    {
        System.out.println("Tank "+ "Intelligence: "+super.getIntelligence()+"Strength: "+super.getStrength()+"Vitality: "+super.getVitality()+"HP: "+super.getHP());
    }


}