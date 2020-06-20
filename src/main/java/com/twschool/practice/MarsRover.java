package com.twschool.practice;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location receive(String command) {
        if(location.getDirection().equals("N")){
            if(command.equals("L")) {
                location.setDirection("W");
            }
            if(command.equals("R")) {
                location.setDirection("E");
            }
            if(command.equals("M")) {
                location.setY(location.getY() + 1);
            }
            return location;
        }
        if(location.getDirection().equals("W")){
            if(command.equals("L")) {
                location.setDirection("S");
            }
            if(command.equals("R")) {
                location.setDirection("N");
            }
            if(command.equals("M")) {
                location.setX(location.getX() - 1);
            }
            return location;
        }
        if(location.getDirection().equals("S")){
            if(command.equals("L")) {
                location.setDirection("E");
            }
            if(command.equals("R")) {
                location.setDirection("W");
            }
            if(command.equals("M")) {
                location.setY(location.getY() - 1);
            }
            return location;
        }
        if(location.getDirection().equals("E")){
            if(command.equals("L")) {
                location.setDirection("N");
            }
            if(command.equals("R")) {
                location.setDirection("S");
            }
            if(command.equals("M")) {
                location.setX(location.getX() + 1);
            }
            return location;
        }
//        if ("L".equals(command)) {
//            location.leftDirection();
//        }
//        if ("R".equals(command)) {
//            location.rightDirection();
//        }
//        if ("M".equals(command)) {
//
//            //location.setY(location.getY() + 1);
//
//
//        }
        return location;
    }
}
