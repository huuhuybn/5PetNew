package com.dotplays.a5pet.view;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;

import com.dotplays.a5pet.R;

/**
 * Created by MAC2015 on 3/14/17.
 */

public class DialogReportLost extends Dialog {

    public void initView() {
        setContentView(R.layout.dialog_report_lost);

    }

    public DialogReportLost(@NonNull Context context) {
        super(context);
        initView();
    }

    public DialogReportLost(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        initView();
    }

    protected DialogReportLost(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initView();
    }
}
