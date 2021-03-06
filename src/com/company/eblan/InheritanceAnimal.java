package com.company.eblan;

public class InheritanceAnimal {
    private String type;
    protected String name;
    private int age;
    private float weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;

    public InheritanceAnimal(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    void display() {
        System.out.print(" Type: " + type + " , Name: " + name + " , Age: " + age + " , Weight: " + weight + " , IsFly: " + (isFly ? "yes" : "no"));
        System.out.println(" , isWalk : " + (isWalk ? "yes" : "no") + " , isSwim : " + (isSwim ? "yes" : "no"));
    }
}

class Bird extends InheritanceAnimal {

    private String area;
    private boolean winterFly;

    public Bird() {
        super("Bird", null, 0, 0.0f, true, true, true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public String getArea() {
        return area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    void chirickChirick() {
        System.out.println("Chirik-Chirik");
    }
}

class Fish extends InheritanceAnimal {

    private String squama;
    private boolean upStreamSwim;

    public Fish() {
        super("Fish", null, 0, 0.0f, false, false, true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public String getSquama() {
        return squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    void bulBul() {
        System.out.println("Bul-bul");
    }

}

class Insect extends InheritanceAnimal {

    private int wingCount;
    private boolean likeJesus;

    public Insect() {
        super("Insect", null, 0, 0.0f, true, true, true);
    }

    void ggggg() {
        System.out.println("Ggggg");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public int getWingCount() {
        return wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }
}


class Main23 {
    public static void main(String[] args) {
        InheritanceAnimal duck = new InheritanceAnimal("????????", "??????", 3, 5.8f, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("???? ????????");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirickChirick();

        Fish f = new Fish();
        f.setName("??????????");
        f.display();
        f.setSquama("??????????????");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bulBul();

        Insect i = new Insect();
        i.setName("?????? ??????????");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}

