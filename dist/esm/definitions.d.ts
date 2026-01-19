export interface NavigationBarPlugin {
    hideNavigationBarCompat(options?: {
        method?: 'IMMERSIVE' | 'IMMERSIVE_STICKY' | 'LEAN_BACK';
    }): Promise<{
        success: boolean;
    }>;
    hideNavigationBar(options?: {
        method?: 'IMMERSIVE' | 'IMMERSIVE_STICKY' | 'LEAN_BACK';
    }): Promise<{
        success: boolean;
    }>;
    showNavigationBarCompat(): Promise<{
        success: boolean;
    }>;
    showNavigationBar(): Promise<{
        success: boolean;
    }>;
}
export interface NavigationBarPluginConfig {
    method?: 'IMMERSIVE' | 'IMMERSIVE_STICKY' | 'LEAN_BACK';
    compact?: boolean;
}
import '@capacitor/cli';
declare module '@capacitor/cli' {
    interface CapacitorConfig {
        /**
         * Custom configuration options
         */
        Plugins?: {
            NavigationBarPlugin?: NavigationBarPluginConfig;
        };
    }
}
