package com.example.appdasregioes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EstadosActivity extends AppCompatActivity {

    private Button btnVoltaRegioes;
    private TextView tvEstados;
    private ImageView ivesquerda, ivdireita;
    private String[] CentroOeste0, Nordeste1,Norte2,Sudeste3,Sul4;
    private int tipo;
    private LinearLayout layout;
    private int contador2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estados);

        btnVoltaRegioes = (Button) findViewById(R.id.btnVoltaRegioes);

        CentroOeste0 = new String[] {
                "Mato Grosso", "Goiás", "Mato Grosso do Sul", "Distrito Federal"
        };
        Nordeste1 = new String[] {
                "Maranhão", "Piauí", "Ceará", "Bahia", "Rio Grande do Norte", "Paraíba", "Pernambuco", "Alagoas", "Sergipe"
        };
        Norte2 = new String[] {
                "Acre", "Amazonas", "Roraima", "Amapá", "Pará", "Tocantins", "Rondônia"
        };
        Sudeste3 = new String[] {
                "São Paulo", "Minas Gerais", "Espírito Santo", "Rio de Janeiro"
        };
        Sul4 = new String[] {
                "Paraná","Santa Catarina","Rio Grande do Sul"
        };

        tipo = getIntent().getExtras().getInt("regioes");
        layout = (LinearLayout) findViewById(R.id.layout);
        tvEstados = (TextView) findViewById(R.id.tvEstados);
        ivdireita = (ImageView) findViewById(R.id.ivDireita);
        ivesquerda = (ImageView) findViewById(R.id.ivEsquerda);
        ivesquerda.setImageResource(R.drawable.esquerda);
        ivdireita.setImageResource(R.drawable.direita);

        if (tipo == 0) {

            tvEstados.setText(CentroOeste0[contador2]);

            layout.setOnTouchListener(new OnSwipeTouchListener(this) {
                @Override
                public void onSwipeRight() {
                    super.onSwipeRight();
                    if (contador2 > 0) contador2--;
                    tvEstados.setText(CentroOeste0[contador2]);
                }

                @Override
                public void onSwipeLeft() {
                    super.onSwipeLeft();
                    if (contador2 < 2) contador2++;
                    tvEstados.setText(CentroOeste0[contador2]);
                }
            });
        }
        if (tipo == 1) {

            tvEstados.setText(Nordeste1[contador2]);

            layout.setOnTouchListener(new OnSwipeTouchListener(this) {
                @Override
                public void onSwipeRight() {
                    super.onSwipeRight();
                    if (contador2 > 0) contador2--;
                    tvEstados.setText(Nordeste1[contador2]);
                }

                @Override
                public void onSwipeLeft() {
                    super.onSwipeLeft();
                    if (contador2 < 8) contador2++;
                    tvEstados.setText(Nordeste1[contador2]);
                }
            });
        }

        if (tipo == 2) {

            tvEstados.setText(Norte2[contador2]);

            layout.setOnTouchListener(new OnSwipeTouchListener(this) {
                @Override
                public void onSwipeRight() {
                    super.onSwipeRight();
                    if (contador2 > 0) contador2--;
                    tvEstados.setText(Norte2[contador2]);
                }

                @Override
                public void onSwipeLeft() {
                    super.onSwipeLeft();
                    if (contador2 < 6) contador2++;
                    tvEstados.setText(Norte2[contador2]);
                }
            });
        }

        if (tipo == 3) {

            tvEstados.setText(Sudeste3[contador2]);

            layout.setOnTouchListener(new OnSwipeTouchListener(this) {
                @Override
                public void onSwipeRight() {
                    super.onSwipeRight();
                    if (contador2 > 0) contador2--;
                    tvEstados.setText(Sudeste3[contador2]);
                }

                @Override
                public void onSwipeLeft() {
                    super.onSwipeLeft();
                    if (contador2 < 3) contador2++;
                    tvEstados.setText(Sudeste3[contador2]);
                }
            });
        }

        if (tipo == 4)
        {

            tvEstados.setText(Sul4[contador2]);

            layout.setOnTouchListener(new OnSwipeTouchListener(this) {
                @Override
                public void onSwipeRight() {
                    super.onSwipeRight();
                    if (contador2 > 0) contador2--;
                    tvEstados.setText(Sul4[contador2]);
                }

                @Override
                public void onSwipeLeft() {
                    super.onSwipeLeft();
                    if (contador2 < 2) contador2++;
                    tvEstados.setText(Sul4[contador2]);
                }
            });
        }

        btnVoltaRegioes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent
                        (EstadosActivity.this, RegioesActivity.class);
                startActivity(intent);
            }
        });

    }
}
