package com.dextershield.plugins.navigation_bar;

import android.app.Activity;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "NavigationBar")
public class NavigationBarPlugin extends Plugin {

    private NavigationBar implementation = new NavigationBar();
    private static final String TAG = "NavigationBarPlugin";

    @Override
    public void handleOnResume() {
        super.handleOnResume();
        boolean enabled = getConfig().getBoolean("enabled", false);
        String method = getConfig().getString("method", "IMMERSIVE");
        boolean compact = getConfig().getBoolean("compact", false);

        if (enabled) {
            if (compact) {
                _hideNavigationBarCompat(method);
            } else {
                _hideNavigationBar(method);
            }
        }

    }

    private boolean _hideNavigationBarCompat(String method) {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        try {
            NavigationBar.HideMethod _method = NavigationBar.HideMethod.valueOf(method.toUpperCase());
            activity.runOnUiThread(() -> {
                implementation.hideNavigationBarCompat(activity, _method);
            });
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }

    }

    @PluginMethod
    public void hideNavigationBarCompat(PluginCall call) {
        String methodString = call.getString("method", "IMMERSIVE");
        boolean res = _hideNavigationBarCompat(methodString);
        if (!res) {
            call.reject("Activity not available");
            return;
        }
        JSObject ret = new JSObject();
        ret.put("success", res);
        call.resolve(ret);
    }

    private boolean _hideNavigationBar(String method) {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        try {
            NavigationBar.HideMethod _method = NavigationBar.HideMethod.valueOf(method.toUpperCase());
            activity.runOnUiThread(() -> {
                implementation.hideNavigationBar(activity, _method);
            });
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }

    }

    @PluginMethod
    public void hideNavigationBar(PluginCall call) {
        String methodString = call.getString("method", "IMMERSIVE");
        boolean res = _hideNavigationBar(methodString);
        if (!res) {
            call.reject("Activity not available");
            return;
        }
        JSObject ret = new JSObject();
        ret.put("success", res);
        call.resolve(ret);
    }

    /**
     * Show navigation bar using AndroidX
     */
    @PluginMethod
    public void showNavigationBarCompat(PluginCall call) {
        Activity activity = getActivity();
        if (activity == null) {
            call.reject("Activity not available");
            return;
        }

        // Run on UI thread
        activity.runOnUiThread(() -> {
            implementation.showNavigationBarCompat(activity);

            JSObject ret = new JSObject();
            ret.put("success", true);
            call.resolve(ret);
        });
    }

    /**
     * Show navigation bar using direct Android API
     */
    @PluginMethod
    public void showNavigationBar(PluginCall call) {
        Activity activity = getActivity();
        if (activity == null) {
            call.reject("Activity not available");
            return;
        }

        // Run on UI thread
        activity.runOnUiThread(() -> {
            implementation.showNavigationBar(activity);

            JSObject ret = new JSObject();
            ret.put("success", true);
            call.resolve(ret);
        });
    }

}