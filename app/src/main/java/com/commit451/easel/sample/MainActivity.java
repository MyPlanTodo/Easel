package com.commit451.easel.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;

import com.commit451.easel.Easel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.editText);
        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.switchCompat);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        Easel.setTint(editText, Color.MAGENTA);
        Easel.setTint(radioButton, Color.MAGENTA);
        Easel.setTint(checkBox, Color.MAGENTA);
        Easel.setTint(switchCompat, Color.MAGENTA);
        Easel.setTint(progressBar, Color.MAGENTA);
        Easel.setTint(seekBar, Color.MAGENTA);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Easel.setTint(menu, Color.MAGENTA);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_share:

                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
