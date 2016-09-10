package com.geniusgithub.lookaround.detailcontent;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;

import com.geniusgithub.lookaround.R;
import com.geniusgithub.lookaround.base.BaseActivity;

public class PictureBrowerActivity extends BaseActivity {

    private final String TAG_FRAGMENT = "ContentFragment";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_activity_layout);
        getFragmentManager().beginTransaction().add(R.id.content_container, newContentFragment(), TAG_FRAGMENT).commit();
    }


    public Fragment newContentFragment() {
        return new PictureBrowseFragment();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
