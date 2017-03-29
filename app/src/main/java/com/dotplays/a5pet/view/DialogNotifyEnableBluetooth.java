package com.dotplays.a5pet.view;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.view.View;

import com.dotplays.a5pet.R;

/**
 * Created by MAC2015 on 3/17/17.
 */

public class DialogNotifyEnableBluetooth extends Dialog {

    public DialogNotifyEnableBluetooth(@NonNull Context context) {
        super(context);
        initView();
    }

    public DialogNotifyEnableBluetooth(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        initView();
    }

    protected DialogNotifyEnableBluetooth(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initView();
    }

    private Button5Pet btn_ok, btn_cancel;


    public interface OnOkClick {
        void onClick();
    }

    public void setOnOkClick(OnOkClick onOkClick) {
        this.onOkClick = onOkClick;
    }

    public OnOkClick onOkClick;


    public void initView() {
        setContentView(R.layout.dialog_notify_bluetooth);
        btn_ok = (Button5Pet) findViewById(R.id.btn_ok);
        btn_cancel = (Button5Pet) findViewById(R.id.btn_cancel);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onOkClick != null) onOkClick.onClick();
                dismiss();
            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });


    }
}
