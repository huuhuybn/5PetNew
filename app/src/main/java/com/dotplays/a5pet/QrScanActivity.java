package com.dotplays.a5pet;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;
import android.widget.Toast;

import com.dlazaro66.qrcodereaderview.QRCodeReaderView;
import com.dotplays.a5pet.bluetooth.SetNameActivity;

/**
 * Created by MAC2015 on 3/14/17.
 */

public class QrScanActivity extends MActivity implements QRCodeReaderView.OnQRCodeReadListener {

    private static final int MY_PERMISSIONS_REQUEST_CAMERA = 911;
    private TextView resultTextView;
    private QRCodeReaderView mydecoderview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Here, thisActivity is the current activity
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.CAMERA)) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.CAMERA},
                        MY_PERMISSIONS_REQUEST_CAMERA);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        } else {
            initCamera();
        }

    }

    // Called when a QR is decoded
    // "text" : the text encoded in QR
    // "points" : points where QR control points are placed in View
    @Override
    public void onQRCodeRead(String text, PointF[] points) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        if (text != null) {
            mydecoderview.stopCamera();
            startActivity(new Intent(QrScanActivity.this, SetNameActivity.class));
            finish();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MY_PERMISSIONS_REQUEST_CAMERA) {
            if (resultCode == RESULT_OK) {
                initCamera();
            } else {
                Toast.makeText(getApplicationContext(), getString(R.string.notify_using_camera_error), Toast.LENGTH_SHORT).show();
                finish();
            }
        }

    }

    public void initCamera() {
        setContentView(R.layout.activity_qr);
        mydecoderview = (QRCodeReaderView) findViewById(R.id.qrdecoderview);
        mydecoderview.setOnQRCodeReadListener(this);

        // Use this function to enable/disable decoding
        mydecoderview.setQRDecodingEnabled(true);

        // Use this function to change the autofocus interval (default is 5 secs)
        mydecoderview.setAutofocusInterval(2000L);

        // Use this function to enable/disable Torch
        mydecoderview.setTorchEnabled(true);

        // Use this function to set front camera preview
        mydecoderview.setFrontCamera();

        // Use this function to set back camera preview
        mydecoderview.setBackCamera();
    }

    @Override
    public void onCompleted(Exception e, String result) {
        super.onCompleted(e, result);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mydecoderview != null)
            mydecoderview.startCamera();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mydecoderview != null)
            mydecoderview.stopCamera();
    }
}