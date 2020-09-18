package ru.mirea.pr3.ex4;

public interface Movable {
    abstract public void moveUp();
    abstract public void moveDown();
    abstract public void moveLeft();
    abstract public void moveRight();
}
class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    @Override
    public String toString(){
        return this.x+" "+this.y+" "+this.xSpeed+" "+ySpeed;
    }
    @Override
    public void moveUp() {
        this.y++;
    }
    @Override
    public void moveDown() {
        this.y--;
    }
    @Override
    public void moveLeft() {
        this.x--;
    }
    @Override
    public void moveRight() {
        this.x++;
    }
}
class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        center.x=x;
        center.y=y;
        center.xSpeed=xSpeed;
        center.ySpeed=ySpeed;
        this.radius=radius;
    }
    @Override
    public String toString(){
        return center.x+" "+ center.y+" "+center.xSpeed+" "+center.ySpeed+" "+this.radius;
    }
    @Override
    public void moveUp() {
        center.y++;
    }
    @Override
    public void moveDown() {
        center.y--;
    }
    @Override
    public void moveLeft() {
        center.x--;
    }
    @Override
    public void moveRight() {
        center.x++;
    }
}
