package br.com.local.cardviewapp2h;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardTerra, cardNetuno, cardJupiter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardTerra = findViewById(R.id.id_cardPTerra);
        cardJupiter = findViewById(R.id.id_cardPJupiter);
        cardNetuno = findViewById(R.id.id_cardPNetuno);

        cardTerra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        Recebe_Planeta_Activity.class));
            }
        });

        cardJupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no planeta Jupiter!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        cardNetuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no planeta Netuno!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}