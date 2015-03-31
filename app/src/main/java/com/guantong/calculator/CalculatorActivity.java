package com.guantong.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class CalculatorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
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

    public void add(View view){
        // Grab the reference to EditText fields on the layout
        EditText i1 = (EditText) findViewById(R.id.number1);
        EditText i2 = (EditText) findViewById(R.id.number2);
        // Then we grab the input values
        int in1 = Integer.valueOf(i1.getText().toString());
        int in2 = Integer.valueOf(i2.getText().toString());
        // Create the person object to hold these values
        int r = in1 + in2;
        EditText res = (EditText) findViewById(R.id.result);
        String rString = Integer.toString(r);
        res.setText(rString);
    }

    public void minus(View view){
        // Grab the reference to EditText fields on the layout
        EditText i1 = (EditText) findViewById(R.id.number1);
        EditText i2 = (EditText) findViewById(R.id.number2);
        // Then we grab the input values
        int in1 = Integer.valueOf(i1.getText().toString());
        int in2 = Integer.valueOf(i2.getText().toString());
        // Create the person object to hold these values
        int r = in1 - in2;
        EditText res = (EditText) findViewById(R.id.result);
        String rString = Integer.toString(r);
        res.setText(rString);
    }

    public void multiply(View view){
        // Grab the reference to EditText fields on the layout
        EditText i1 = (EditText) findViewById(R.id.number1);
        EditText i2 = (EditText) findViewById(R.id.number2);
        // Then we grab the input values
        int in1 = Integer.valueOf(i1.getText().toString());
        int in2 = Integer.valueOf(i2.getText().toString());
        // Create the person object to hold these values
        int r = in1 * in2;
        EditText res = (EditText) findViewById(R.id.result);
        String rString = Integer.toString(r);
        res.setText(rString);
    }

    public void divide(View view){
        // Grab the reference to EditText fields on the layout
        EditText i1 = (EditText) findViewById(R.id.number1);
        EditText i2 = (EditText) findViewById(R.id.number2);
        // Then we grab the input values
        int in1 = Integer.valueOf(i1.getText().toString());
        int in2 = Integer.valueOf(i2.getText().toString());
        // Create the person object to hold these values
        double r = in1 / in2;
        EditText res = (EditText) findViewById(R.id.result);
        String rString = Double.toString(r);
        res.setText(rString);
    }
}
