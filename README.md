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

- [`hideNavigationBarCompat(...)`](#hidenavigationbarcompat)
- [`hideNavigationBar(...)`](#hidenavigationbar)
- [`showNavigationBarCompat()`](#shownavigationbarcompat)
- [`showNavigationBar()`](#shownavigationbar)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### hideNavigationBarCompat(...)

```typescript
hideNavigationBarCompat(options?: { method?: "IMMERSIVE" | "IMMERSIVE_STICKY" | "LEAN_BACK" | undefined; } | undefined) => Promise<{ success: boolean; }>
```

Hide navigation bar using AndroidX WindowCompat

| Param         | Type                                                                        |
| ------------- | --------------------------------------------------------------------------- |
| **`options`** | <code>{ method?: 'IMMERSIVE' \| 'IMMERSIVE_STICKY' \| 'LEAN_BACK'; }</code> |

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

---

### hideNavigationBar(...)

```typescript
hideNavigationBar(options?: { method?: "IMMERSIVE" | "IMMERSIVE_STICKY" | "LEAN_BACK" | undefined; } | undefined) => Promise<{ success: boolean; }>
```

Hide navigation bar using direct Android API

| Param         | Type                                                                        |
| ------------- | --------------------------------------------------------------------------- |
| **`options`** | <code>{ method?: 'IMMERSIVE' \| 'IMMERSIVE_STICKY' \| 'LEAN_BACK'; }</code> |

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

---

### showNavigationBarCompat()

```typescript
showNavigationBarCompat() => Promise<{ success: boolean; }>
```

Show navigation bar using AndroidX WindowCompat

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

---

### showNavigationBar()

```typescript
showNavigationBar() => Promise<{ success: boolean; }>
```

Show navigation bar using direct Android API

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

---

</docgen-api>
