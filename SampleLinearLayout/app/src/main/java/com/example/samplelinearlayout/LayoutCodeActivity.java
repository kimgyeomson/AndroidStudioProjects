package com.example.samplelinearlayout;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        // new 연산자로 리니어 레이아웃을 만들고 방향 설정

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        // new 연산자로 레이아웃 안에 추가될 뷰들에 설정할 파라미터 생성

        Button button1 = new Button(this);
        button1.setText("Button1");
        button1.setLayoutParams(params);
        mainLayout.addView(button1);
        // 버튼에 파라미터 설정하고 레이아웃에 추가

        setContentView(R.layout.gravity); // 새로 만든 레이아웃을 화면에 설정
    }
}