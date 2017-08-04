package model.archetype.iface;

import model.archetype.type.AnimalType;

public interface IAnimal {
    int getAge();

    String getName();

    AnimalType getType();

    int feed(IFood food);
}
