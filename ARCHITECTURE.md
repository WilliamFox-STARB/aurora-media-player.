# AURORA architecture — Phase 1

## Principles
- Feature-first modularization with shared core modules.
- UI in Jetpack Compose; playback isolated from UI.
- Repository interfaces will separate Android platform APIs from feature presentation.
- Coroutines/Flow for asynchronous state; Room for indexed media metadata; DataStore for preferences.
- Media3 ExoPlayer + MediaSessionService for playback and system controls.

## Module responsibilities
- `:app`: application entry point and future dependency/navigation composition.
- `:core:common`: shared primitives, dispatchers, result types and utilities.
- `:core:design`: Aurora color system, typography, shapes and reusable Compose components.
- `:feature:home`: home/dashboard feature.
- `:feature:library`: local media browsing and library presentation.
- `:playback:audio`: Media3 player and session boundary; implementation comes in later phases.

## Planned additions
`feature:lyrics`, `feature:video`, `feature:browser`, `feature:aurora-live`, `feature:settings`, `core:database`, `core:datastore`, and `playback:video` will be introduced with their implementation phases rather than as empty modules.

## Current limitations
This is an architecture scaffold, not a finished media player. Playback, media scanning, notifications, LRC parsing, video, WebView and visualizers are not implemented in Phase 1.
