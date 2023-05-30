package efs.task.oop;

class Villager implements Fighter {
    private String name;
    private int age;
    int health;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int)((100 - age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        if(health - damage >= 0){
            health -= damage;
        }
        else{
            health = 0;
        }
    }
    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old.");
    }
}