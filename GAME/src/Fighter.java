import java.util.Random;

public class Fighter extends  Character{
    Random Random = new Random();


    @Override
    public void create()
    {
        super.setIntelligence(1 + this.Random.nextInt(5));
        super.setStrength(5 + this.Random.nextInt(6));
        super.setVitality(3 + this.Random.nextInt(5));
        super.setHP();
        super.setMaxHP(super.getHP());


    }
    @Override
    public void showstats()
    {
        System.out.println("Fighter "+ "Intelligence: "+super.getIntelligence()+"Strength: "+super.getStrength()+"Vitality: "+super.getVitality()+"HP: "+super.getHP());
    }


}
