package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_given_1234_when_answer_1234(){
        //given
        GuessNumber answer = new GuessNumber("1 2 3 4");
        //when
       String result = answer.check("1 2 3 4");
        //then
        Assert.assertEquals("4A0B",result);
    }
    @Test
    public void should_return_2A0B_given_1278_when_answer_1234(){
        //given
        GuessNumber answer = new GuessNumber("1 2 3 4");
        //when
        String result = answer.check("1 2 7 8");
        //then
        Assert.assertEquals("2A0B",result);
    }
    @Test
    public void should_return_2A2B_given_1432_when_answer_1234(){
        //given
        GuessNumber answer = new GuessNumber("1 2 3 4");
        //when
        String result = answer.check("1 4 3 2");
        //then
        Assert.assertEquals("2A2B",result);
    }
    @Test
    public void should_return_0A4B_given_4321_when_answer_1234(){
        //given
        GuessNumber answer = new GuessNumber("1 2 3 4");
        //when
        String result = answer.check("4 3 2 1");
        //then
        Assert.assertEquals("0A4B",result);
    }
    @Test
    public void should_return_0A0B_given_5678_when_answer_1234(){
        //given
        GuessNumber answer = new GuessNumber("1 2 3 4");
        //when
        String result = answer.check("5 6 7 8");
        //then
        Assert.assertEquals("0A0B",result);
    }

}
