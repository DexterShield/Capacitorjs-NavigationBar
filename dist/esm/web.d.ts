import { WebPlugin } from '@capacitor/core';
import type { NavigationBarPlugin } from './definitions';
export declare class NavigationBarWeb extends WebPlugin implements NavigationBarPlugin {
    hideNavigationBarCompat(): Promise<{
        success: boolean;
    }>;
    hideNavigationBar(): Promise<{
        success: boolean;
    }>;
    showNavigationBarCompat(): Promise<{
        success: boolean;
    }>;
    showNavigationBar(): Promise<{
        success: boolean;
    }>;
}
