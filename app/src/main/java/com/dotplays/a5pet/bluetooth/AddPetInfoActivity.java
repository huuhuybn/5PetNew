package com.dotplays.a5pet.bluetooth;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;

import com.dotplays.a5pet.MActivity;
import com.dotplays.a5pet.R;

/**
 * Created by MAC2015 on 3/17/17.
 */

public class AddPetInfoActivity extends MActivity {

    private Button btn_next;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pet);
        btn_next = (Button) findViewById(R.id.btn_next);
    }

}
