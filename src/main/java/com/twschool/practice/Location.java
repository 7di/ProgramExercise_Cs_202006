package com.twschool.practice;

public class Location {
    private int x;
    private int y;
    private String direction;
    private Direction directionEnum;
    private Move moveEnum;

    public Location(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public void leftDirection() {
        directionEnum = directionEnum.leftDirection();
    }
    public void rightDirection() {
        directionEnum = directionEnum.rightDirection();
    }
    public void northMovement() {
        moveEnum = moveEnum.northmovement();
    }
    public void westMovement() {
        moveEnum = moveEnum.westmovement();
    }
    public void eastovement() {
        moveEnum = moveEnum.eastmovement();
    }
    public void southMovement() {
        moveEnum = moveEnum.southmovement();
    }
}
