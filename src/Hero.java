public abstract class Hero implements HavingSuperAbility {
    private int hp;
    private int damage;
    private String superAbilityType;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }

    @Override
    public void applySuperAbility() {

    }

    public void getHp(int i) {
    }
}
