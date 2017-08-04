package model.archetype;

import model.archetype.iface.IAnimal;
import model.archetype.type.AnimalType;

public abstract class Animal implements IAnimal {
    protected int age;

    protected String name;

    protected AnimalType type;

    public Animal(int age, String name, AnimalType type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public AnimalType getType() {
        return this.type;
    }
}
