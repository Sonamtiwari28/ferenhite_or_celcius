package com.sonam.converter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    Button button1;
    EditText edit2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=findViewById(R.id.faren);
        button1=findViewById(R.id.but1);
        edit2=findViewById(R.id.cel);
        button2=findViewById(R.id.but2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int f=Integer.parseInt(edit1.getText().toString());
                double ans=((f-32)*5)/9;
                edit2.setText( String.valueOf(ans));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c=Integer.parseInt(edit2.getText().toString());
                double ans=((c*9)/5)+32;
                edit1.setText(String.valueOf(ans));
            }
        });
    }
}
