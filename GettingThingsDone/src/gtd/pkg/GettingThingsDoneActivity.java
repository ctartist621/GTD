package gtd.pkg;

import gui.pkg.FolderEditActivity;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class GettingThingsDoneActivity extends Activity {
    /** Called when the activity is first created. */
    //running test
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_folder);
        Intent one = new Intent();
        one.setClass(GettingThingsDoneActivity.this, FolderEditActivity.class);
        startActivity(one);
    }
}