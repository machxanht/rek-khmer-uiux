# Rek Khmer UI package — integration notes

This branch provides a minimal UI package intended to be integrated into the Rek-Chess Android app.

What I added (branch: integrate/zip-ui):
- `src/main/java/com/rek/ui/ZipTheme.kt` — theme scaffolding
- `src/main/java/com/rek/ui/ZipHomeScreen.kt` — minimal home screen composable
- `src/main/java/com/rek/ui/ZipRekBoardView.kt` — lightweight Rek board wrapper
- `assets/README.md` — instructions to add actual visual assets

How to use in Rek-Chess:
1. Copy the `src/main/java/com/rek/ui` folder into `app/src/main/java/com/rek/ui` inside the Rek-Chess project.
2. Copy any visual assets (images, fonts, animations) into `app/src/main/res/drawable`, `res/font`, or `app/src/main/assets` following Android conventions.
3. Replace usages of `RekBoardView` in `GameScreen.kt` with `ZipRekBoardView` and forward parameters from `RekGameViewModel.uiState`.
4. Use `ZipHomeScreen` in place of your HomeScreen by wiring navigation callbacks to the existing NavGraph.

Minimal goal achieved: provide a lightweight, fast-to-review UI package. This is "Approach A"—a conservative change that keeps the Rek engine untouched and avoids heavy porting work.

If you want next steps I can do (branch only, no PR):
- Copy the UI files directly into Rek-Chess (integrate in a new branch there), or
- Replace placeholders with real assets if you upload the ZIP or add assets to `assets/` here.
