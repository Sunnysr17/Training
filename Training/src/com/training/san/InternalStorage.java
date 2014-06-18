package com.training.san;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class InternalStorage extends Activity implements OnClickListener {

	Button save;
	EditText filename, entry;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.internal);
		// initialize();
	}

	// private void initialize() {
	// save = (Button) findViewById(R.id.button1);
	// filename = (EditText) findViewById(R.id.editText1);
	// entry = (EditText) findViewById(R.id.editText2);
	// save.setOnClickListener(this);
	// }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
