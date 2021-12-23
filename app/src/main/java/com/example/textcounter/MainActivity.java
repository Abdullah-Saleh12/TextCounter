package com.example.textcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.textcounter.utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    Spinner spCountingOption;
    EditText edTextInput;
    TextView tvResult;
    Boolean output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spCountingOption =  findViewById(R.id.spCountingOption);
        this.edTextInput = findViewById(R.id.edTextInput);
        this.tvResult = findViewById(R.id.tvResult);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counter_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCountingOption.setAdapter(adapter);
    }

    public void onBtnClick(View view) {
        String phrase = this.edTextInput.getText().toString();
        output = Boolean.valueOf(phrase);
        int charsCount = TextCounter.getCharsCount(phrase);
        String formattedResult = String.valueOf(charsCount);
        if (output = this.edTextInput.getText().toString().isEmpty()) {
            //output = "You must enter words to count them";
            Toast.makeText(this, "You must enter words to count them", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, formattedResult, Toast.LENGTH_LONG).show();
        }
        this.tvResult.setText(String.valueOf(TextCounter.getCharsCount(this.edTextInput.getText().toString())));
    }
}