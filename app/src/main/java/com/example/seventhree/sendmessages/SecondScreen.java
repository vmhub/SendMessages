package com.example.seventhree.sendmessages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Intent intent = getIntent();
        String firstMessage = intent.getStringExtra(FirstScreen.MSG1_EXTRA_PARAM);
        String secondMessage = intent.getStringExtra(FirstScreen.MSG2_EXTRA_PARAM);
        TextView firstMsgReceived = (TextView) findViewById(R.id.firstMsgReceived);
        TextView secondMsgReceived = (TextView) findViewById(R.id.secondMsgReceived);

        if(firstMessage.isEmpty())
            firstMsgReceived.setText("NULL");
        else firstMsgReceived.setText(firstMessage);
        if(secondMessage.isEmpty())
        secondMsgReceived.setText("NULL");
        else secondMsgReceived.setText(secondMessage);

    }
    public void moveback(View view){
        Intent intent = new Intent(this, FirstScreen.class);
        startActivity(intent);
    }


}
