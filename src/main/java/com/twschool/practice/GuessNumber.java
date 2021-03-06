package com.twschool.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GuessNumber {
    private static List<String> answerNumbers;
    private static int valueAndPositionCorrectCount;
    private static int positionCorrectCount;

    public GuessNumber(String answerString) {
        this.answerNumbers = Arrays.asList(answerString.split(" "));
    }

    public GuessNumber() {
        //this.answerNumbers = Arrays.asList("1", "2", "3", "4");
    }

    public static void main(String args[]) {
        int gameTimes = 0;//单局游戏次数
        String userAnswer1 = null;
        GuessNumber answer = new GuessNumber();
        GuessNumber.answerNumbers = Arrays.asList("1", "2", "3", "4");
        ArrayList<String> userAnswer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (!GuessNumber.answerNumbers.toString().equals(userAnswer.toString())) {
            userAnswer.clear();
            valueAndPositionCorrectCount = 0;
            positionCorrectCount = 0;
            System.out.println("请输入4个0-9整数，互相之间不能重复：");
            for (int i = 0; i < 4; i++) {
                userAnswer.add(sc.next());
            }
            if(answer.isRepeat(userAnswer)){
                userAnswer.clear();
            }
            else{
            //System.out.println("用户初始输入"+ userAnswer.toString());
            //需要去掉字符串中的括号及逗号
            userAnswer1 = userAnswer.toString().replace("[", "").replace("]", "").replace(",", "");
            //System.out.println("替换后"+ userAnswer1);
            String result = answer.check(userAnswer1);
            if (result.equals("4A0B")) {
                System.out.println(result + "        Congratulations，you win！");
                System.exit(0);
            } else if (gameTimes < 5) {
                System.out.println(result + "        Sorry,please try again! The left game times：" + (5-gameTimes));
            } else {
                System.out.println("Sorry，you have failed！The right answer is “1 2 3 4”");
                System.exit(0);
            }
            gameTimes++;
        }
        }
    }

    public String check(String userAnswerString) {
        List<String> userAnswerNumbers = Arrays.asList(userAnswerString.split(" "));
        valueAndPositionCorrectCount = 0;
        positionCorrectCount = 0;
        for (int index = 0; index < answerNumbers.size(); index++) {
            if (answerNumbers.get(index).equals(userAnswerNumbers.get(index))) {
                valueAndPositionCorrectCount++;
            } else if (answerNumbers.contains(userAnswerNumbers.get(index))) {
                positionCorrectCount++;
            }
        }
        return valueAndPositionCorrectCount + "A" + positionCorrectCount + "B";
    }
    public boolean isRepeat( List<String> listname){
        long count = listname.stream().distinct().count();
        if(count < listname.size()){
            System.out.println("Warning! There exsit some repeat number,please input diffierent number:");
            return true;
        }
        return false;
    }
}
