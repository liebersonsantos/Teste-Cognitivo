package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Linguagem3 extends Activity{
	

	@Override
	protected void onChildTitleChanged(Activity childActivity,
			CharSequence title) {
		// TODO Auto-generated method stub
		super.onChildTitleChanged(childActivity, title);
		
		//inflar layout de linguagem 3
		setContentView(R.layout.linguagem);

	}

}
