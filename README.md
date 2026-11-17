# AURORA MEDIA PLAYER

**EVERY SOUND HAS A UNIVERSE.**  
One app. Every experience.

A native Android multimedia player built with Kotlin, Jetpack Compose and AndroidX Media3.

## Project status

- [x] Phase 1: initial modular architecture and Android app scaffold
- [ ] Phase 2: visual design system and responsive layouts
- [ ] Phase 3: official branding, adaptive launcher icon and splash screen
- [ ] Phase 4: functional audio playback
- [ ] Phase 5: synchronized LRC lyrics
- [ ] Phase 6: video playback
- [ ] Phase 7: secure integrated browser
- [ ] Phase 8: custom backgrounds and gallery
- [ ] Phase 9: Aurora Live and visualizers
- [ ] Phase 10: intelligent media library
- [ ] Phase 11: media notifications and MediaSessionService
- [ ] Phase 12: advanced customization
- [ ] Phase 13: image/rendering quality validation
- [ ] Phase 14: optimization and testing
- [ ] Phase 15: APK build and release

## Tech baseline
- Kotlin 2.1.20
- Android Gradle Plugin 8.9.2
- Jetpack Compose (Compose BOM 2025.04.01)
- AndroidX Media3 1.6.1 (dependency reserved in playback module)
- Java 17; minSdk 26; compileSdk/targetSdk 35

Versions are pinned as a reproducible starting baseline and should be reviewed against the current stable Android toolchain before a production release.

## Open in Android Studio
1. Extract this project folder.
2. Open Android Studio and choose **Open**.
3. Select the `aurora-media-player` folder.
4. Allow Gradle sync and install the required Android SDK 35 and JDK 17.
5. Run the `app` configuration on an emulator or Android device.

If Android Studio offers a Gradle/AGP compatibility upgrade, review it before accepting and keep the versions aligned.

## GitHub
Create a new repository named `aurora-media-player`, then push this project. Do not commit `local.properties`, signing keys, API secrets or generated build outputs.

## Honest implementation status
The current app is a minimal launchable scaffold with a Compose Aurora placeholder screen. No media playback or other advanced feature is claimed as complete yet.
