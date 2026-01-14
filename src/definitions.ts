export interface NavigationBarPlugin {
  /**
   * Hide navigation bar using AndroidX WindowCompat
   */
  hideNavigationBarCompat(options?: {
    method?: 'IMMERSIVE' | 'IMMERSIVE_STICKY' | 'LEAN_BACK';
  }): Promise<{ success: boolean }>;

  /**
   * Hide navigation bar using direct Android API
   */
  hideNavigationBar(options?: {
    method?: 'IMMERSIVE' | 'IMMERSIVE_STICKY' | 'LEAN_BACK';
  }): Promise<{ success: boolean }>;

  /**
   * Show navigation bar using AndroidX WindowCompat
   */
  showNavigationBarCompat(): Promise<{ success: boolean }>;

  /**
   * Show navigation bar using direct Android API
   */
  showNavigationBar(): Promise<{ success: boolean }>;
}
