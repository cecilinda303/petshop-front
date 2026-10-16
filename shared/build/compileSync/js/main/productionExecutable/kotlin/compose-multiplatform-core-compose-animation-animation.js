(function (factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    globalThis['compose-multiplatform-core-compose-animation-animation'] = factory(typeof globalThis['compose-multiplatform-core-compose-animation-animation'] === 'undefined' ? {} : globalThis['compose-multiplatform-core-compose-animation-animation']);
}(function (_) {
  'use strict';
  //region block: pre-declaration
  //endregion
  var androidx_compose_animation_AnimatedVisibilityScopeImpl$stable;
  var isLookaheadAnimationVisualDebuggingEnabledDefault;
  var isLookaheadAnimationVisualDebuggingForceEnabled;
  var androidx_compose_animation_LookaheadAnimationVisualDebugConfig$stable;
  var androidx_compose_animation_RenderInTransitionOverlayNodeElement$stable;
  var androidx_compose_animation_RenderInTransitionOverlayNode$stable;
  var androidx_compose_animation_SharedElementEntry$stable;
  var androidx_compose_animation_SharedTransitionStateMachine_State$stable;
  var androidx_compose_animation_SharedTransitionStateMachine$stable;
  var androidx_compose_animation_NoMatchFound$stable;
  var androidx_compose_animation_ActiveMatchFoundConfigPending$stable;
  var androidx_compose_animation_MatchIsOrHasBeenConfigured$stable;
  var androidx_compose_animation_ActiveMatchConfigured$stable;
  var androidx_compose_animation_ActiveMatchRemovedDuringTransition$stable;
  var androidx_compose_animation_TargetData$stable;
  var androidx_compose_animation_AndroidFlingSpline_FlingResult$stable;
  var androidx_compose_animation_AndroidFlingSpline$stable;
  var androidx_compose_animation_SplineBasedFloatDecayAnimationSpec$stable;
  var platformFlingScrollFriction;
  //region block: init
  androidx_compose_animation_AnimatedVisibilityScopeImpl$stable = 8;
  isLookaheadAnimationVisualDebuggingEnabledDefault = true;
  isLookaheadAnimationVisualDebuggingForceEnabled = false;
  androidx_compose_animation_LookaheadAnimationVisualDebugConfig$stable = 0;
  androidx_compose_animation_RenderInTransitionOverlayNodeElement$stable = 0;
  androidx_compose_animation_RenderInTransitionOverlayNode$stable = 8;
  androidx_compose_animation_SharedElementEntry$stable = 8;
  androidx_compose_animation_SharedTransitionStateMachine_State$stable = 0;
  androidx_compose_animation_SharedTransitionStateMachine$stable = 8;
  androidx_compose_animation_NoMatchFound$stable = 0;
  androidx_compose_animation_ActiveMatchFoundConfigPending$stable = 8;
  androidx_compose_animation_MatchIsOrHasBeenConfigured$stable = 0;
  androidx_compose_animation_ActiveMatchConfigured$stable = 0;
  androidx_compose_animation_ActiveMatchRemovedDuringTransition$stable = 8;
  androidx_compose_animation_TargetData$stable = 0;
  androidx_compose_animation_AndroidFlingSpline_FlingResult$stable = 0;
  androidx_compose_animation_AndroidFlingSpline$stable = 8;
  androidx_compose_animation_SplineBasedFloatDecayAnimationSpec$stable = 0;
  platformFlingScrollFriction = 0.015;
  //endregion
  return _;
}));

//# sourceMappingURL=compose-multiplatform-core-compose-animation-animation.js.map
