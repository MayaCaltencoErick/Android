package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mat1_1, mat1_2, mat1_3, mat1_4, mat2_1, mat2_2, mat2_3, mat2_4, mat3_1, mat3_2, mat3_3, mat3_4;
    private TextView res1, res2, res3, final1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        mat1_1 = (EditText)findViewById(R.id.txt_mat1_1);
        mat1_2 = (EditText)findViewById(R.id.txt_mat1_2);
        mat1_3 = (EditText)findViewById(R.id.txt_mat1_3);
        mat1_4 = (EditText)findViewById(R.id.txt_mat1_4);
        mat2_1 = (EditText)findViewById(R.id.txt_mat2_1);
        mat2_2 = (EditText)findViewById(R.id.txt_mat2_2);
        mat2_3 = (EditText)findViewById(R.id.txt_mat2_3);
        mat2_4 = (EditText)findViewById(R.id.txt_mat2_4);
        mat3_1 = (EditText)findViewById(R.id.txt_mat3_1);
        mat3_2 = (EditText)findViewById(R.id.txt_mat3_2);
        mat3_3 = (EditText)findViewById(R.id.txt_mat3_3);
        mat3_4 = (EditText)findViewById(R.id.txt_mat3_4);
        res1 = (TextView) findViewById(R.id.resultado1);
        res2 = (TextView) findViewById(R.id.resultado2);
        res3 = (TextView) findViewById(R.id.resultado3);
        final1 = (TextView) findViewById(R.id.final1);}
    public void promedio(View v ){
        String materia1_1=mat1_1.getText().toString();
        String materia1_2=mat1_2.getText().toString();
        String materia1_3=mat1_3.getText().toString();
        String materia1_4=mat1_4.getText().toString();
        double mate1_1 = Double.parseDouble(materia1_1);
        double mate1_2 = Double.parseDouble(materia1_2);
        double mate1_3 = Double.parseDouble(materia1_3);
        double mate1_4 = Double.parseDouble(materia1_4);
        String result1 = String.valueOf((mate1_1+mate1_2+mate1_3+mate1_4)/4);
        res1.setText(result1);

        String materia2_1=mat2_1.getText().toString();
        String materia2_2=mat2_2.getText().toString();
        String materia2_3=mat2_3.getText().toString();
        String materia2_4=mat2_4.getText().toString();
        double mate2_1 = Double.parseDouble(materia2_1);
        double mate2_2 = Double.parseDouble(materia2_2);
        double mate2_3 = Double.parseDouble(materia2_3);
        double mate2_4 = Double.parseDouble(materia2_4);
        String result2 = String.valueOf((mate2_1+mate2_2+mate2_3+mate2_4)/4);
        res2.setText(result2);

        String materia3_1=mat3_1.getText().toString();
        String materia3_2=mat3_2.getText().toString();
        String materia3_3=mat3_3.getText().toString();
        String materia3_4=mat3_4.getText().toString();
        double mate3_1 = Double.parseDouble(materia3_1);
        double mate3_2 = Double.parseDouble(materia3_2);
        double mate3_3 = Double.parseDouble(materia3_3);
        double mate3_4 = Double.parseDouble(materia3_4);
        String result3 = String.valueOf((mate3_1+mate3_2+mate3_3+mate3_4)/4);
        res3.setText(result3);

        Double promedio1 = Double.parseDouble(result1);
        Double promedio2 = Double.parseDouble(result2);
        Double promedio3 = Double.parseDouble(result3);
        String final1_1 = String.valueOf((promedio1 + promedio2 + promedio3)/3);
        final1.setText(final1_1);
    }

}