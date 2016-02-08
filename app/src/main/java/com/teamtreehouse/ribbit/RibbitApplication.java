package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
        Parse.initialize(this, "xspjcXqJ7m0k2syNLOil9NiP3kYFvTSmPlxVWcqW", "rUk5Avggl2BZumchJZYQsKreHxAx8BaEUSAD58Sk");
	}
}
