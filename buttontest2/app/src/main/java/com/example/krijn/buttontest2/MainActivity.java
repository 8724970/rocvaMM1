package com.example.krijn.buttontest2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button a, a1, a2, a3, raada, raadb, raadc;
    int x = 0;
    int y = 0;
    int[] kleur = {Color.BLUE, Color.GREEN, Color.RED};
    Button[] btns_raad = {raada,raadb,raadc};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        a1 = (Button) findViewById(R.id.round_A1);
        a2 = (Button) findViewById(R.id.round_A2);
        a3 = (Button) findViewById(R.id.round_A3);
        a = (Button) findViewById(R.id.square_A);

        raada = (Button) findViewById(R.id.raadA);
        raadb = (Button) findViewById(R.id.raadB);
        raadc = (Button) findViewById(R.id.raadC);

        Button[] btns_raad={raada, raadb, raadc};

        //.setText("help");


        btns_raad[0].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (y > 2) {
                    y = 0;
                }

                raada.setBackgroundColor(kleur[y]);
                raada.setTag(y);
                y++;

                //String name = "aaaa";
                //Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                //intent.putExtra("name", name);
                //startActivity(intent);
            }
        });


        a1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (y > 2) {
                    y = 0;
                }
                //a1.setBackgroundDrawable(new PaintDrawable(kleur[y]));
                a1.setBackgroundColor(kleur[y]);


                a1.setTag(y);
                y++;
            }
        });

        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if ((Integer)raada.getTag()== (Integer)a1.getTag()){
                    a.setText("goed");}
                else {a.setText("fout");}

            }


        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
