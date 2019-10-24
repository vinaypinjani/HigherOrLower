package com.vinaypinjani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void generateRandomNumber() {
        Random rand = new Random();

        randomNumber = rand.nextInt(21);

    }

    int randomNumber;

    public void guess(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        Log.i("Entered Value", editText.getText().toString());
        Log.i("RandomNumber", Integer.toString(randomNumber));

        int enteredNumber = Integer.parseInt(editText.getText().toString());

        String message;

        if (enteredNumber == randomNumber) {

            message = "You got it!";
            generateRandomNumber();

        }else if (enteredNumber < randomNumber) {

            message = "Higher!";

        }else {

            message = "Lower";

        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();



    }
}
