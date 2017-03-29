package com.dotplays.a5pet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by MAC2015 on 3/30/17.
 */

public class ActivityResetPassword extends MActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        findViewById(R.id.btn_reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showToast(getString(R.string.notify_reset_password));
                finish();

            }
        });
    }
}
