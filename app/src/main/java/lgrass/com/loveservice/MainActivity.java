package lgrass.com.loveservice;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import lgrass.com.lgrassservice.NotchScreenService;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.info_textView);
        InitCheckButton();
    }

    void  InitCheckButton()
    {
        Button checkButton = (Button)findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isNotchScreen = NotchScreenService.hasNotchScreen(MainActivity.this);
                if (isNotchScreen){
                    textView.setText("是的");
                }else {
                    textView.setText("不是");
                }
            }
        });
    }
}
