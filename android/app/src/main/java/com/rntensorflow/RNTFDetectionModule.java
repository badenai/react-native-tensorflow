package com.rntensorflow;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
import java.util.HashMap;

import com.rntensorflow.DetectorActivity;

public class RNTFDetectionModule extends ReactContextBaseJavaModule {

    public RNTFDetectionModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    void navigateToExample() {
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, DetectorActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public String getName() {
        return "ObjectDetection";
    }
}

