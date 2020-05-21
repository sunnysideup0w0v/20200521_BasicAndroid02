package com.example.a20200521_basicandroid02;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import java.math.MathContext;

public abstract class BaseActivity extends AppCompatActivity {
    public Context mContext = this;
    public abstract void setupEvents();
    public abstract void setValues();
}
