package ru.maximov.weaponry;

public class machinegun extends pistol {
    protected final int rateoffire;

    public machinegun() {
        this.rateoffire=30;
        this.maxbul=30;
        this.ammo=maxbul;
    }
    public machinegun(int maxbul) {
        this.rateoffire=maxbul/2;
        this.maxbul=maxbul;
        this.ammo=maxbul;
    }
    public machinegun(int maxbul, int rateoffire) {
        this.rateoffire = rateoffire;
        this.maxbul = maxbul;
        this.ammo=maxbul;
    }

    public void shoot(){
        for (int i=0;i<rateoffire;i++){
            if (ammo==0){
                System.out.println("Клац!");
            }
            else {
                System.out.println("Бах!");
                ammo=ammo-1;
            }
        }
    }
    public void fire(int sec){
        for (int i=0;i<rateoffire*sec;i++){
            if (ammo==0){
                System.out.println("Клац!");
            }
            else {
                System.out.println("Бах!");
                ammo=ammo-1;
            }
        }
    }
    @Override
    public String tostr() {
        return ("Максимальное колличество патронов: "+ maxbul+". "+"Колличество оставшихся патронов: " + ammo + ". Скорострельность: " + rateoffire+ ".");
    }
}
