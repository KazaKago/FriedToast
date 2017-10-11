package com.kazakago.friedtoast.samplejava;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kazakago.friedtoast.FriedToast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showToastButton = findViewById(R.id.showToastButton);
        showToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFriedToast();
            }
        });
    }

    private void showFriedToast() {
        FriedToast.Companion.create(this)
                .setTitle("Title!")
                .setDescription("Description!!")
                .setIconImageResource(R.drawable.ic_done_white_80dp)
                .show();
    }

}
