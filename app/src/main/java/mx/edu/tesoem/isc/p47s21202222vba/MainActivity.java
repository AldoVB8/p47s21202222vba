package mx.edu.tesoem.isc.p47s21202222vba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnsuma,btnresta,btnmulti,btndivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsuma = findViewById(R.id.btnsumar);
        btnresta = findViewById(R.id.btnresta);
        btnmulti = findViewById(R.id.btnmulti);
        btndivision = findViewById(R.id.btndivision);


        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent psuma = new Intent(MainActivity.this,Activitysuma.class);
                startActivity(psuma);
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent presta = new Intent(MainActivity.this,Activityresta.class);
                startActivity(presta);
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pmulti = new Intent(MainActivity.this,Activitymulti.class);
                startActivity(pmulti);
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pdivision = new Intent(MainActivity.this,Activitydivision.class);
                startActivity(pdivision);
            }
        });
    }
}