package ru.maximov.array;

import java.util.ArrayList;
public class ilov {
    private ArrayList<Integer> list =new ArrayList<>();
    public ilov(String a1){
        do{
            int b = a1.indexOf(",");
            int c = Integer.parseInt(a1.substring(0, b));
            list.add(c);
            a1=a1.substring(b+1);
        } while(a1.contains(","));
        list.add(Integer.parseInt(a1));

    }
    public ilov(ArrayList<Integer> list){
        this.list.addAll(list);
    }
    public int position(int n){
        if (n > list.size()-1)
            throw new IllegalArgumentException("Неверный ввод: Элемент с данным индекстом не существует в массиве.");
        else
            return(list.get(n));

    }
    public void replace(int n,int m){
        if (n > list.size()-1)
            throw new IllegalArgumentException("Неверный ввод: Элемент с данным индекстом не существует в массиве.");
        else
            list.set(n,m);

    }
    public boolean isempty(){
        return list.isEmpty();
    }
    public int size(){
        return (list.size());
    }
    public int[] toarray(){
        int arr[]=new int[list.size()];
        for (int i=0;i< list.size();i++){
            arr[i]= list.get(i);
        }
        return(arr);
    }
    public String tostr(){
        StringBuilder s= new StringBuilder("[");
        for (Integer integer : list) {
            s.append(integer).append(",");
        }
        s.deleteCharAt(s.lastIndexOf(","));
        s.append("]");

        return (s.toString());
    }
}
