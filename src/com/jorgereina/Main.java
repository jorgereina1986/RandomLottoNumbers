package com.jorgereina;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i = 0; i < 20; i++)
        {

            System.out.println(randInt(1,59)+" "+randPowerInt(1,26));
        }


    }

    public static String randInt(int min, int max) {

        int firstRandomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        int secondRandomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        int thirdRandomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        int fourthRandomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        int fifthRandomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        if(secondRandomNum == firstRandomNum)
        {
            secondRandomNum = ThreadLocalRandom.current().nextInt(min,max + 1);
        }
        if(thirdRandomNum == secondRandomNum || thirdRandomNum == firstRandomNum)
        {
            thirdRandomNum = ThreadLocalRandom.current().nextInt(min,max + 1);
        }
        if(fourthRandomNum == thirdRandomNum || fourthRandomNum == secondRandomNum ||
                fourthRandomNum == firstRandomNum)
        {
            fourthRandomNum = ThreadLocalRandom.current().nextInt(min,max + 1);
        }
        if(fifthRandomNum == fourthRandomNum || fifthRandomNum == thirdRandomNum ||
                fifthRandomNum == secondRandomNum || fifthRandomNum == firstRandomNum)
        {
            fifthRandomNum = ThreadLocalRandom.current().nextInt(min,max + 1);
        }


        String lottoNum = firstRandomNum +" "+ secondRandomNum +" "+ thirdRandomNum +
                " "+fourthRandomNum + " "+fifthRandomNum;

        return lottoNum;
    }

    public static String randPowerInt(int min, int max) {

        int powerballRandomNum = ThreadLocalRandom.current().nextInt(min, max + 1);


        String powerballNum = String.valueOf(powerballRandomNum);

        return powerballNum;
    }
}
