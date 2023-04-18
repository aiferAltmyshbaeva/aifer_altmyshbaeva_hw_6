package pl.aifer.game;

import pl.aifer.game.domain.Boss;
import pl.aifer.game.domain.Skeleton;
import pl.aifer.game.domain.Weapon;
import pl.aifer.game.domain.WeaponType;

public class Main {
    public static void main(String[] args) {
        Boss boss = createBoss("АК-47");
        Skeleton sk1 = createSkeleton();
        Skeleton sk2 = createSkeleton();

        System.out.println(boss.info());
        System.out.println("sk1 = " + sk1.info());
        System.out.println("sk1 = " + sk2.info());
    }

    private static Skeleton createSkeleton() {
        Skeleton skeleton = new Skeleton();
        Weapon crossbow = new Weapon(WeaponType.COLD, "Crossbow");
        skeleton.setWeapon(crossbow);
        skeleton.setHealth(100);
        skeleton.setDamage(50);
        skeleton.setArrowNumber(200);
        return skeleton;
    }


    private static Boss createBoss(String weaponName) {
        Weapon ak47 = new Weapon(WeaponType.FIREARM, weaponName);
        Boss boss = new Boss();
        boss.setWeapon(ak47);
        boss.setHealth(100);
        boss.setDamage(50);
        return boss;
    }
}