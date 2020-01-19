package com.example.myapplication;

import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;


/* import static com.example.myapplication.R.dimen.textsize; */

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    LinearLayout myLinear;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        myLinear = findViewById(R.id.myLinear);
        textView = findViewById(R.id.textView);

        /*myLinear.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));*/
        String x = getString(R.string.app_name);
        int i;
        for(i=1;i<=30;++i) {
            TextView textView = new TextView(MainActivity.this);
            //textView.setTextSize(getResources().getDimension(R.dimen.textsize));
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25f);
            //textView.setText("TextView");
            textView.setText(x);
            myLinear.addView(textView);
        }
    }
}
