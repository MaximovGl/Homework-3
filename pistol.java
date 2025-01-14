package ru.maximov.weaponry;

public class pistol extends weapon {
    protected int maxbul;


    public pistol(int maxbul){
        super(maxbul);
        this.maxbul=maxbul;
    }
    public pistol() {
        super(5);
        this.maxbul=5;
    }

    void shoot(){
        if (ammo > 0){
            System.out.println("Бах!");
            ammo = ammo - 1;
        }
        else
            System.out.println("Клац!");
    }

    public void shoot(int sh) {
        while (sh > 0) {
            shoot();
            sh = sh - 1;
        }
    }
    public void reload(int ammo){
        load(ammo,maxbul);
    }

    public String tostr() {
        return ("Максимальное колличество патронов: "+ maxbul+". "+"Колличество оставшихся патронов: " + ammo + ".");
    }
}
