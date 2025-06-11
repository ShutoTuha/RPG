package chr;

public abstract class Character {
    private String name;
    private int hp;
    private int money;

    public Character(String name, int hp){
        this.name = name;
        this.hp = hp;
        this.money = 10;
    }

    public Character(){
        this("ダミー", 100);
    }

    public void escape(Character c) {
        System.out.println(c.name + "は敵を前にして逃げたした。");
    }

    public abstract void attck(Character c);

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMoney() {
        return this.money;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}


