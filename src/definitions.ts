export interface NavigationBarPlugin {
  /**
   * Hide navigation bar using direct Android API
   * @param options - Configuration options
   */
  hideNavigationBar(options?: {
    method?: 'IMMERSIVE' | 'IMMERSIVE_STICKY' | 'LEAN_BACK';
  }): Promise<{ success: boolean }>;

  /**
   * Hide navigation bar using AndroidX compatibility library
   * @param options - Configuration options
   */
  hideNavigationBarCompat(options?: {
    method?: 'IMMERSIVE' | 'IMMERSIVE_STICKY' | 'LEAN_BACK';
  }): Promise<{ success: boolean }>;

  /**
   * Show navigation bar using direct Android API
   */
  showNavigationBar(): Promise<{ success: boolean }>;

  /**
   * Show navigation bar using AndroidX compatibility library
   */
  showNavigationBarCompat(): Promise<{ success: boolean }>;
}

/**
 * Configuration interface for NavigationBar plugin in capacitor.config.ts
 */
export interface NavigationBarConfig {
  /**
   * Enable auto-hide navigation bar on app start
   * @default false
   */
  enabled?: boolean;

  /**
   * Hide method to use
   * @default 'IMMERSIVE'
   */
  method?: 'IMMERSIVE' | 'IMMERSIVE_STICKY' | 'LEAN_BACK';

  /**
   * Use AndroidX compatibility library instead of direct Android API
   * @default false
   */
  compact?: boolean;
}

// Augment Capacitor's PluginsConfig interface
declare module '@capacitor/core' {
  export interface PluginsConfig {
    NavigationBar?: NavigationBarConfig;
  }
}
