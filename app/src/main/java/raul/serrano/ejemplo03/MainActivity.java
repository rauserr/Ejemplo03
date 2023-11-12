package raul.serrano.ejemplo03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("ESTADOS, ", "1- En el método onCreate");
        btnAbrir = findViewById(R.id.btnAbrirMain);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS, ", "2- En el método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS, ", "3- En el método onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4- En el método onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS, ", "5- En el método onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS, ", "6- En el método onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS, ", "7- En el método onDestroy");
    }
}