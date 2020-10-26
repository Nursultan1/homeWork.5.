package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss= new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("Range weapon ");
        System.out.println("Damage:" + boss.getDamage()+" Health:"+ boss.getHealth()+
                " Defence Type:"+ boss.getDefenceType());
    }
}