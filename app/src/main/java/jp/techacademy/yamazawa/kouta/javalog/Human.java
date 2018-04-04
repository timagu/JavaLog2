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
        name="";
        age = 0;
        hobby="";
    }

    // 名前を幸太、年齢34歳で、Humanのインスタンスを作る
    Human human/* = new Human("幸太", 34, "趣味")*/;

    //名前と年を言う。
    public void say(){
        Log.d("javatest", "私の名前は" + human.name + "です。年は" + human.age + "歳です。");
    }
    //趣味を言う。
    public void think(){
        Log.d("javatest", "私は" + human.hobby + "について考える");
    }
}
