public abstract class Character {
    private int strength;
    private int vitality;
    private int intelligence;
    private int HP;
    private int inventorylimit;

    private int maxHP;
    System.out.prinln("Deneme");



    public abstract void showstats();














    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setHP() {
        this.HP = (int)(10*(0.7D * (double)this.vitality + 0.2D * (double)this.strength + 0.1D * (double)this.intelligence));
    }

    public void setInventorylimit(int inventorylimit) {
        this.inventorylimit = inventorylimit;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getVitality() {
        return vitality;
    }

    public int getHP() {
        return HP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getInventorylimit() {
        return inventorylimit;
    }
}
