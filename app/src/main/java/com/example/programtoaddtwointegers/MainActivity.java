package com.example.programtoaddtwointegers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.programtoaddtwointegers.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Button button;
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final EditText editText = (EditText) findViewById(R.id.ed1);
        final EditText editText1 = (EditText) findViewById(R.id.ed2);
        button = (Button)findViewById(R.id.btnSum);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int e1 = Integer.parseInt(editText.getText().toString());
                int e2 = Integer.parseInt(editText1.getText().toString());
                sum = e1+e2;

                String ans = String.valueOf(sum);
                binding.answer.setText(ans);
            }
        });

    }
}