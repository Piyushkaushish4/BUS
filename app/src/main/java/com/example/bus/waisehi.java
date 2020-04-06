package com.example.bus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class waisehi extends AppCompatActivity {
EditText show,money;
Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waisehi);
        show=findViewById(R.id.showam);
        add=findViewById(R.id.btadd);
        money=findViewById(R.id.addmo);
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Amount = money.getText().toString();
                show.setText("\nAmount\t" + Amount);

            }
        });
    }
}
