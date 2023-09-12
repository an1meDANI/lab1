package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private TextView main_text;
    private TextView main_text2;
    private ImageView main_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_text=findViewById(R.id.textView);
        main_text2=findViewById(R.id.textView2);
        main_img=findViewById(R.id.imageView);
    }

    public void btn_click(View view) {
        if (main_text.getVisibility()==View.INVISIBLE && main_text2.getVisibility()==View.INVISIBLE) {
            main_text.setVisibility(View.VISIBLE);
            main_text2.setVisibility(View.VISIBLE);
        }
        else {
            main_text.setVisibility(View.INVISIBLE);
            main_text2.setVisibility(View.INVISIBLE);
        }
    }

    public void imgbtn_click(View view) {
        if (main_img.getVisibility()==View.INVISIBLE) {
            main_img.setVisibility(View.VISIBLE);
        }
        else {
            main_img.setVisibility(View.INVISIBLE);
        }
    }
}