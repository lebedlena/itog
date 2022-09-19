package com.example.randomapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSubmit;
    TextView tvComment;
    EditText etGuess;

    int guess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        tvComment = findViewById(R.id.tvComment);
        etGuess = findViewById(R.id.etGuess);
        btnSubmit.setOnClickListener(this);
        guess = new Random().nextInt(10) + 1;
    }
    @Override
    public void onClick(View view) {
        int user_guess = Integer.parseInt(etGuess.getText(). toString());

        if (user_guess == guess) {
            tvComment.setText("Правильно! Давай ещё раз!");
            guess = new Random().nextInt(10) + 1;
        }
        else if (user_guess <1 || user_guess > 10){
            tvComment.setText("Только от 1 до 10!");
        }
        else if (user_guess > guess){
            tvComment.setText("Число меньше!");
        }
        else if (user_guess < guess){
            tvComment.setText("Маловато будет!");
        }
        etGuess.setText("");

    }
}