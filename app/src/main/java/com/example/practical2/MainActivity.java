package com.example.practical2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button);
        e1=(EditText) findViewById(R.id.number1);
        e2=(EditText) findViewById(R.id.number2);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,sum;
                a=Integer.parseInt(e1.getText().toString());
                b=Integer.parseInt(e2.getText().toString());

                sum=a+b;
                String s= Integer.toString(sum);

                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();

            }
        });
    }

}
