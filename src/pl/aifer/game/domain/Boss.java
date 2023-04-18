package pl.aifer.game.domain;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String info() {
        return "Boss: " + weapon.info() + ", " + super.info();
    }
}
