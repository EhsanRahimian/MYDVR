package com.nicootech.mydvr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RecordActivity extends AppCompatActivity {
    Button button;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        button = (Button)findViewById(R.id.button);
        message = (TextView)findViewById(R.id.message);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ButtonText = button.getText().toString();
                if(ButtonText.equals("Record")){
                    button.setText("Cancel");
                    message.setText("The scheduled recording is accsepted");

                }else{

                    button.setText("Record");
                    message.setText("Cancel recording is accsepted");


                }
            }
        });
    }
}
