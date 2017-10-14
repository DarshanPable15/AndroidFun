package com.darshanpable.numbershapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;

        public boolean isSquare(){
            double squareRoot = Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot))
                return true;
            else
                return false;
        }
        public boolean isTriangular(){
            int x = 1;
            int TriangularNumber = 1;

            while(TriangularNumber < number){
                x++;
                TriangularNumber = TriangularNumber + x;
            }
            if(TriangularNumber == number){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void testNumber(View view){

        String message = "";

        EditText UsersNumber = (EditText) findViewById(R.id.UsersNumber);

        if (UsersNumber.getText().toString().isEmpty()){
            message = "Please Enter Number!";
        }
        else {

            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(UsersNumber.getText().toString());

            if (myNumber.isSquare() == true) {

                if (myNumber.isTriangular() == true) {

                    message = myNumber.number + " is both Triangular and Square! ";
                } else {
                    message = myNumber.number + " is Square but not Triangular.";
                }
            } else {
                if (myNumber.isTriangular() == true) {

                    message = myNumber.number + " is Triangular but not Square. ";
                } else {
                    message = myNumber.number + " is neither Square nor Triangular.";
                }
            }
        }
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
