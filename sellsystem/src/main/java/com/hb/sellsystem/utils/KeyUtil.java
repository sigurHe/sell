package com.hb.sellsystem.utils;

import java.util.Random;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:14:28.
 */
public class KeyUtil {


    public synchronized static String generateKey(){
        Random random = new Random();
        Integer num = random.nextInt(900000) + 100000;
        return String.valueOf(num) + System.currentTimeMillis();
    }

}
