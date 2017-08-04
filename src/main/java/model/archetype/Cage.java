package model.archetype;

import model.archetype.iface.IAnimal;
import model.archetype.iface.ICage;

import java.util.LinkedList;
import java.util.List;

public abstract class Cage implements ICage {
    protected int size;

    protected List<IAnimal> animals;

    public Cage(int size) {
        this.size = size;
        this.animals = new LinkedList<IAnimal>();
    }

    public int getSize() {
        return this.size;
    }

    public int getFreeSpace() {
        return this.size - this.animals.size();
    }

    public int getBusySpace() {
        return this.animals.size();
    }

    public int addAnimal(IAnimal animal) {
        if (this.animals.size() < this.size) {
            this.animals.add(animal);
            return this.animals.size();
        } else {
            return -1;
        }
    }

    public IAnimal getAnimalByIndex(int index) {
        return this.animals.get(index);
    }

    public IAnimal getAnimalByName(String name) {
        for (IAnimal animal : this.animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }

        return null;
    }
}
