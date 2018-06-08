package com.google.ar.core.examples.java.helloar;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private Button button;
    private TextView textView;
    private RelativeLayout.LayoutParams layoutParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.main_text);
        textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
        CircleImageView civ = (CircleImageView) findViewById(R.id.circleImageView);
        /*button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.onClickListener());
//        civ.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(this, HelloArActivity.class);
//                startActivity(nextActivity);
//            }
//        });

        civ.setOnClickListener((v) ->{
            Intent startFurnitureActivity = new Intent(this, HelloArActivity.class);
            startActivity(startFurnitureActivity);
        });
        //mToolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(mToolbar);*/
    }

}
