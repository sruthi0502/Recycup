package com.example.recycup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    EditText emailAddText, passwordText, usernameText;
    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        emailAddText = (EditText) findViewById(R.id.email_address) ;
        passwordText  = (EditText)  findViewById(R.id.password);
        usernameText  = (EditText)  findViewById(R.id.username);

        btnSignup = (Button) findViewById(R.id.button);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailaddress = emailAddText.getText().toString();
                String pass = passwordText.getText().toString();
                String user = usernameText.getText().toString();

                if (emailaddress.equals("user") && (pass.equals("123") && (user.equals("sri"))))
                {
                    Toast.makeText(signup.this, "Successful Signup", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Main_page.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(signup.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

