# Rek Khmer UI/UX Package (Minimal)

This repository branch contains a minimal UI/UX package for the Rek Khmer project. It is intended as a lightweight, developer-friendly starting point that mirrors the supplied UI ZIP structure and can be integrated into the Rek-Chess Android app.

Structure added on branch `integrate/zip-ui`:

- src/main/java/com/rek/ui/
  - ZipTheme.kt       -- minimal Compose theme (colors/fonts placeholders)
  - ZipHomeScreen.kt  -- lightweight Home screen Composable
  - ZipRekBoardView.kt-- wrapper RekBoardView composable (calls existing engine via ViewModel)
- assets/README.md    -- instructions to add actual assets (images, fonts, animations)
- UI_README.md        -- integration notes & mapping checklist

Notes:
- This is a minimal, fast approach (Approach A) to provide a UI package quickly without heavy animations or pixel-perfect porting.
- The Kotlin Composables are templates and should be copied into the Android app module (Rek-Chess) under `app/src/main/java/...` and wired to `RekGameViewModel`.

If you want, I can now:
- Copy these files into the `Rek-Chess` repo and wire them into the NavGraph (branch only), or
- Accept the real ZIP assets and replace the placeholders with pixel assets and fonts.
