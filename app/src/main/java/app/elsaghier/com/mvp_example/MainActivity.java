package app.elsaghier.com.mvp_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText email, pass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email_tv);
        pass = findViewById(R.id.pass_tv);
        login = findViewById(R.id.login_btn);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_btn) {
            String emailText = email.getText().toString();
            String passText = pass.getText().toString();

        }
    }
}
