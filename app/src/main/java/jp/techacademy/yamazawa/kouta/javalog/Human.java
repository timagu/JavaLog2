package jp.techacademy.yamazawa.kouta.javalog;

import android.util.Log;

/**
 * Created by 幸太 on 2018/03/30.
 */

public class Human extends Animal implements Thinkable{
    static String hobby = "趣味";

    public void think(){
        Log.d("javatest", "私は(Human)" + hobby + "について考える");
    }
}
