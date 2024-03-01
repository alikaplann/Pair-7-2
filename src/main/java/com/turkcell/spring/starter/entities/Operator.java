package com.turkcell.spring.starter.entities;

public class Operator extends Person{
    public int supportCnt;

    public Operator(int id, String name, String lastName, String eMail, String number) {
        super(id, name, lastName, eMail, number);
    }

    public int getHelpCnt() {
        return supportCnt;
    }

    public void setHelpCnt(int helpCnt) {
        this.supportCnt = helpCnt;
    }
}
