package com.example.seventhree.sendmessages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class FirstScreen extends AppCompatActivity {
    public final static String MSG1_EXTRA_PARAM = "com.example.seventhree.FirstMessageKey";
    public final static String MSG2_EXTRA_PARAM = "com.example.seventhree.SecondMessageKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondScreen.class);
        EditText sendFirstMsg = (EditText) findViewById(R.id.topMessageBox);
        EditText sendSecondMsg = (EditText) findViewById(R.id.bottomMessageBox);
        String FirstMessage=sendFirstMsg.getText().toString();
        String SecondMessage = sendSecondMsg.getText().toString();
        intent.putExtra(MSG1_EXTRA_PARAM, FirstMessage);
        intent.putExtra(MSG2_EXTRA_PARAM,SecondMessage);
        sendFirstMsg.setText("");
        sendSecondMsg.setText("");
        startActivity(intent);

    }

}
