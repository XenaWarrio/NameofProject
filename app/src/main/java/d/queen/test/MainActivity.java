package d.queen.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

public void OnButtonClick (View v){
    EditText element1 = (EditText)findViewById(R.id.num1);
    EditText element2 = (EditText)findViewById(R.id.num1);
    TextView result = (TextView)findViewById(R.id.Result);

    int num1 = Integer.parseInt(element1.getText().toString());
    int num2 = Integer.parseInt(element2.getText().toString());
    int res = num1 + num2;

    result.setText(Integer.toString(res));
}

}
