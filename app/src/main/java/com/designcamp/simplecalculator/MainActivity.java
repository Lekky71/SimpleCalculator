package com.designcamp.simplecalculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    Button divideButton, multiplyButton, deleteButton, button0, button1, button2, button3, button4, button5, button6,
    button7, button8, button9, dotButton, addButton, subtractButton, equalToButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        resultTextView = findViewById(R.id.caluclator_screen_text_view);

        divideButton = findViewById(R.id.divide_button);
        multiplyButton = findViewById(R.id.multiply_button);
        deleteButton = findViewById(R.id.delete_button);
        button0 = findViewById(R.id.button_zero);
        button1 = findViewById(R.id.button_one);
        button2 = findViewById(R.id.button_two);
        button3 = findViewById(R.id.button_three);
        button4 = findViewById(R.id.button_four);
        button5 = findViewById(R.id.button_five);
        button6 = findViewById(R.id.button_six);
        button7 = findViewById(R.id.button_seven);
        button8 = findViewById(R.id.button_eight);
        button9 = findViewById(R.id.button_nine);
        dotButton = findViewById(R.id.dot_button);
        addButton = findViewById(R.id.add_button);
        subtractButton = findViewById(R.id.subtract_button);
        equalToButton = findViewById(R.id.equals_button);
        setSupportActionBar(toolbar);

        button0.setOnClickListener(buttonClickListener);
        button1.setOnClickListener(buttonClickListener);
        button2.setOnClickListener(buttonClickListener);
        button3.setOnClickListener(buttonClickListener);
        button4.setOnClickListener(buttonClickListener);
        button5.setOnClickListener(buttonClickListener);
        button6.setOnClickListener(buttonClickListener);
        button7.setOnClickListener(buttonClickListener);
        button8.setOnClickListener(buttonClickListener);
        button9.setOnClickListener(buttonClickListener);
        dotButton.setOnClickListener(buttonClickListener);
        deleteButton.setOnClickListener(buttonClickListener);

        deleteButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultTextView.setText("");
                return true;
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
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addToScreen(String num){

        String result = resultTextView.getText().toString();
        int length = result.length();
        if(length < 20){
            resultTextView.setText(result+num);
        }
        else {
            Toast tobaToast = Toast.makeText(getApplicationContext(),
                    "Character limit is Twenty(20)", Toast.LENGTH_SHORT);
            tobaToast.show();

            Snackbar.make(button0, "Character limit is Twenty(20)", Snackbar.LENGTH_INDEFINITE).show();
        }
    }

    View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.equals(button0)){
                addToScreen("0");
            }
            else if (v.equals(button1)){
                addToScreen("1");
            }
            else if (v.equals(button2)){
                addToScreen("2");
            }
            else if (v.equals(button3)){
                addToScreen("3");
            }
            else if (v.equals(button4)){
                addToScreen("4");
            }
            else if (v.equals(button5)){
                addToScreen("5");
            }
            else if (v.equals(button6)){
                addToScreen("6");
            }
            else if (v.equals(button7)){
                addToScreen("7");
            }
            else if (v.equals(button8)){
                addToScreen("8");
            }
            else if (v.equals(button9)){
                addToScreen("9");
            }
            else if (v.equals(dotButton)){
                if(!resultTextView.getText().toString().contains(".")){
                addToScreen(".");
                }
            }
            else if(v.equals(deleteButton)){

                String result = resultTextView.getText().toString();
                if(result.length() >0) {
                    resultTextView.setText(result.substring(0, result.length() - 1));
                }
            }

        }
    };
}
