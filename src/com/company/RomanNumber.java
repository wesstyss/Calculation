package com.company;

public class RomanNumber {
    private String value;
    private int predicate;

    public RomanNumber(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getPredicate() {
        return predicate;
    }

    public String plus(RomanNumber number) {
        this.predicate = RomanWrapper.parseToRoman(this.value);
        number.predicate = RomanWrapper.parseToRoman(number.value);
        this.predicate = this.predicate + number.predicate;
        return RomanWrapper.toArabian(this.predicate);
    }
    public String minus(RomanNumber number) {
        this.predicate = RomanWrapper.parseToRoman(this.value);
        number.predicate = RomanWrapper.parseToRoman(number.value);
        this.predicate = this.predicate - number.predicate;
        if(this.predicate < 0) {
            return "-" + RomanWrapper.toArabian(Math.abs(this.predicate));
        }
        if(this.predicate == 0) {
            return "0";
        }
        return RomanWrapper.toArabian(this.predicate);
    }
    public String dvd(RomanNumber number) {
        this.predicate = RomanWrapper.parseToRoman(this.value);
        number.predicate = RomanWrapper.parseToRoman(number.value);
        this.predicate = this.predicate / number.predicate;
        return RomanWrapper.toArabian(this.predicate);
    }
    public String multplay(RomanNumber number) {
        this.predicate = RomanWrapper.parseToRoman(this.value);
        number.predicate = RomanWrapper.parseToRoman(number.value);
        this.predicate = this.predicate * number.predicate;
        return RomanWrapper.toArabian(this.predicate);
    }
}
