import { registerPlugin } from '@capacitor/core';
var NavigationBar = registerPlugin('NavigationBar', {
    web: function () { return import('./web').then(function (m) { return new m.NavigationBarWeb(); }); },
});
export * from './definitions';
export { NavigationBar };
//# sourceMappingURL=index.js.map