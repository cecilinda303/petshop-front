(function (factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    globalThis['androidx-navigationevent-navigationevent'] = factory(typeof globalThis['androidx-navigationevent-navigationevent'] === 'undefined' ? {} : globalThis['androidx-navigationevent-navigationevent']);
}(function (_) {
  'use strict';
  //region block: pre-declaration
  //endregion
  return _;
}));

//# sourceMappingURL=androidx-navigationevent-navigationevent.js.map
