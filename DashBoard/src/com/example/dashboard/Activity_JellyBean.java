package com.example.dashboard;

import android.os.Bundle;

public class Activity_JellyBean extends DashBoardActivity 
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jellybean);
		setHeader(getString(R.string.JellyBeanActivityTitle), true, true);
	}
}
