package kuttnerinc.loginregister;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends ActionBarActivity implements View.OnClickListener {

    Button RegisterBtn;
    EditText EditName;
    EditText EditAge;
    EditText EditUserName;
    EditText EditPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditName = (EditText) findViewById(R.id.EditName);
        EditAge = (EditText) findViewById(R.id.EditAge);
        EditUserName = (EditText) findViewById(R.id.EditUserName);
        EditPassword = (EditText) findViewById(R.id.EditPassword);
        RegisterBtn = (Button) findViewById(R.id.RegisterBtn);
        RegisterBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.RegisterBtn:
                break;
        }
    }
}
