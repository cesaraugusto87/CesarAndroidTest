package cesaraugusto87.androidtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class PrincipalPage extends AppCompatActivity {
    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_page);
        email=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
    }

    public void showNextPage(View view){

    }
}
