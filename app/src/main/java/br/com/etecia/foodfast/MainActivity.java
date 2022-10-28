package br.com.etecia.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //inserindo o menu na barra do aplicativo
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //Criando o método


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFav:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no favoritos",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mNovoGrupo:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no novo grupos",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mPagamentos:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no pagamentos",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfig:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no configurações",
                        Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}