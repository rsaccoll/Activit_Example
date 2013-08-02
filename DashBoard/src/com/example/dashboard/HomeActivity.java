package com.example.dashboard;

import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends DashBoardActivity 
{
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setHeader(getString(R.string.HomeActivityTitle), false, true);
    }
    
    public void onButtonClicker(View v)
    {
    	Intent intent;
    	
    	switch(v.getId())
    	{
    	case R.id.main_btn_eclair:
    		intent = new Intent(this, Activity_Eclair.class);
    		startActivity(intent);
    		break;
    		
    	case R.id.main_btn_froyo:
    		intent = new Intent(this, Activity_Froyo.class);
    		startActivity(intent);
    		break;
    		
    	case R.id.main_btn_gingerbread:
    		intent = new Intent(this, Activity_Gingerbread.class);
    		startActivity(intent);
    		break;
    		
    	case R.id.main_btn_honeycomb:
    		intent = new Intent(this, Activity_Honeycomb.class);
    		startActivity(intent);
    		break;
    	
    	case R.id.main_btn_ics:
    		intent = new Intent(this, Activity_ICS.class);
    		startActivity(intent);
    		break;
    		
    	case R.id.main_btn_jellybean:
    		intent = new Intent(this, Activity_JellyBean.class);
    		startActivity(intent);
    		break;
    	default:
    		break;
    	}
    }
}
