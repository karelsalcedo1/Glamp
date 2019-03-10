package com.example.glamp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }


    public void whyconectgoogle(View view) {
        AlertDialog.Builder db = new AlertDialog.Builder(this);
        db.setTitle("¿Porque conectar con google?");
        db.setMessage("Conectadote con google podremos guardar la información de tus dispositivos conectados asi como podras configurar tu preferencias.");
        db.setPositiveButton("¡Perfecto!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog dialog = db.show();

    }

    public void conectlamp(View view) {
        Intent intent = new Intent(LoginActivity.this, ListDeviceActivity.class);
        startActivity(intent);
    }
}
