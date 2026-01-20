package com.dextershield.plugins.navigation_bar;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.getcapacitor.Logger;

public class NavigationBar {

    private static final String TAG = "NavigationBar";

    public enum HideMethod {
        IMMERSIVE, // BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        IMMERSIVE_STICKY, // BEHAVIOR_SHOW_BARS_BY_SWIPE
        LEAN_BACK, // BEHAVIOR_SHOW_BARS_BY_TOUCH
    }

    /**
     * Hide navigation bar using the specified method
     * 
     * @param activity The current activity
     * @param method   The hide method to use
     */
    public void hideNavigationBar(Activity activity, HideMethod method) {

        Window window = activity.getWindow();
        View decorView = window.getDecorView();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            WindowInsetsController controller = window.getInsetsController();
            controller.hide(WindowInsets.Type.navigationBars());
            if (controller != null) {
                switch (method) {
                    case IMMERSIVE_STICKY:
                        controller.setSystemBarsBehavior(
                                WindowInsetsController.BEHAVIOR_SHOW_BARS_BY_SWIPE);
                        break;
                    case LEAN_BACK:
                        controller.setSystemBarsBehavior(
                                WindowInsetsController.BEHAVIOR_SHOW_BARS_BY_TOUCH);
                        break;
                    case IMMERSIVE:
                    default:
                        controller.setSystemBarsBehavior(
                                WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
                        break;
                }

            }
        }
    }

    /**
     * Hide navigation bar using AndroidX WindowCompat (alternative approach)
     * 
     * @param activity The current activity
     * @param method   The hide method to use
     */
    public void hideNavigationBarCompat(Activity activity, HideMethod method) {

        Window window = activity.getWindow();
        WindowCompat.setDecorFitsSystemWindows(window, false);

        WindowInsetsControllerCompat controller = WindowCompat.getInsetsController(window, window.getDecorView());

        if (controller != null) {
            controller.hide(WindowInsetsCompat.Type.navigationBars());

            switch (method) {
                case IMMERSIVE_STICKY:
                    controller.setSystemBarsBehavior(
                            WindowInsetsControllerCompat.BEHAVIOR_SHOW_BARS_BY_SWIPE);
                    break;
                case LEAN_BACK:
                    controller.setSystemBarsBehavior(
                            WindowInsetsControllerCompat.BEHAVIOR_SHOW_BARS_BY_TOUCH);
                    break;
                case IMMERSIVE:
                default:
                    controller.setSystemBarsBehavior(
                            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
                    break;
            }
        }

    }

    /**
     * Show navigation bar
     * 
     * @param activity The current activity
     */
    public void showNavigationBar(Activity activity) {

        Window window = activity.getWindow();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            // Android 11+
            WindowInsetsController controller = window.getInsetsController();
            if (controller != null) {
                controller.show(WindowInsets.Type.navigationBars());
            }
        }

    }

    /**
     * Show navigation bar using AndroidX (alternative approach)
     * 
     * @param activity The current activity
     */
    public void showNavigationBarCompat(Activity activity) {

        Window window = activity.getWindow();
        WindowInsetsControllerCompat controller = WindowCompat.getInsetsController(window, window.getDecorView());

        if (controller != null) {
            controller.show(WindowInsetsCompat.Type.navigationBars());
        }

    }

}