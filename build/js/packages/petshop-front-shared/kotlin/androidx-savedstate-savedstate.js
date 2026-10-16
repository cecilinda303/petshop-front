(function (factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    globalThis['androidx-savedstate-savedstate'] = factory(typeof globalThis['androidx-savedstate-savedstate'] === 'undefined' ? {} : globalThis['androidx-savedstate-savedstate']);
}(function (_) {
  'use strict';
  //region block: pre-declaration
  //endregion
  return _;
}));

//# sourceMappingURL=androidx-savedstate-savedstate.js.map
