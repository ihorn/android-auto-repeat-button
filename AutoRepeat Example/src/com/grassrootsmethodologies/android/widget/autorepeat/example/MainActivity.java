package com.grassrootsmethodologies.android.widget.autorepeat.example;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mCountView = (TextView) this.findViewById(R.id.countView);
        updateCountView();
    }

    public void clickIncrease(View view) {
    	mCount++;
    	updateCountView();
    }
    
    public void clickDecrease(View view) {
    	mCount--;
    	updateCountView();
    }
    
    private int mCount;
    private TextView mCountView;

    private void updateCountView() {
    	mCountView.setText(Integer.toString(mCount));
    }
}
