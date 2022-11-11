package com.example.pr6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


builder.setItems(items, new DialogInterface.OnClickListtener) {
    @Override

    public void onClick(DialogInterface dialog, int which){
        switch (item) {
            case 0:
                constraintLayout.setBackgroundResource(R.color.redColor);
                break;
            case 1:
                constraintLayout.setBackgroundResource(R.color.greenColor);
                break;
            case 2:
                constraintLayout.setBackgroundResource(R.color.yellowColor);
                break;
        }
        }
}
