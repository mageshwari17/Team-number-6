package com.internshala.shinchan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class mode2 extends AppCompatActivity {
    TextView MODE,TYPE;
    RadioButton radioGovernment,radioPrivate,radioHomeopathy,radioAyurveda,radioSiddha,radioGeneral;
    FirebaseAuth mFirebaseAuth;
    private Object AuthResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode2);
        mFirebaseAuth = FirebaseAuth.getInstance();
        MODE= findViewById(R.id.mode);
        TYPE= findViewById(R.id.type);
        radioGovernment= findViewById(R.id.gov);
        radioPrivate = findViewById(R.id.pri);
        radioHomeopathy = findViewById(R.id.hom);
        radioAyurveda = findViewById(R.id.ayur);
        radioGeneral = findViewById(R.id.gen);
        radioSiddha = findViewById(R.id.sid);
    }
}
