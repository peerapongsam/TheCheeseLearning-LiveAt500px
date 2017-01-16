package me.peerapong.liveat500px.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import me.peerapong.liveat500px.R;
import me.peerapong.liveat500px.dao.PhotoItemDao;
import me.peerapong.liveat500px.fragment.MoreInfoFragment;

public class MoreInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);
        initInstances();

        PhotoItemDao dao = getIntent().getParcelableExtra("dao");

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MoreInfoFragment.newInstance(dao), "MoreInfoFragment")
                    .commit();
        }
    }

    private void initInstances() {
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_more_info, menu);
        return true;
    }
}
