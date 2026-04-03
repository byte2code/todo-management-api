# Changelog

All notable changes to this project are documented in this file.

## [v2.0.0] - 2026-04-03

### Summary
Second version of the Todo Management API that refines how todo items are managed within the user-to-todo relationship.

### Highlights

- Shifted todo association handling to the user aggregate through the `todoList`.
- Updated todo create and delete flows to persist relationship changes through the user entity.
- Adjusted todo update logic to work against user-owned todo collections.
- Refreshed the README to reflect the updated relationship-management approach.

### Notes

This version keeps the public API flow familiar while improving the project’s learning value around JPA collection-based relationship management.

## [v1.0.0] - 2026-04-03

### Summary
Initial publication of the Todo Management API as a clean, portfolio-ready Spring Boot REST project.

### Highlights

- Added a recruiter-friendly README with API overview, features, run steps, and project structure.
- Added a changelog for future version tracking.
- Cleaned IDE files, build artifacts, and system clutter before publishing.
- Preserved the original user and todo management workflow built on Spring Data JPA and H2.

### Notes

This version establishes the project as a compact learning showcase for user and todo CRUD management with Spring Boot.
