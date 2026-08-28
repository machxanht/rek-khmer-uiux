# Integrate minimal ZIP-style UI package (Approach A)

This branch provides a minimal, fast-to-review UI scaffold that mirrors the supplied UI ZIP structure. It is intentionally conservative: presentation-only, lightweight, and safe to review/iterate on.

What changed
- Added theme (ZipTheme), Home screen (ZipHomeScreen), and RekBoard wrapper (ZipRekBoardView).
- Added asset placeholders and a README explaining integration steps.

Why
- Provide a starting point so the Rek-Chess team can quickly see the intended UI direction without risking engine changes.

How to review
- Check added files in `src/main/java/com/rek/ui`.
- If you want this wired into Rek-Chess, I can create a follow-up branch in that repo to copy the code and update NavGraph.
