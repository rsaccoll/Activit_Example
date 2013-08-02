package com.example.dashboard;

import android.os.Bundle;

public class Activity_Honeycomb extends DashBoardActivity 
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_honeycomb);
		setHeader(getString(R.string.HoneycombActivityTitle), true, true);
	}
}
