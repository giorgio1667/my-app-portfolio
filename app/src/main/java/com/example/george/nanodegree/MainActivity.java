package com.example.george.nanodegree;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.View;
import android.content.Context;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void makeToast(String s) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, s, duration);
        toast.show();
    }

    public void sendMessage(View view) {

        String output = "This will launch the ";
        switch(view.getId())
        {
            case R.id.button_spotify:
                output += "Spotify App!";
                break;
            case R.id.button_scores:
                output += "Scores App!";
                break;
            case R.id.button_library:
                output += "Library App!";
                break;
            case R.id.button_buildBigger:
                output += "Build It Bigger App!";
                break;
            case R.id.button_xyzReader:
                output += "XYZ Reader App!";
                break;
            case R.id.button_capstone:
                output += "App That I Made!";
                break;
        }

        makeToast(output);
    }
}
