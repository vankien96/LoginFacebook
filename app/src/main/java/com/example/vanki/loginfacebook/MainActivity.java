package com.example.vanki.loginfacebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();

        String textSignUp = (String) txtSignUp.getText();
        SpannableString content = new SpannableString(textSignUp);
        content.setSpan(new UnderlineSpan(), 0, textSignUp.length(), 0);
        txtSignUp.setText(content);
    }

    private void addEvents() {

    }

    private void addControls() {
        txtSignUp = findViewById(R.id.txt_sign_up);
    }
}
