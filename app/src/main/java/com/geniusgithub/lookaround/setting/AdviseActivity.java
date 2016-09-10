package com.geniusgithub.lookaround.setting;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.geniusgithub.lookaround.R;
import com.geniusgithub.lookaround.base.ToolbarFragmentActivity;

public class AdviseActivity extends ToolbarFragmentActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        updateToolTitle(getString(R.string.advise));
    }


    @Override
    public Fragment newContentFragment() {
        return new AdviseFragment();
    }
}
