package ru.maximov.geometry;

public class point {
    protected int x,y;

    public point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        point poi = (point) obj;
        return x==poi.x && y == poi.y;
    }
    public String tostr() {
        return ("X:"+x+"Y:"+y);
    }
}
