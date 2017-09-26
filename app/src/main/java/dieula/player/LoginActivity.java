package dieula.player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static dieula.player.R.id.tvRegister;

public class LoginActivity extends AppCompatActivity {


    EditText edText;
    EditText edText1;
    Button but;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edText = (EditText) findViewById(R.id.etIdentif);
        edText1 = (EditText) findViewById(R.id.etPass);
        but = (Button) findViewById(R.id.btnSignUp);
        text = (TextView) findViewById(tvRegister);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }
    public void onLogButton(View v) {
        Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(i);
    }
}
