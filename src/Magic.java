public class Magic extends Hero {
    @Override
    public void applySuperAbility(String SurepAbility) {
        setDamage(20);
        setHp(150);
        setSuperAbilityType("Magic применил супер способность Nova");
        System.out.println("Uron: " + getDamage() + " Jizn': " + getHp() +
                " sposopnost': " + getSuperAbilityType());
    }


    }

