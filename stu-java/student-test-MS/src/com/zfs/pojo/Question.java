package com.zfs.pojo;

import java.util.ArrayList;

public class Question {

    private int qNo;
    private String qName;
    private Character option;
    private Character answer;

    static int count = 0;

    {
        count++;
        qNo = count;
    }

    public Question() {
    }

    public Question( String qName,  Character answer) {
        this.qName = qName;
        this.answer = answer;
    }

    public int getqNo() {
        return qNo;
    }

    public void setqNo(int qNo) {
        this.qNo = qNo;
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName;
    }

    public Character getOption() {
        return option;
    }

    public void setOption(Character option) {
        this.option = option;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Question.count = count;
    }

    public Character getAnswer() {
        return answer;
    }

    public void setAnswer(Character answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qNo=" + qNo +
                ", qName='" + qName + '\'' +
                ", option=" + option +
                ", answer=" + answer +
                '}';
    }

}
