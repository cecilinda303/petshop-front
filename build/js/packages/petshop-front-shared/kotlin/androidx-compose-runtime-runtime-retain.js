(function (factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    globalThis['androidx-compose-runtime-runtime-retain'] = factory(typeof globalThis['androidx-compose-runtime-runtime-retain'] === 'undefined' ? {} : globalThis['androidx-compose-runtime-runtime-retain']);
}(function (_) {
  'use strict';
  //region block: pre-declaration
  //endregion
  var androidx_compose_runtime_retain_ForgetfulRetainedValuesStore$stable;
  var androidx_compose_runtime_retain_ManagedRetainedValuesStore$stable;
  var androidx_compose_runtime_retain_RetainedValueHolder$stable;
  var androidx_compose_runtime_retain_RetainedValuesStoreRegistry$stable;
  //region block: init
  androidx_compose_runtime_retain_ForgetfulRetainedValuesStore$stable = 0;
  androidx_compose_runtime_retain_ManagedRetainedValuesStore$stable = 8;
  androidx_compose_runtime_retain_RetainedValueHolder$stable = 8;
  androidx_compose_runtime_retain_RetainedValuesStoreRegistry$stable = 8;
  //endregion
  return _;
}));

//# sourceMappingURL=androidx-compose-runtime-runtime-retain.js.map
