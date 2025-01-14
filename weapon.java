package ru.maximov.weaponry;

abstract class weapon {
    protected int ammo;
    public weapon (int ammo) {
        if (ammo<0) throw new RuntimeException();
        this.ammo = ammo;
    }
    abstract void shoot ();
    public int ammo () { return ammo;}
    public boolean getAmmo (){
        if (ammo==0) return false;
        ammo--;
        return false;
    }

    protected int load (int ammo,int maxbul) {
        if (ammo<0) throw new RuntimeException();
        if (maxbul<ammo){
            System.out.println(ammo-maxbul+" патронов не влезло в пистолет. Они возвращаются вам.");
            ammo=maxbul;
        }
        int tmp=ammo;
        this.ammo=ammo;
        return tmp;
    }
}