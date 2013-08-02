package com.example.dashboard;

import android.os.Bundle;

public class Activity_Froyo  extends DashBoardActivity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_froyo);
		setHeader(getString(R.string.FroyoActivityTitle), true, true);
	}
}
