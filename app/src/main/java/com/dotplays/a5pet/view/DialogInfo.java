package com.dotplays.a5pet.view;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.view.View;

import com.dotplays.a5pet.R;

/**
 * Created by MAC2015 on 3/29/17.
 */

public class DialogInfo extends Dialog {


    public DialogInfo(@NonNull Context context) {
        super(context);
        initView();
    }

    public DialogInfo(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        initView();
    }

    protected DialogInfo(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initView();
    }

    public void initView() {
        setContentView(R.layout.dialog_intro);
        findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }
}
