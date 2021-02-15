package com.example.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addNickName(View v){
        EditText nickNameEdit = findViewById(R.id.nickname_edit);
        String nickNameText = nickNameEdit.getText().toString();
        TextView nickNameTextView = findViewById(R.id.nickname_text);
        nickNameTextView.setText(nickNameText);
        nickNameTextView.setVisibility(View.VISIBLE);

        Context context = v.getContext();
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}