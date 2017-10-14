package com.darshanpable.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast (String str){
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view){
        EditText guessEditText = (EditText) findViewById(R.id.editText2);
        int guessInt = Integer.parseInt(guessEditText.getText().toString());
        if (guessInt > randomNumber){
                makeToast("Lower!");
        }
        else if (guessInt < randomNumber){
            makeToast("Greater!");
        }
        else {
            makeToast("That's Right! Try again!");
            Random rand = new Random();
            randomNumber = rand.nextInt(20)+1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}
