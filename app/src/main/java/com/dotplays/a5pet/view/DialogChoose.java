package com.dotplays.a5pet.view;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.view.View;

import com.dotplays.a5pet.R;

/**
 * Created by MAC2015 on 3/14/17.
 */


public class DialogChoose extends Dialog {
    public void initView() {
        setContentView(R.layout.dialog_choose);
        findViewById(R.id.btn_bluetooh_scan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBluetoothClick.onClick();
                dismiss();
            }
        });
        findViewById(R.id.btn_qrcode_scan).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onCameraClick.onClick();
                        dismiss();
                    }
                });
    }

    public interface OnBluetoothClick {
        void onClick();
    }

    public interface OnCameraClick {
        void onClick();
    }

    public OnBluetoothClick onBluetoothClick;
    public OnCameraClick onCameraClick;

    public void setOnBluetoothClick(OnBluetoothClick onBluetoothClick) {
        this.onBluetoothClick = onBluetoothClick;
    }

    public void setOnCameraClick(OnCameraClick onCameraClick) {
        this.onCameraClick = onCameraClick;
    }

    public DialogChoose(@NonNull Context context) {
        super(context);
        initView();
    }

    public DialogChoose(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        initView();
    }

    protected DialogChoose(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initView();
    }
}
