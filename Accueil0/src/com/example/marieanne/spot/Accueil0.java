package com.example.marieanne.spot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Accueil0 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_amis);
        /*
        Button bouton = (Button) findViewById(R.id.button);
        
       bouton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            // Le premier paramètre est le nom de l'activité actuelle
            // Le second est le nom de l'activité de destination
            Intent secondeActivite = new Intent(Accueil0.this, ListAmis.class);
            
            startActivity(secondeActivite);
          }
        });*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_accueil0, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
      
    public void goToAccueil1(View view) {
        //Intent intentSeCo = new Intent(Accueil0.this, Accueil1.class);
    	Intent intentSeCo = new Intent(Accueil0.this, ListAmis.class);
        startActivity(intentSeCo);
    }
}
