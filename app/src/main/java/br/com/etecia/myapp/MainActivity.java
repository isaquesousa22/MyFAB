package br.com.etecia.myapp;

import static androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    //DECLARANDO A VARÍAVEL QUE REPRESENTARÁ O COMPONENTE XML
   FloatingActionButton idFAB;
   ExtendedFloatingActionButton idFABExtend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Apresentar ao java o xml
        idFAB = findViewById(R.id.idFAB);
        idFABExtend = findViewById(R.id.idFABExtend);

        idFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei no FAB", Toast.LENGTH_SHORT).show();
            }

        });

        idFABExtend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei nesse Botão", Toast.LENGTH_SHORT).show();
            }
        });

    }



}