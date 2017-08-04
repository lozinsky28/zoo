package model.archetype.iface;

public interface ICage {
    int getSize();
    int getFreeSpace();
    int getBusySpace();

    IAnimal getAnimalByIndex(int index);
    IAnimal getAnimalByName(String name);

    int addAnimal(IAnimal animal);

    int placeFood(IFood food);
}
