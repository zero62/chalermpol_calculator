package gissoft.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorListener{

    EditText firstOperandEditText;
    EditText secondOperandEditText;
    TextView resultTextView;
    MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstOperandEditText = (EditText) findViewById(R.id.operand_one_edit_text);
        secondOperandEditText = (EditText) findViewById(R.id.operand_two_edit_text);
        resultTextView = (TextView) findViewById(R.id.operation_result_text_view);

        mainController = new MainController();
        mainController.setListener(this);
    }

    public void onAdd(View view)
    {
        double first = Double.parseDouble(firstOperandEditText.getText().toString());
        double second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.add(first, second);
    }


    public void onSub(View view) {
        double first = Double.parseDouble(firstOperandEditText.getText().toString());
        double second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.sub(first, second);
    }

    public void onDiv(View view) {
        double first = Double.parseDouble(firstOperandEditText.getText().toString());
        double second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.div(first, second);
    }

    public void onMul(View view) {
        double first = Double.parseDouble(firstOperandEditText.getText().toString());
        double second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.mul(first, second);
    }

    @Override
    public void onSuccess(String result) {
        resultTextView.setText(String.valueOf(result));
    }
}