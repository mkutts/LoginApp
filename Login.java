package kuttnerinc.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends ActionBarActivity implements View.OnClickListener {

    Button LoginBtn;
    EditText EditUserName;
    EditText EditPassword;
    TextView TVRegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditUserName = (EditText) findViewById(R.id.EditUserName);
        EditPassword = (EditText) findViewById(R.id.EditPassword);
        TVRegisterLink = (TextView) findViewById(R.id.TVRegisterLink);
        LoginBtn = (Button) findViewById(R.id.LoginBtn);

        LoginBtn.setOnClickListener(this);
        TVRegisterLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.TVRegisterLink:

                startActivity(new Intent(this, Register.class));

                break;
        }
    }
}
