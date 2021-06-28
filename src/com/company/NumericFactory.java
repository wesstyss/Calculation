package com.company;

import java.util.ArrayList;
import java.util.List;

public class NumericFactory {

    public ArabianPairs arabianInit(String[] strings) {
        ArabianPairs pair = new ArabianPairs();
        pair.setFirstNumber(Integer.parseInt(strings[0]));
        pair.setSecondNumber(Integer.parseInt(strings[1]));
        return pair;
    }

    public  void arabianExec(ArabianPairs pair, String operationType) {
        switch (operationType){
            case "+":
                System.out.println(pair.firstNumber + pair.secondNumber);
                break;
            case "-":
                System.out.println(pair.firstNumber - pair.secondNumber);
                break;
            case "/":
                System.out.println(pair.firstNumber / pair.secondNumber);
                break;
            case "*":
                System.out.println(pair.firstNumber * pair.secondNumber);
                break;
        }
    }

    public List<RomanNumber> romanianInit(String[] strings) {
        RomanNumber a = new RomanNumber(strings[0]);
        RomanNumber b = new RomanNumber(strings[1]);
        List<RomanNumber> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }

    public  void romanianExec(List<RomanNumber> list, String operationType) {
        switch (operationType){
            case "+":
                System.out.println(list.get(0).plus(list.get(1)));
                break;
            case "-":
                System.out.println(list.get(0).minus(list.get(1)));
                break;
            case "/":
                System.out.println(list.get(0).dvd(list.get(1)));
                break;
            case "*":
                System.out.println(list.get(0).multplay(list.get(1)));
                break;
        }
    }

}
