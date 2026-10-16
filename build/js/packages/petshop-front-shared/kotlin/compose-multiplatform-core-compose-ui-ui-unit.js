(function (factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    globalThis['compose-multiplatform-core-compose-ui-ui-unit'] = factory(typeof globalThis['compose-multiplatform-core-compose-ui-ui-unit'] === 'undefined' ? {} : globalThis['compose-multiplatform-core-compose-ui-ui-unit']);
}(function (_) {
  'use strict';
  //region block: pre-declaration
  //endregion
  var androidx_compose_ui_unit_ComposeUiUnitFlags$stable;
  var androidx_compose_ui_unit_DpRect$stable;
  var androidx_compose_ui_unit_IntRect$stable;
  var androidx_compose_ui_unit_DpInsets$stable;
  //region block: init
  androidx_compose_ui_unit_ComposeUiUnitFlags$stable = 0;
  androidx_compose_ui_unit_DpRect$stable = 0;
  androidx_compose_ui_unit_IntRect$stable = 0;
  androidx_compose_ui_unit_DpInsets$stable = 0;
  //endregion
  return _;
}));

//# sourceMappingURL=compose-multiplatform-core-compose-ui-ui-unit.js.map
