package com.example.ejercicio11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button buttonMostrarToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asignar elementos de diseño a variables
        editText = findViewById(R.id.editText);
        buttonMostrarToast = findViewById(R.id.buttonMostrarToast);

        // Agregar OnClickListener al botón
        buttonMostrarToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener el texto del EditText
                String textoIngresado = editText.getText().toString();

                // Mostrar Toast con el texto ingresado
                Toast.makeText(getApplicationContext(), textoIngresado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
