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

    /**
     * Hide navigation bar using AndroidX
     * 
     * @param call - Expects: { method: "IMMERSIVE" | "IMMERSIVE_STICKY" |
     *             "LEAN_BACK" }
     */
    @PluginMethod
    public void hideNavigationBarCompat(PluginCall call) {
        Activity activity = getActivity();
        if (activity == null) {
            call.reject("Activity not available");
            return;
        }

        String methodString = call.getString("method", "IMMERSIVE");
        NavigationBar.HideMethod method = NavigationBar.HideMethod.valueOf(methodString);

        // Run on UI thread
        activity.runOnUiThread(() -> {
            implementation.hideNavigationBarCompat(activity, method);

            JSObject ret = new JSObject();
            ret.put("success", true);
            call.resolve(ret);
        });
    }

    /**
     * Hide navigation bar using direct Android API
     * 
     * @param call - Expects: { method: "IMMERSIVE" | "IMMERSIVE_STICKY" |
     *             "LEAN_BACK" }
     */
    @PluginMethod
    public void hideNavigationBar(PluginCall call) {
        Activity activity = getActivity();
        if (activity == null) {
            call.reject("Activity not available");
            return;
        }

        String methodString = call.getString("method", "IMMERSIVE");
        NavigationBar.HideMethod method = NavigationBar.HideMethod.valueOf(methodString);

        // Run on UI thread
        activity.runOnUiThread(() -> {
            implementation.hideNavigationBar(activity, method);

            JSObject ret = new JSObject();
            ret.put("success", true);
            call.resolve(ret);
        });
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