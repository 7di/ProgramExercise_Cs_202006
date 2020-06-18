//package com.twschool.practice;
//
//public class FizzBuzz {
//    public String say(int number) {
//        if(String.valueOf(number).contains("7")) {
//            return"Fizz";
//        }
//        else {
//            if (String.valueOf(number).contains("5")) {
//                return "BuzzWhizz";
//            }
//            else {
//                if (String.valueOf(number).contains("3")) {
//                    return "Fizz";
//                }
//                else {
//                    if (number % 3 == 0 && number % 5 != 0 && number % 7 != 0) {
//                        return "Fizz";
//                    }
//                    if (number % 5 == 0 && number % 3 != 0 && number % 7 != 0) {
//
//                        return "Buzz";
//                    }
//                    if (number % 7 == 0 && number % 3 != 0 && number % 5 != 0) {
//                        return "Whizz";
//                    }
//                    if (number % 15 == 0 && number % 7 != 0) {
//                        return "FizzBuzz";
//                    }
//                    if (number % 21 == 0 && number % 5 != 0) {
//                        return "FizzWhizz";
//                    }
//                    if (number % 105 == 0) {
//                        return "FizzBuzzWhizz";
//                    }
//                }
//            }
//        }
//        return String.valueOf(number);
//    }
//}
