package com.example.shoppingcart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Counters for each card
    private int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons and counters
        initializeCard(1);
        initializeCard(2);
        initializeCard(3);
        initializeCard(4);
        initializeCard(5);
        initializeCard(6);
        initializeCard(7);
        initializeCard(8);
        initializeCard(9);
    }

    private void initializeCard(int cardNumber) {
        Button btnMinus = findViewById(getResources().getIdentifier("btnMinus" + cardNumber, "id", getPackageName()));
        Button btnPlus = findViewById(getResources().getIdentifier("btnPlus" + cardNumber, "id", getPackageName()));
        TextView quantityCounter = findViewById(getResources().getIdentifier("quantityCounter" + cardNumber, "id", getPackageName()));

        btnMinus.setOnClickListener(v -> {
            if (getCounterValue(cardNumber) > 0) {
                setCounterValue(cardNumber, getCounterValue(cardNumber) - 1);
                updateCounterText(cardNumber, quantityCounter);
            }
        });

        btnPlus.setOnClickListener(v -> {
            setCounterValue(cardNumber, getCounterValue(cardNumber) + 1);
            updateCounterText(cardNumber, quantityCounter);
        });
    }

    private int getCounterValue(int cardNumber) {
        switch (cardNumber) {
            case 1: return count1;
            case 2: return count2;
            case 3: return count3;
            case 4: return count4;
            case 5: return count5;
            case 6: return count6;
            case 7: return count7;
            case 8: return count8;
            case 9: return count9;
            default: return 0;
        }
    }

    private void setCounterValue(int cardNumber, int value) {
        switch (cardNumber) {
            case 1: count1 = value; break;
            case 2: count2 = value; break;
            case 3: count3 = value; break;
            case 4: count4 = value; break;
            case 5: count5 = value; break;
            case 6: count6 = value; break;
            case 7: count7 = value; break;
            case 8: count8 = value; break;
            case 9: count9 = value; break;
        }
    }

    private void updateCounterText(int cardNumber, TextView counterTextView) {
        counterTextView.setText(getCounterValue(cardNumber) + " pcs");
    }
}
