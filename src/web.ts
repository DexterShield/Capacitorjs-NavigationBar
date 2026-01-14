import { WebPlugin } from '@capacitor/core';
import type { NavigationBarPlugin } from './definitions';

export class NavigationBarWeb extends WebPlugin implements NavigationBarPlugin {
  async hideNavigationBarCompat(): Promise<{ success: boolean }> {
    console.log('hideNavigationBarCompat not available on web');
    return { success: false };
  }

  async hideNavigationBar(): Promise<{ success: boolean }> {
    console.log('hideNavigationBar not available on web');
    return { success: false };
  }

  async showNavigationBarCompat(): Promise<{ success: boolean }> {
    console.log('showNavigationBarCompat not available on web');
    return { success: false };
  }

  async showNavigationBar(): Promise<{ success: boolean }> {
    console.log('showNavigationBar not available on web');
    return { success: false };
  }
}
