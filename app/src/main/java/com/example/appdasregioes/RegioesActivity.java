package com.example.appdasregioes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RegioesActivity extends AppCompatActivity {

    private TextView tvRegioes;
    private ImageView ivAbaixo, ivAcima;
    private String[] regioes;
    private LinearLayout layout;
    private int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regioes);

        regioes = new String[] {
                "Centro-Oeste",
                "Nordeste",
                "Norte",
                "Sudeste",
                "Sul"
        };

        layout = (LinearLayout) findViewById(R.id.layout);
        tvRegioes = (TextView) findViewById(R.id.tvRegioes);
        ivAbaixo = (ImageView) findViewById(R.id.ivAbaixo);
        ivAcima = (ImageView) findViewById(R.id.ivAcima);


        tvRegioes.setText( regioes[contador] );

        layout.setOnTouchListener( new OnSwipeTouchListener(this){

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                if (contador<5) contador ++;
                tvRegioes.setText( regioes[contador]);
            }

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                if(contador>0) contador --;
                tvRegioes.setText( regioes[contador]);
      //      }
       //    @Override
        //    public void onSwipeRight() {
         //       super.onSwipeRight();
         //       tvRegioes.setText( estados[contador]);
         //  }
            //
          //  @Override
          //  public void onSwipeLeft() {
          //      super.onSwipeLeft();
          //      tvAfirmacao.setText( estados[contador]);
           }
        });
    }
}
