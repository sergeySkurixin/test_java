package ForestLive;

class Predator extends Animal {

    private int kal = 100;
    private int ves;
    public int getKal() {
        return kal;
    }
    public void setVes(int ves) {
        this.ves = ves;
    }
    public int getVes() {
        return ves;
    }

    public boolean defense() {
        return Math.random() < 0.33 ? true : false;
    }


    public boolean attack(Essens attacking, Essens attacked) {
        if (attacking instanceof Predator) {
            if (attacked instanceof Predator) {
                if (attacking.getVes() > attacked.getVes()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (attacked instanceof Herbivore || attacked instanceof Garbage) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean eat(Essens Eater, Essens food) {
       return false;
    }
}