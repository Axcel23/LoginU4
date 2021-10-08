package com.example.loginu4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Intent datos= getIntent();
            String nombre= datos.getStringExtra("nombre");
            String telefono = ""+datos.getIntExtra("telefono", -1);
            String correo = datos.getStringExtra("correo");
            String contraseña = datos.getStringExtra("contraseña");
            Snackbar msm= Snackbar.make
                    (findViewById(R.id.datos), nombre+"-"+telefono+"-"+correo+"-"+contraseña,
                            BaseTransientBottomBar.LENGTH_LONG);
            if (!nombre.equals("")||telefono.equals("")||correo.equals("")||contraseña.equals("")){
                msm.show();
            }
        }catch (Exception e){

        }
    }

    public void btnRegistro(View view) {
        Intent pasar= new Intent(getApplicationContext(), ResgitroActivity.class);
        startActivity(pasar);
    }
}