package br.com.trajanocamargo.ambientacaoarturnogueiragitreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibriLog(View v){
        Log.d("MainActivity", " - Click");
    }

    public void outraFuncao(View v){
        Log.d("MainActivity", " - Click");
    }

    public void outraFuncaoNovaDenovo(View v){
        Log.d("MainActivity", " - Click");
    }
}
