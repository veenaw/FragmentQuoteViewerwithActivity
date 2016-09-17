package com.example.android.fragmentquoteviewerwithactivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

public class QuoteListActivity extends ListActivity {
final String TAG = "Quote";
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Get the Intent that started this Activity
		Intent intent = getIntent();
		
		// Retrieve the Extra stored under the name TitlesListActivity.INDEX
		String quote = intent.getStringExtra(TitlesListActivity.INDEX);
		Log.d(TAG, quote);
		
		if (null != quote) {
			
			// Set the list adapter for the ListView 
			// Discussed in more detail in the user interface classes lesson  
			setListAdapter(new ArrayAdapter<String>(QuoteListActivity.this,
					R.layout.list_text_item_layout, new String[] { quote }));
		}
	}
}