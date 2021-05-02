package com.abhilasha.androidclass.radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radio_group);

        //this is called when you select ant radio radio button from radio group
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id)//method is used to get checked radio buttons id
            //radioGroup is a object of RadioGroup class
            //id is the id that we have passed to diffrent radio buttons
            {
                radioButton = radioGroup.findViewById(id);
                //you can also give toast message here
                Toast.makeText(MainActivity.this, "" + radioButton.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void submitRadioButton(View view) {

        //selectedid is id which is getting from checked radio button
        int selectedid = radioGroup.getCheckedRadioButtonId();

        //here we are checking that if anything is choosen or not
        if (selectedid == -1) {
            //if no radio button is checked then it will toast this message
            Toast.makeText(this, "you have not selected anything", Toast.LENGTH_SHORT).show();

        } else {
            //if selected one radio button then it will show this toast message
            Toast.makeText(this, "" + radioButton.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}
