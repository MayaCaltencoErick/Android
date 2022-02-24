package com.example.calculadora;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {
    private EditText mat1_5, mat1_6, mat1_7, mat1_8, mat2_5, mat2_6, mat2_7, mat2_8, mat3_5, mat3_6, mat3_7, mat3_8;
    private TextView res4, res5, res6, final2;
    public int promedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        final2 = (TextView) findViewById(R.id.final2);
        int promedio12 = getIntent().getIntExtra("Promedio", 0);
        mat1_5 = (EditText)findViewById(R.id.txt_mat1_5);
        mat1_6 = (EditText)findViewById(R.id.txt_mat1_6);
        mat1_7 = (EditText)findViewById(R.id.txt_mat1_7);
        mat1_8 = (EditText)findViewById(R.id.txt_mat1_8);
        mat2_5 = (EditText)findViewById(R.id.txt_mat2_5);
        mat2_6 = (EditText)findViewById(R.id.txt_mat2_6);
        mat2_7 = (EditText)findViewById(R.id.txt_mat2_7);
        mat2_8 = (EditText)findViewById(R.id.txt_mat2_8);
        mat3_5 = (EditText)findViewById(R.id.txt_mat3_5);
        mat3_6 = (EditText)findViewById(R.id.txt_mat3_6);
        mat3_7 = (EditText)findViewById(R.id.txt_mat3_7);
        mat3_8 = (EditText)findViewById(R.id.txt_mat3_8);
        res4 = (TextView) findViewById(R.id.resultado);
        res5 = (TextView) findViewById(R.id.resultado4);
        res6 = (TextView) findViewById(R.id.resultado5);
        final2 = (TextView) findViewById(R.id.final2);
    }

        public void promedio2(View v){
            int promedio12 = getIntent().getIntExtra("Promedio", 0);
            String materia1_5=mat1_5.getText().toString();
            String materia1_6=mat1_6.getText().toString();
            String materia1_7=mat1_7.getText().toString();
            String materia1_8=mat1_8.getText().toString();
            double mate1_5 = Double.parseDouble(materia1_5);
            double mate1_6 = Double.parseDouble(materia1_6);
            double mate1_7 = Double.parseDouble(materia1_7);
            double mate1_8 = Double.parseDouble(materia1_8);
            String result4 = String.valueOf(Math.round((mate1_8+mate1_5+mate1_6+mate1_7)/4));
            res4.setText(result4);

            String materia2_5=mat2_5.getText().toString();
            String materia2_6=mat2_6.getText().toString();
            String materia2_7=mat2_7.getText().toString();
            String materia2_8=mat2_8.getText().toString();
            double mate2_5 = Double.parseDouble(materia2_5);
            double mate2_6 = Double.parseDouble(materia2_6);
            double mate2_7 = Double.parseDouble(materia2_7);
            double mate2_8 = Double.parseDouble(materia2_8);
            String result5 = String.valueOf((Math.round(mate2_5+mate2_6+mate2_7+mate2_8)/4));
            res5.setText(result5);

            String materia3_5=mat3_5.getText().toString();
            String materia3_6=mat3_6.getText().toString();
            String materia3_7=mat3_7.getText().toString();
            String materia3_8=mat3_8.getText().toString();
            double mate3_1 = Double.parseDouble(materia3_5);
            double mate3_2 = Double.parseDouble(materia3_6);
            double mate3_3 = Double.parseDouble(materia3_7);
            double mate3_4 = Double.parseDouble(materia3_8);
            String result6 = String.valueOf(Math.round((mate3_1+mate3_2+mate3_3+mate3_4)/4));
            res6.setText(result6);

            Double promedio1 = Double.parseDouble(result4);
            Double promedio2 = Double.parseDouble(result5);
            Double promedio3 = Double.parseDouble(result6);
            String final1_1 = String.valueOf(Math.round((((promedio1 + promedio2 + promedio3)/3)+(promedio12))/2));
            final2.setText(final1_1);
            promedio = Integer.parseInt(final1_1);

        }

    public void anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }
}