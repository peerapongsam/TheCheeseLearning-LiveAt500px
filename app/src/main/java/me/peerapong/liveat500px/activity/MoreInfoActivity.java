package me.peerapong.liveat500px.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.peerapong.liveat500px.R;
import me.peerapong.liveat500px.fragment.MoreInfoFragment;

public class MoreInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);
        initInstances();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MoreInfoFragment.newInstance(), "MoreInfoFragment")
                    .commit();
        }
    }

    private void initInstances() {

    }
}
