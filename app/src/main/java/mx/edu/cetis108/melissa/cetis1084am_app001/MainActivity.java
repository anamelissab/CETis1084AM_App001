package mx.edu.cetis108.melissa.cetis1084am_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSaludar(View view)
    {
        EditText txtNombre=(EditText)findViewById(R.id.txtNombre);
        TextView lblSaludo=(TextView)findViewById(R.id.lblSaludo);
        lblSaludo.setText("Hola, "+txtNombre.getText().toString());
    }
}
