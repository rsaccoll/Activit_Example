package com.example.dashboard;

import android.os.Bundle;

public class FeedbackActivity extends DashBoardActivity 
{
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback);
		setHeader(getString(R.string.FeedbackActivityTitle), true, false);
	}
}
