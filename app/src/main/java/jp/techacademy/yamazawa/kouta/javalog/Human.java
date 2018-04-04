package jp.techacademy.yamazawa.kouta.javalog;

import android.util.Log;

/**
 * Created by 幸太 on 2018/03/30.
 */

public class Human extends Animal implements Thinkable{
    //メンバ変数
    String hobby;

    public Human(String name, int age, String hobby){
        //コンストラクタ
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    //名前と年を言う。
    public void say(){
        Log.d("javatest", "私の名前は" + name + "です。年は" + age + "歳です。");
    }
    //趣味を言う。
    public void think(){
        Log.d("javatest", "私は" + hobby + "について考える");
    }
}
