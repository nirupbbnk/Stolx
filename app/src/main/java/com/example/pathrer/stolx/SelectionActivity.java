package com.example.pathrer.stolx;

import com.github.clans.fab.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectionActivity extends AppCompatActivity {
    FloatingActionButton fab1;
    FloatingActionButton fab2;
    FloatingActionButton fab3;
    FloatingActionButton fab4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        final SelectFragment fragment = new SelectFragment();
        final android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment,"fragment");
        fragmentTransaction.commit();


        fab1 = (FloatingActionButton) findViewById(R.id.fabBook);
        fab2 = (FloatingActionButton) findViewById(R.id.fabXerox);
        fab3 = (FloatingActionButton) findViewById(R.id.fabInstruments);
        fab4 = (FloatingActionButton) findViewById(R.id.fabOthers);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Bundle bundle = new Bundle();
                bundle.putString("edttext", "Book");
                SellFragment fragobj = new SellFragment();
                fragobj.setArguments(bundle);
*/


                SellFragment sellFragment = new SellFragment();
                FragmentTransaction fragmentTransaction1= getSupportFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.frame,sellFragment,"fragment");
                fragmentTransaction1.commit();

            }
        });
    }
}
