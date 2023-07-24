public class Weapons {

    int damageOutput = 0;
    int price = 0;
    boolean isOneHanded = false;

    public Weapons(int damageOutput, int price, boolean isOneHanded) {
        super();
        this.damageOutput = damageOutput;
        this.price = price;
        this.isOneHanded = isOneHanded;
    }

    public Weapons(int output, int money ) {
        this(output, money, false);
    }


    public void setDamageOutput(int damageOutput) {
        this.damageOutput = damageOutput;
    }

    public int getDamageOutput() {
        return damageOutput;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setOneHanded(boolean oneHanded) {
        isOneHanded = oneHanded;
    }

    public boolean isOneHanded() {
        return isOneHanded;
    }


}
