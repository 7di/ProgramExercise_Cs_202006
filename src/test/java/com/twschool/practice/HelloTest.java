package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void should_run_test_pass() {
        //given
        HelloWorld helloworld = new HelloWorld();
        //when
        String reply = helloworld.reply("你好世界！");
        //then
        assertEquals("你好世界！",reply);

    }
}
