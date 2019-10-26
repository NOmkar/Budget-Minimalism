package com.example.budget_minimalism;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button2; //this is the main menu "Expense" button object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Mitchell Wrote this function
        button2 = (Button) findViewById(R.id.button2); // Main menu sends to expense page
        button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity_expense_inputscreen();
                }
            });
        }

/**
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener2(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Settings page --- Activate!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
**/
    // Mitchell wrote this function
    public void openActivity_expense_inputscreen() {
        Intent intent = new Intent(this, expense_inputscreen.class);
        startActivity(intent);
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
