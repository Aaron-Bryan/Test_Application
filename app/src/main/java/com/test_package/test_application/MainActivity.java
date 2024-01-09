package com.test_package.test_application;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void test_button_func (View view){

        /*
        TextView test_txt = findViewById(R.id.test_txtview);
        EditText test_edit_text = findViewById(R.id.test_edit_text);
        String user_input = test_edit_text.getText().toString();

        test_txt.setText("U Gae " + user_input);
        */

        EditText test_name = findViewById(R.id.test_name);
        EditText test_surname = findViewById(R.id.test_surname);
        EditText test_email = findViewById(R.id.test_email);
        EditText test_password = findViewById(R.id.test_password);

        TextView test_output_name = findViewById(R.id.test_output_name);
        TextView test_output_surname = findViewById(R.id.test_output_surname);
        TextView test_output_email = findViewById(R.id.test_output_email);
        TextView test_output_password = findViewById(R.id.test_output_password);

        String user_input_name = test_name.getText().toString();
        String user_input_surname = test_surname.getText().toString();
        String user_input_email = test_email.getText().toString();
        String user_input_password = test_password.getText().toString();

        test_output_name.setText("First Name: " + user_input_name);
        test_output_surname.setText("Surname: " + user_input_surname);
        test_output_email.setText("Email: " + user_input_email);
        test_output_password.setText("Password: " + user_input_password);

    }

}