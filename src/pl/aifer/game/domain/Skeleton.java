package pl.aifer.game.domain;

import pl.aifer.game.domain.Boss;

public class Skeleton extends Boss {
    private int arrowNumber;

    public int getArrowNumber() {
        return arrowNumber;
    }

    public void setArrowNumber(int arrowNumber) {
        this.arrowNumber = arrowNumber;
    }

    @Override
    public String info() {
        return "Skeleton: number of arrows = " + arrowNumber + ", inherited from " + super.info();
    }
}
