package com.example.dashboard;

import android.os.Bundle;

public class Activity_Gingerbread extends DashBoardActivity 
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gingerbread);
		setHeader(getString(R.string.GingerbreadActivityTitle), true, true);
	}
}
