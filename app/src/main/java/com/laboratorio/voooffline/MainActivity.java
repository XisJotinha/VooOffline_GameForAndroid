package com.laboratorio.voooffline;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView textView = new TextView(this);
        textView.setText("VooOffline - Versao 32-bits\nCriado pelo MrBlue.. 🔥\nSem ganancia, so diversao!");
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(22);
        textView.setGravity(Gravity.CENTER);
        
        // Fundo escuro estilo jogo de respeito
        textView.setBackgroundColor(Color.parseColor("#121212"));
        
        setContentView(textView);
    }
}

