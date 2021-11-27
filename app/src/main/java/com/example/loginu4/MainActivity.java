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
            Bundle sabe = getIntent().getExtras();
            Usuario usua= sabe.getParcelable("Sas");
            Snackbar msm= Snackbar.make
                    (findViewById(R.id.datos),usua.getNombre()+"-"+usua.getTelefono()+"-"+usua.getCorreo()+"-"+usua.getContraseña(),
                            BaseTransientBottomBar.LENGTH_LONG);
            if (!usua.getNombre().equals("") && usua.getCorreo().equals("")&&usua.getContraseña().equals("")){
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