package com.reactnativewallpapermanager;


import android.app.WallpaperManager;
import android.os.Build;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class WallpaperManagerModule extends ReactContextBaseJavaModule {
  final WallpaperManager wallpaperManager;
  public static final String NAME = "WallpaperManager";
  private static final String INVALID_SOURCE = "INVALID SOURCE";

  public WallpaperManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    wallpaperManager = WallpaperManager.getInstance(reactContext);

  }

    @Override
    public String getName() {
        return NAME;
    }


    @ReactMethod
    public void setWallpaper(String url, int type, Promise promise) {
        InputStream inputStream = null;
        try {
            inputStream = new URL(url).openStream();
        } catch (Exception e) {
            promise.reject(INVALID_SOURCE, e.getMessage());
        }

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                wallpaperManager.setStream(inputStream, null, true, type);
            } else {
                wallpaperManager.setStream(inputStream);
            }
            promise.resolve(url);
        } catch (Exception e) {
            promise.reject("Set Wallpaper Error", e.getMessage());
        }
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("FLAG_LOCK", 2);
        constants.put("FLAG_SYSTEM", 1);
        return constants;
    }
}
