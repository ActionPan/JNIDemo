package jnidemo.demo.com.jnidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //加载动态so库，这个名字跟build.gradle中配置moduleName的名字一样
    static {
        System.loadLibrary("jnidemo");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText(getStringFromNative());
    }

    //声明一个本地方法，用native关键字修饰，这是jni调用的方法
    public native String getStringFromNative();
}
