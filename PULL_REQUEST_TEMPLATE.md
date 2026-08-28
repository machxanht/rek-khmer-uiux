Title: Integrate minimal ZIP-style UI package (Approach A)

Description:
Add minimal UI scaffold (ZipTheme, ZipHomeScreen, ZipRekBoardView) and asset placeholders on branch integrate/zip-ui for initial review. This is a conservative integration that keeps the Rek engine untouched and provides a lightweight presentation layer to be further refined.

Files added:
- src/main/java/com/rek/ui/ZipTheme.kt
- src/main/java/com/rek/ui/ZipHomeScreen.kt
- src/main/java/com/rek/ui/ZipRekBoardView.kt
- UI_README.md
- assets/README.md
- src/main/resources/REK_UI_INTEGRATION.md

Notes:
- This PR only affects the rek-khmer-uiux repo (adds UI scaffolding). If you want these files copied into the Rek-Chess app, I'll do that in a follow-up PR/branch.

Checklist:
- [x] Add theme and home screen scaffold
- [x] Add Rek board wrapper placeholder
- [x] Add asset placeholder and integration notes

