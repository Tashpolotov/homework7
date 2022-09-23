public class Warrior extends Hero{
    @Override
    public void applySuperAbility(String SurepAbility) {
        setDamage(20);
        setHp(200);
        setSuperAbilityType("Warrior применил супер способность Critical damage");
        System.out.println("Udar: " + getDamage() + " jizn': " + getHp() +
                " sposobnost': " + getSuperAbilityType());
    }
}
