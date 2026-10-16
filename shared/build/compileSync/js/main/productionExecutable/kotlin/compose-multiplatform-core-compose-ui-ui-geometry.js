(function (factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    globalThis['compose-multiplatform-core-compose-ui-ui-geometry'] = factory(typeof globalThis['compose-multiplatform-core-compose-ui-ui-geometry'] === 'undefined' ? {} : globalThis['compose-multiplatform-core-compose-ui-ui-geometry']);
}(function (_) {
  'use strict';
  //region block: pre-declaration
  //endregion
  var androidx_compose_ui_geometry_MutableRect$stable;
  var androidx_compose_ui_geometry_Rect$stable;
  var androidx_compose_ui_geometry_RoundRect$stable;
  //region block: init
  androidx_compose_ui_geometry_MutableRect$stable = 8;
  androidx_compose_ui_geometry_Rect$stable = 0;
  androidx_compose_ui_geometry_RoundRect$stable = 0;
  //endregion
  return _;
}));

//# sourceMappingURL=compose-multiplatform-core-compose-ui-ui-geometry.js.map
