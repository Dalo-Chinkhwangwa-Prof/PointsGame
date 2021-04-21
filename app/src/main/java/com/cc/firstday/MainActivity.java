package com.cc.firstday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button clickMe;
    private ImageView imgLogo;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLogo = findViewById(R.id.poster_imageview);
        textView = findViewById(R.id.textView);
        textView.setText(getString(R.string.points_text, count));

        clickMe = findViewById(R.id.click_button);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count %10 == 0)
                    imgLogo.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.points_image));
//                    imgLogo.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.deepRed), PorterDuff.Mode.SRC_IN);
                else
                    imgLogo.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.ic_star));
//                    imgLogo.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.coolBlue), PorterDuff.Mode.SRC_IN);

                textView.setText(getString(R.string.points_text, count));
            }
        });

    }
}