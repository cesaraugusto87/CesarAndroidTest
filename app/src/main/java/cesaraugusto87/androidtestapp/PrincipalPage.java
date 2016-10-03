package cesaraugusto87.androidtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class PrincipalPage extends AppCompatActivity {
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_page);
        email=(EditText)findViewById(R.id.username);
        
    }

    private void showNextPage(){
    }
}
