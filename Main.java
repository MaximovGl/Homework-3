package ru.maximov.main;

import ru.maximov.array.ilov;
import ru.maximov.geometry.point;
import ru.maximov.houses.house;
import ru.maximov.mathoperations.power;
import ru.maximov.weaponry.machinegun;
import ru.maximov.weaponry.pistol;
import ru.maximov.weaponry.shooter;
import ru.maximov.mathoperations.power;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main m = new Main();
        int a,a1;
        double d,d1;
        boolean b,b1;
        ArrayList<Integer> list= new ArrayList<>();
        String s,s1;
        System.out.println("Выберите задание: ");
        a = in.nextInt();
        switch (a){
            case 1:
                System.out.println("Введите число этажей дома:");a=m.intcheck();
                house h4 = new house(a);
                s= h4.tosrt();
                System.out.println(s);
                break;
            case 2:
                System.out.println("Введите максимальное количество патронов, помещающихся в пистолет:");a=m.intcheck();
                pistol p1 = new pistol(a);
                System.out.println("Введите число патронов которые вы хотите зарядить:");a=m.intcheck();
                p1.reload(a);
                System.out.println("Введите число выстрелов которые вы хотите сделать:");a=m.intcheck();
                p1.shoot(a);
                System.out.println("Введите число патронов которые вы хотите зарядить:");a=m.intcheck();
                p1.reload(a);
                System.out.println("Введите число выстрелов которые вы хотите сделать:");a=m.intcheck();
                p1.shoot(a);
                System.out.println("Введите число выстрелов которые вы хотите сделать:");a=m.intcheck();
                p1.shoot(a);
                p1.reload(0);
                System.out.println("Введите число выстрелов которые вы хотите сделать:");a=m.intcheck();
                p1.shoot(a);
                break;
            case 3:
                System.out.println("Введите одной строкой через запятую элементы массива:");s=m.strcheck();
                ilov t=new ilov(s);
                System.out.println("Введите индекс элементы который хотите заменить и его новое значение:");a=m.intcheck();a1= m.intcheck();
                t.replace(a,a1);
                System.out.println("Введите индекс элемента занчение которого хотите узнать:");a=m.intcheck();
                System.out.println(t.position(a));
                s = t.tostr();
                System.out.println(s);
                System.out.println("Введите элемент который будет в новом масcивe:");a=m.intcheck();
                list.add(a);
                ilov r=new ilov(list);
                System.out.println(r.isempty());
                System.out.println(r.size());
                System.out.println(Arrays.toString(r.toarray()));
                break;
            case 4:
                machinegun ma3=new machinegun();
                System.out.println("Введите размер магазина автомата:");a=m.intcheck();
                machinegun ma2=new machinegun(a);
                System.out.println("Введите размер магазина и скорострельность автомата:");a=m.intcheck();a1=m.intcheck();
                machinegun ma1=new machinegun(a,a1);
                System.out.println("Введите продолжительность стрельбы из автомата в секундах:");a=m.intcheck();
                ma1.fire(a);
                System.out.println("Введите продолжительность стрельбы из автомата в секундах:");a=m.intcheck();
                ma2.fire(a);
                ma3.shoot();
                break;
            case 5:

                break;
            case 6:
                System.out.println("Введите имя стрелка:");s=m.strcheck();
                shooter sh1=new shooter(s);
                System.out.println("Введите имя стрелка:");s=m.strcheck();shooter sh2=new shooter(s);
                System.out.println("Введите размер обоймы пистолета:");a=m.intcheck();pistol shw2=new pistol(a); sh2.setWeapon(shw2);
                System.out.println("Введите имя стрелка:");s=m.strcheck();shooter sh3=new shooter(s);
                System.out.println("Введите размер обоймы автомата и его скорострельность:");a=m.intcheck();a1=m.intcheck();machinegun shw3=new machinegun(a,a1); sh3.setWeapon(shw3);
                sh1.shoot();
                sh2.shoot();
                sh3.shoot();
                System.out.println();
                break;
            case 7:
                System.out.println("Введите координаты точки:");a=m.intcheck();a1=m.intcheck();
                point po1=new point(a,a1);
                System.out.println("Введите координаты точки:");a=m.intcheck();a1=m.intcheck();
                point po2=new point(a,a1);
                System.out.println("Утворждение о том, что первая имеют оджинаковые координаты является:"+po1.equals(po2));
                break;
            case 8:
                power pow= new power();
                System.out.println("Введите число, которое хотите возвести в степень:");s=m.strcheck();
                System.out.println("Введите число, в степень которого хотите возвести:");s1=m.strcheck();
                d=pow.pow(s,s1);
                System.out.println(d);
                break;
        }
    }
    public int intcheck(){
        Scanner in = new Scanner(System.in);
        int a=0;
        if (in.hasNextInt()) {
            a = in.nextInt();
            return(a);
        }
        else {
            System.out.println("Вы ввели не целое число.");
            return (0);
        }
    }
    public String strcheck(){
        Scanner in = new Scanner(System.in);
        String s=" ";
        if (in.hasNextLine()) {
            s = in.nextLine();
            return(s);
        }
        else {
            System.out.println("Вы ввели не целое число.");
            return ("");
        }
    }

}

