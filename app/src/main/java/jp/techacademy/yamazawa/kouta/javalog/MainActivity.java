package jp.techacademy.yamazawa.kouta.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Lesson3課題
        Log.d("javatest", "私の名前は" + Human.name + "です。年は" + Human.age + "歳です。");
        Log.d("javatest", "私は" + Human.hobby + "について考える");

    }
}
