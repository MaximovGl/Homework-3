package ru.maximov.weaponry;

public class shooter {
    protected String name;
    protected weapon weapon;

    public shooter(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(weapon weapon) {
        this.weapon = weapon;
    }

    public void shoot(){
        if (weapon==null){
            System.out.println("Не могу участвовать в перестрелке");
        }
        else{
            weapon.shoot();
        }
    }
    public String tostr(){
        return ("Имя стрелка:"+name+". Оружие:"+ weapon.toString()+".");
    }
}


