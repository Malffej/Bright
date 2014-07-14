package com.malffej.bright;

import android.app.Application;

import com.parse.Parse;

public class BrightApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "f61kFvYsTFkseItDIiEEL1UdylcixU3KxonrBsaN",
				"OBi3SbTbr72POKZAAErIGKThQLINaoKN5KmWQRbe");
	}
}
