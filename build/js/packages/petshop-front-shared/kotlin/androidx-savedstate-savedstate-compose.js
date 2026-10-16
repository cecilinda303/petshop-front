(function (factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    globalThis['androidx-savedstate-savedstate-compose'] = factory(typeof globalThis['androidx-savedstate-savedstate-compose'] === 'undefined' ? {} : globalThis['androidx-savedstate-savedstate-compose']);
}(function (_) {
  'use strict';
  //region block: pre-declaration
  //endregion
  return _;
}));

//# sourceMappingURL=androidx-savedstate-savedstate-compose.js.map
