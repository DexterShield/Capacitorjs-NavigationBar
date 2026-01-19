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
    enabled?: boolean;
    compact?: boolean;
}
