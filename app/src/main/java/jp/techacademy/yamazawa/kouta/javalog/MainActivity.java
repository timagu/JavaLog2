package jp.techacademy.yamazawa.kouta.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 名前を幸太、年齢34歳で、Humanのインスタンスを作る
        Human human = new Human("幸太", 34, "趣味");
        human.say();
        human.think();
    }
}
