(function (factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    globalThis['androidx-compose-runtime-runtime-saveable'] = factory(typeof globalThis['androidx-compose-runtime-runtime-saveable'] === 'undefined' ? {} : globalThis['androidx-compose-runtime-runtime-saveable']);
}(function (_) {
  'use strict';
  //region block: pre-declaration
  //endregion
  var MaxSupportedRadix;
  var androidx_compose_runtime_saveable_SaveableStateRegistryWrapper$stable;
  //region block: init
  MaxSupportedRadix = 36;
  androidx_compose_runtime_saveable_SaveableStateRegistryWrapper$stable = 8;
  //endregion
  return _;
}));

//# sourceMappingURL=androidx-compose-runtime-runtime-saveable.js.map
