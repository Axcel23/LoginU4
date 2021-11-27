package com.example.loginu4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class ResgitroActivity extends AppCompatActivity {
private EditText nombre;
private EditText telefono;
private EditText correo;
private EditText contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgitro);
    }

    public void btncancelado(View view) {
        Intent atra = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(atra);
    }

    public void btnguardado(View view) {
     nombre = findViewById(R.id.txtnombre);
     telefono = findViewById(R.id.txttelefono);
     correo = findViewById(R.id.txtcorreo);
     contraseña = findViewById(R.id.txtcontraseña);

     if (telefono.getText().toString().matches("[0-9]+")) {

         Usuario usua = new Usuario(nombre.getText().toString(), Integer.parseInt(telefono.getText().toString()),
                 correo.getText().toString(), contraseña.getText().toString());

         Intent logi = new Intent(getApplicationContext(), MainActivity.class);
         logi.putExtra("Sas", usua);
         startActivity(logi);
     }
    }
}