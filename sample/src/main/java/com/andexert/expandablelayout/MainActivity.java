package com.andexert.expandablelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

import com.andexert.expandablelayout.library.ExpandableLayout;
import com.andexert.expandablelayout.library.ExpandableLayoutListView;


public class MainActivity extends Activity {

    private final String[] array = {"Hello", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.view_row, R.id.header_text, array);
        final ExpandableLayoutListView expandableLayoutListView = (ExpandableLayoutListView) findViewById(R.id.listview);
        final ExpandableLayout expandableLayout;

//        expandableLayout.setOnStartHidingListener(new ExpandableLayout.OnStartHidingListener() {
//            @Override
//            public void onHidingowing(ExpandableLayout layout) {
//
//            }
//        });
//
//        expandableLayout.setOnStartShowingListener(new ExpandableLayout.OnStartShowingListener() {
//            @Override
//            public void onStartShowing(ExpandableLayout layout) {
//
//            }
//        });
//
//        expandableLayout.setOnFinishHidingListener(new ExpandableLayout.OnFinishHidingListener() {
//            @Override
//            public void onFinishHiding(ExpandableLayout layout) {
//
//            }
//        });
//
//        expandableLayout.setOnFinishShowingListener(new ExpandableLayout.OnFinishShowingListener() {
//            @Override
//            public void onFinishShowing(ExpandableLayout layout) {
//
//            }
//        });

        expandableLayoutListView.setAdapter(arrayAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
