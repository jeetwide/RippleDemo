package com.example.jeetendraachtani.rippledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jeetendraachtani.rippledemo.BottomBar.ActWelcomeBottomBar;
import com.example.jeetendraachtani.rippledemo.Ripple.ActRippleMaterial;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActWelcome extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.btn_ripple)
    Button btn_ripple;


    @BindView(R.id.btn_bottom_bar)
    Button btn_bottom_bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_welcome);
        ButterKnife.bind(this);
        btn_ripple.setOnClickListener(this);
        btn_bottom_bar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_ripple:
                startActivity(new Intent(ActWelcome.this, ActRippleMaterial.class));
                break;
                case R.id.btn_bottom_bar:
                startActivity(new Intent(ActWelcome.this, ActWelcomeBottomBar.class));
                break;
        }
    }
}
