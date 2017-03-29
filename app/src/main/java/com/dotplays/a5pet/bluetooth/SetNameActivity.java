package com.dotplays.a5pet.bluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.TextView;

import com.dotplays.a5pet.MActivity;
import com.dotplays.a5pet.R;
import com.dotplays.a5pet.view.Button5Pet;
import com.dotplays.a5pet.view.EditText5Pet;
import com.dotplays.a5pet.view.VerdanaText5Pet;

/**
 * Created by MAC2015 on 3/17/17.
 */

public class SetNameActivity extends MActivity {


    private EditText5Pet et_name;
    private Button5Pet btn_next;
    private VerdanaText5Pet tv_title;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_name);
        setBackButton();
        et_name = (EditText5Pet) findViewById(R.id.et_name);
        btn_next = (Button5Pet) findViewById(R.id.btn_next);
        tv_title = (VerdanaText5Pet) findViewById(R.id.tv_intro);

        et_name.setOnEditorActionListener(
                new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        // Identifier of the action. This will be either the identifier you supplied,
                        // or EditorInfo.IME_NULL if being called due to the enter key being pressed.
                        if (actionId == EditorInfo.IME_ACTION_NEXT
                                || actionId == EditorInfo.IME_ACTION_DONE
                                || event.getAction() == KeyEvent.ACTION_DOWN
                                && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                            btn_next.performClick();
                            return true;
                        }
                        // Return true if you have consumed the action, else false.
                        return false;
                    }
                });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_name.getText().toString().matches("")) {
                    et_name.setError("");
                    return;
                }
                et_name.setVisibility(View.GONE);
                tv_title.setText(getString(R.string.lets_pair));
                btn_next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getApplicationContext(), ActivityBluetooth.class));
                    }
                });
            }
        });
    }
}
