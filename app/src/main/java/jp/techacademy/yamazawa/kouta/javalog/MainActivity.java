package jp.techacademy.yamazawa.kouta.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*int t = total(50,1000); // ここでtotalからsumを返してもらう
        Log.d("javatest",String.valueOf(t));*/

        Dog dog = new Dog("ポチ",3); // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say(); //ポチが吠えます。（ログ出力）
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        Dog dog2 = new Dog("ハチ", 10);   // 名前をハチ、年齢10歳で、Dogインスタンスを作る
        dog2.say();  // ハチが吠えます（ログ出力）
        Log.d("javatest", "犬の名前は" + dog2.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog2.age + "歳です。");

    }

    /*private int total(int first, int last){
        int sum = 0;
        for (int i = first; i <= last; i++){
            sum=sum+i;
        }

        return sum;
    }*/
}
