# <img src="https://www.svgrepo.com/show/353536/capacitorjs-icon.svg" alt="Capacitorjs"  style="margin: auto; margin-right: 20px; width: 20px"/> Capacitorjs NavigationBar

> NavigationBar Manipulator Plugin for Android 11+Capacitorjs NavigationBar Manipulator Plugin for Android 11+ (CapacitorJS)

## Install

### With Github Packages

```bash
$ npm login --scope=@dextershield --auth-type=legacy --registry=https://npm.pkg.github.com

> Username: USERNAME
> Password: TOKEN (classic)

$ npm install @dextershield/navigation-bar
$ npx cap sync
```

### Legacy Way

```bash
$ npm install github:DexterShield/Capacitorjs-NavigationBar
$ npx cap sync
```

## Configuration

You can configure the plugin to automatically hide the navigation bar when your app starts by adding configuration to your `capacitor.config.ts`:

```typescript
import { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'com.yourapp.id',
  appName: 'YourApp',
  webDir: 'dist',
  plugins: {
    NavigationBar: {
      enabled: true, // Enable auto-hide on app start
      method: 'IMMERSIVE_STICKY', // Hide method: 'IMMERSIVE', 'IMMERSIVE_STICKY', or 'LEAN_BACK'
      compact: false, // Use AndroidX compatibility mode
    },
  },
};

export default config;
```

### Configuration Options

- `enabled` (boolean, default: `false`) - Enable auto-hide navigation bar when app starts
- `method` (string, default: `'IMMERSIVE'`) - Hide method to use
  - `'IMMERSIVE'` - Hides navigation bar, shows on swipe
  - `'IMMERSIVE_STICKY'` - Hides navigation bar, shows briefly on swipe then auto-hides
  - `'LEAN_BACK'` - Hides navigation bar, shows on any touch
- `compact` (boolean, default: `false`) - Use AndroidX compatibility library instead of direct Android API

## API

### Options:

```
IMMERSIVE, // BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
IMMERSIVE_STICKY, // BEHAVIOR_SHOW_BARS_BY_SWIPE
LEAN_BACK, // BEHAVIOR_SHOW_BARS_BY_TOUCH
```

### Example

```javascript
import { NavigationBar } from '@dextershield/navigation-bar';

await hideNavigationBar({ method: 'IMMERSIVE' });
```

### Functions

<docgen-index>

* [`hideNavigationBar(...)`](#hidenavigationbar)
* [`hideNavigationBarCompat(...)`](#hidenavigationbarcompat)
* [`showNavigationBar()`](#shownavigationbar)
* [`showNavigationBarCompat()`](#shownavigationbarcompat)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### hideNavigationBar(...)

```typescript
hideNavigationBar(options?: { method?: "IMMERSIVE" | "IMMERSIVE_STICKY" | "LEAN_BACK" | undefined; } | undefined) => Promise<{ success: boolean; }>
```

Hide navigation bar using direct Android API

| Param         | Type                                                                        | Description             |
| ------------- | --------------------------------------------------------------------------- | ----------------------- |
| **`options`** | <code>{ method?: 'IMMERSIVE' \| 'IMMERSIVE_STICKY' \| 'LEAN_BACK'; }</code> | - Configuration options |

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------


### hideNavigationBarCompat(...)

```typescript
hideNavigationBarCompat(options?: { method?: "IMMERSIVE" | "IMMERSIVE_STICKY" | "LEAN_BACK" | undefined; } | undefined) => Promise<{ success: boolean; }>
```

Hide navigation bar using AndroidX compatibility library

| Param         | Type                                                                        | Description             |
| ------------- | --------------------------------------------------------------------------- | ----------------------- |
| **`options`** | <code>{ method?: 'IMMERSIVE' \| 'IMMERSIVE_STICKY' \| 'LEAN_BACK'; }</code> | - Configuration options |

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------


### showNavigationBar()

```typescript
showNavigationBar() => Promise<{ success: boolean; }>
```

Show navigation bar using direct Android API

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------


### showNavigationBarCompat()

```typescript
showNavigationBarCompat() => Promise<{ success: boolean; }>
```

Show navigation bar using AndroidX compatibility library

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------

</docgen-api>
