package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    int kwota=0;
    public void policz(View view) {

        boolean checked= ((CheckBox) view).isChecked();
        int id=view.getId();

        if(id== R.id.dostawa){
            if(checked){
                kwota=kwota+10;
            } else  {
                kwota=kwota-10;
            }
        }

        if(id== R.id.platnosc){
            if(checked){
                kwota=kwota+5;
            } else  {
                kwota=kwota-5;
            }
        }

        if(id== R.id.opakowanie){
            if(checked){
                kwota=kwota+15;
            } else  {
                kwota=kwota-15;
            }
        }

        TextView tekst= findViewById(R.id.tekst2);
        tekst.setText("Do zapłaty dodatkowo "+ kwota+ " zł");

    }
}