package com.company;

public class Main {

    public static void main(String[] args) {
        int dice[] =new int[10000];
        int num[] =new int[13];
        TwoDice(dice);
        countDice(dice,num);
        PrintNum(num);


    }
    public static void TwoDice(int dice[]){
        for(int i=0;i<10000;i++){
            int dice1=(int)(Math.random()*6)+1;
            int dice2=(int)(Math.random()*6)+1;
            dice[i]=dice1+dice2;
        }
    }
    public static void countDice(int dice[],int num[]){
        for(int i=0;i<10000;i++){
            if(dice[i]==2){
                num[2]++;
            }
            else if(dice[i]==3){
                num[3]++;
            }
            else if(dice[i]==4){
                num[4]++;
            }
            else if(dice[i]==5){
                num[5]++;
            }
            else if(dice[i]==6){
                num[6]++;
            }
            else if(dice[i]==7){
                num[7]++;
            }
            else if(dice[i]==8){
                num[8]++;
            }
            else if(dice[i]==9){
                num[9]++;
            }
            else if(dice[i]==10){
                num[10]++;
            }
            else if(dice[i]==11){
                num[11]++;
            }
            else if(dice[i]==12){
                num[12]++;
            }
        }
    }
    public static void PrintNum(int num[]) {
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%d的次數有: %d\n",i,num[i]);
        }
    }
}
