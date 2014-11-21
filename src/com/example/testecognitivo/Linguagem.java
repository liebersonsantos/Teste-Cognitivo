package com.example.testecognitivo;

import android.app.Activity;

public class Linguagem extends Activity{
	
	
	@Override
	protected void onChildTitleChanged(Activity childActivity,
			CharSequence title) {
		// TODO Auto-generated method stub
		super.onChildTitleChanged(childActivity, title);
		
		setContentView(R.layout.linguagem);
		
	}

}
