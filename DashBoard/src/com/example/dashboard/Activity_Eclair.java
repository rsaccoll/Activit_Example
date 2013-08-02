package com.example.dashboard;

import android.os.Bundle;

public class Activity_Eclair extends DashBoardActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclair);
        setHeader(getString(R.string.EclairActivityTitle), true, true);
    }
}
