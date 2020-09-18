package ru.mirea.pr3.ex5;

public interface Movable {
    abstract public void moveUp();
    abstract public void moveDown();
    abstract public void moveLeft();
    abstract public void moveRight();
}
class MovablePoint implements Movable {
    int x1;
    int x2;
    int y1;
    int y2;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
        Cheker();
    }
    public void Cheker(){
        if(this.xSpeed!=this.ySpeed)
            System.exit(0);
    }
    @Override
    public String toString(){
        return this.x1+" "+ this.y1+" "+this.x2+" "+this.y2+" "+this.xSpeed+" "+this.ySpeed+" "+this.xSpeed+" "+this.ySpeed;
    }
    @Override
    public void moveUp() {
        this.y1++;
        this.y2++;
    }
    @Override
    public void moveDown() {
        this.y1--;
        this.y2--;
    }
    @Override
    public void moveLeft() {
        this.x1--;
        this.x2--;
    }
    @Override
    public void moveRight() {
        this.x1++;
        this.x2++;
    }
}
class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed){
        topLeft.x1=x1;
        topLeft.y1=y1;
        bottomRight.x2=x2;
        bottomRight.y2=y2;
        topLeft.xSpeed=xSpeed;
        topLeft.ySpeed=ySpeed;
        bottomRight.xSpeed=xSpeed;
        bottomRight.ySpeed=ySpeed;
    }
    @Override
    public String toString(){
        return topLeft.x1+" "+ topLeft.y1+" "+bottomRight.x2+" "+bottomRight.y2+" "+topLeft.xSpeed+" "+topLeft.ySpeed+" "+bottomRight.xSpeed+" "+bottomRight.ySpeed;
    }
    @Override
    public void moveUp() {
        topLeft.y1++;
        bottomRight.y2++;
    }
    @Override
    public void moveDown() {
        topLeft.y1--;
        bottomRight.y2--;
    }
    @Override
    public void moveLeft() {
        topLeft.x1--;
        bottomRight.x2--;
    }
    @Override
    public void moveRight() {
        topLeft.x1++;
        bottomRight.x2++;
    }
}


