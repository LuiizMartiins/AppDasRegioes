package com.example.appdasregioes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnRegioes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegioes = (Button) findViewById(R.id.btnRegioes);

        btnRegioes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent
                        (MainActivity.this, RegioesActivity.class);
                startActivity(intent);
            }
        });

    }
}
