package kuttnerinc.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginRegister extends ActionBarActivity implements View.OnClickListener {

    Button LogOutBtn;
    EditText EditName;
    EditText EditAge;
    EditText EditUserName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditName = (EditText) findViewById(R.id.EditName);
        EditAge = (EditText) findViewById(R.id.EditAge);
        EditUserName = (EditText) findViewById(R.id.EditUserName);
        LogOutBtn = (Button) findViewById(R.id.LogOutBtn);

        LogOutBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.LogOutBtn:

                startActivity(new Intent(this, Login.class));

                break;

        }
    }
}

