package ru.mirea.NovichikhinMikhailDmitrievich.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvStateMirea;
    private Button btnChangeStateMirea;

    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvStateMirea = findViewById(R.id.textViewStateMirea);
        btnChangeStateMirea = findViewById(R.id.btnChangeStateMirea);

        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count++;
                tvStateMirea.setText(String.format("Mirea Count " + count));
            }
        };

        btnChangeStateMirea.setOnClickListener(onClickListener);
    }

    public void setNewText(View view){
        count++;
        tvStateMirea.setText(String.format("SET NEW TEXT"+  count));
    }
}