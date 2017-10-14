package com.darshanpable.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);

        Double AmtDouble = Double.parseDouble(amountEditText.getText().toString());
        Double ConvAmt = AmtDouble * 0.016;

        Toast.makeText(MainActivity.this,"$" + String.format("%2f", ConvAmt), Toast.LENGTH_SHORT).show();

        Log.i("test", amountEditText.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
