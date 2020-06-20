package com.twschool.practice;


import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_return_location_00N_when_init_location_given_00N(){
        //given
        Location location = new Location(0,0,"N");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marLocation = marsRover.getLocation();
        //then
        Assert.assertEquals(location.getX(),marLocation.getX());
        Assert.assertEquals(location.getY(),marLocation.getY());
        Assert.assertEquals(location.getDirection(),marLocation.getDirection());
    }
    @Test
    public void should_return_location_01N_when_receive_move_commend_given_00N(){
        //given
        Location location = new Location(0,0,"N");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("M");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(1,marsLocation.getY());
        Assert.assertEquals(location.getDirection(),marsLocation.getDirection());
    }
    @Test
    public void should_return_location_00W_when_receive_L_commend_given_00N(){
        //given
        Location location = new Location(0,0,"N");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("L");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals("W",marsLocation.getDirection());
    }
    @Test
    public void should_return_location_00E_when_receive_R_commend_given_00N(){
        //given
        Location location = new Location(0,0,"N");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("R");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals("E",marsLocation.getDirection());
    }
    @Test
    public void should_return_location_F10W_when_receive_M_commend_given_00W(){
        //given
        Location location = new Location(0,0,"W");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("M");
        //then
        Assert.assertEquals(-1,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals(location.getDirection(),marsLocation.getDirection());
    }
    @Test
    public void should_return_location_00S_when_receive_L_commend_given_00W(){
        //given
        Location location = new Location(0,0,"W");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("L");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals("S",marsLocation.getDirection());
    }
    @Test
    public void should_return_location_00N_when_receive_R_commend_given_00W(){
        //given
        Location location = new Location(0,0,"W");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("R");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals("N",marsLocation.getDirection());
    }
    @Test
    public void should_return_location_0F1S_when_receive_M_commend_given_00S(){
        //given
        Location location = new Location(0,0,"S");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("M");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(-1,marsLocation.getY());
        Assert.assertEquals(location.getDirection(),marsLocation.getDirection());
    }
    @Test
    public void should_return_location_00E_when_receive_L_commend_given_00S(){
        //given
        Location location = new Location(0,0,"S");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("L");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals("E",marsLocation.getDirection());
    }
    @Test
    public void should_return_location_00W_when_receive_R_commend_given_00S(){
        //given
        Location location = new Location(0,0,"S");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("R");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals("W",marsLocation.getDirection());
    }
    @Test
    public void should_return_location_10E_when_receive_M_commend_given_00E(){
        //given
        Location location = new Location(0,0,"E");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("M");
        //then
        Assert.assertEquals(1,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals(marsLocation.getDirection(),marsLocation.getDirection());
    }
    @Test
    public void should_return_location_00N_when_receive_L_commend_given_00E(){
        //given
        Location location = new Location(0,0,"E");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("L");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals("N",marsLocation.getDirection());
    }
    @Test
    public void should_return_location_00S_when_receive_R_commend_given_00E(){
        //given
        Location location = new Location(0,0,"E");
        //when
        MarsRover marsRover = new MarsRover(location);
        Location marsLocation = marsRover.receive("R");
        //then
        Assert.assertEquals(0,marsLocation.getX());
        Assert.assertEquals(0,marsLocation.getY());
        Assert.assertEquals("S",marsLocation.getDirection());
    }


}
