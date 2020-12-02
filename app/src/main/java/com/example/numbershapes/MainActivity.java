package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    static class Number {

        int number;

        public boolean isSquare(){
            double numRoot = Math.sqrt(number);
            if(numRoot == Math.floor(numRoot)) {
                return true;
            }else{
                return false;
            }

        }

        public boolean isTriangular(){
            int x = 1;
            int triangularNum = 1;

            while(triangularNum < number){
                x++;
                triangularNum = triangularNum + x;
            }
            if(triangularNum == number){
                return true;
            }else{
                return false;
            }
        }
    }

    public void buttonClicked(View view){
        EditText editText = (EditText)findViewById(R.id.editTextNumber);
        Number bakis = new Number();
        bakis.number = Integer.parseInt(editText.getText().toString());
        String message = editText.getText().toString();
        if(bakis.isTriangular() && bakis.isSquare()){
            message += " is both a triangular and square number";
        }else if(bakis.isTriangular()) {
            message += " is a triangular number";
        }else if(bakis.isSquare()){
            message += " is a square number";
        }else{
            message += " is neither a square not triangular number";
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}