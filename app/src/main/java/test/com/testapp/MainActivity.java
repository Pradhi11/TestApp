package test.com.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test","test");
        Log.d("test","test");
        Log.d("test","update from testAppbranch2Develop");

        Log.d("test","branch 1 need to update master");

        Log.d("test","--branch 2 need to update master--");

        Log.d("test","----------------------------------");



    }
}
