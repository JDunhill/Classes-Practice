import classPractice.Weapons;

public class Main {

    public static void main(String[] args) {

        Weapons w1 = new Weapons(4, 5, true);
        int w1DamageOutput = w1.getDamageOutput();
        System.out.println(w1DamageOutput);
        w1.setDamageOutput(3);
        w1DamageOutput = w1.getDamageOutput();
        System.out.println(w1DamageOutput);

        Weapons w2 = new Weapons(4, 5);

        System.out.println(w1.toString());
        System.out.println(w2.causesDamage);


    }

}
