import java.util.Random;

public class Medic extends Hero {

        private int healPoint;
        @Override
    public void applySuperAbility(String SurepAbility) {


    }
    public int getGetPoint() {
        return healPoint;
    }

    public void setGetPoint(int getPoint) {
        this.healPoint = getPoint;
    }
    public int increaseExperience() {
        return (int)(getHp() + (getHp() * 0.1));
    }

     {
        setDamage(10);
        setHp(50);
        setSuperAbilityType("Medic применил суперспособность Hill");

        System.out.println("Udar: " + getDamage() + " jizn': " + getHp() + " Sposobnost': "
                + getSuperAbilityType());
    }


}



