 package com.internshala.shinchan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

 public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnSignup, btnlogin;
    RadioButton radioDoctor, radioPatient;
    FirebaseAuth mFirebaseAuth;
     private Object AuthResult;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAuth = FirebaseAuth.getInstance();
        username = findViewById(R.id.user);
        password = findViewById(R.id.pass);
        btnlogin = findViewById(R.id.button);
        btnSignup = findViewById(R.id.sign);
        radioDoctor = findViewById(R.id.Doctor);
        radioPatient = findViewById(R.id.radioButton2);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnlogin.setOnClickListener(new View.OnClickListener()){
            }
                
            }
        });
        
            @Override
                    public void onClick(View v)
            {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(user.isEmpty())
                {
                    username.setError("Please enter user name");
                    username.requestFocus();
                }
                else if(pass.isEmpty())
                {
                    password.setError("please enter pass word");
                    password.requestFocus();
                }
                else if(user.isEmpty() && pass.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Fields are empty", Toast.LENGTH_SHORT).show();



                }
                else if(!(user.isEmpty() && pass.isEmpty()))
                {
                    mFirebaseAuth.createUserWithEmailAndPassword(user,pass).addOnCompleteListener(MainActivity.this,new onComplete)
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task){
                        if(!task.isSuccessful())
                        {
                            Toast.makeText(MainActivity.this,"Fields are empty",Toast.LENGTH_SHORT).show();

                        }
                        else{
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
                });


            }
            else {
                Toast.makeText(MainActivity.this,"error occured",Toast.LENGTH_SHORT).show();

            }

        });



    }
}