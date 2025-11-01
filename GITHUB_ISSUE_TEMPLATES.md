# GitHub Issues Templates

This directory contains templates for creating issues in GitHub from the MVP To-Do List App issues list.

## How to Use

1. Copy the relevant template below
2. Create a new issue in GitHub
3. Fill in the specific details from MVP_TODO_APP_ISSUES.md
4. Add appropriate labels and assignee

---

## Template 1: Feature Implementation

```markdown
## Description
[Detailed description of what needs to be built]

## Priority
**Priority Level:** [High/Medium/Low]

## Team Role
**Assigned To:** [UI/UX Designer / Backend Developer / Integration Engineer]

## Estimated Time
**Estimate:** [X days]

## Dependencies
**Depends On:**
- Issue #X - [Issue Name]
- Issue #Y - [Issue Name]

**Blocks:**
- Issue #Z - [Issue Name]

## Acceptance Criteria
- [ ] Criterion 1
- [ ] Criterion 2
- [ ] Criterion 3
- [ ] Criterion 4
- [ ] Criterion 5

## Deliverables
- Deliverable 1
- Deliverable 2
- Deliverable 3

## Technical Notes
[Any technical considerations, constraints, or implementation suggestions]

## Design References
[Links to Figma designs, mockups, or other visual references]

## Testing Requirements
- [ ] Unit tests written and passing
- [ ] Integration tests completed
- [ ] Manual testing checklist completed

## Definition of Done
- [ ] All acceptance criteria met
- [ ] Code reviewed and approved
- [ ] Tests written and passing
- [ ] Documentation updated
- [ ] Changes merged to main branch
- [ ] Demo-ready

## Labels
`ui-ux` `backend` `integration` `feature` `high-priority` `mvp`

## Sprint
Sprint [X]

---

## Notes
[Any additional context, discussions, or decisions]
```

---

## Template 2: Design Task

```markdown
## Description
[What design deliverables are needed]

## Priority
**Priority Level:** [High/Medium/Low]

## Team Role
**Assigned To:** UI/UX Designer

## Estimated Time
**Estimate:** [X days]

## Dependencies
**Depends On:**
- Issue #X - [Issue Name]

**Blocks:**
- Issue #Z - [Issue Name]

## Acceptance Criteria
- [ ] Wireframes/mockups created
- [ ] Design system components defined
- [ ] All states designed (normal, hover, pressed, disabled, error)
- [ ] Responsive considerations documented
- [ ] Accessibility checked (WCAG AA)
- [ ] Design shared with team for feedback
- [ ] Design approved by team

## Deliverables
- Figma/Sketch file with all screens
- Design specifications document
- Asset exports (if applicable)
- Prototype link (if applicable)

## Design Guidelines
- Follow Material Design principles
- Ensure consistency with existing designs
- Consider accessibility
- Design for multiple screen sizes
- Include dark mode (if applicable)

## Reference Apps
- [App Name 1] - [Specific feature/interaction]
- [App Name 2] - [Specific feature/interaction]

## Feedback & Iteration
- [ ] Initial designs shared
- [ ] Feedback incorporated
- [ ] Final designs approved

## Labels
`ui-ux` `design` `high-priority` `mvp`

## Sprint
Sprint [X]

---

## Design Review Checklist
- [ ] Consistent with brand guidelines
- [ ] All interactive states defined
- [ ] Accessibility considerations met
- [ ] Responsive design addressed
- [ ] Developer handoff ready
```

---

## Template 3: Backend/Technical Task

```markdown
## Description
[Technical implementation needed]

## Priority
**Priority Level:** [High/Medium/Low]

## Team Role
**Assigned To:** Backend Developer

## Estimated Time
**Estimate:** [X days]

## Dependencies
**Depends On:**
- Issue #X - [Issue Name]

**Blocks:**
- Issue #Z - [Issue Name]

## Acceptance Criteria
- [ ] Implementation complete
- [ ] Code follows project conventions
- [ ] Error handling implemented
- [ ] Edge cases handled
- [ ] Unit tests written and passing (80%+ coverage)
- [ ] Documentation updated
- [ ] Code reviewed and approved

## Technical Specifications
**Database Schema:**
```sql
[Schema definition if applicable]
```

**API Endpoints:** (if applicable)
- `GET /api/endpoint` - Description
- `POST /api/endpoint` - Description

**Data Models:**
```kotlin
data class Model(
    // Fields
)
```

## Implementation Notes
[Technical approach, patterns to use, libraries needed]

## Testing Requirements
- [ ] Unit tests for all public methods
- [ ] Integration tests for data flow
- [ ] Edge cases tested
- [ ] Error scenarios tested
- [ ] Performance tested

## Performance Considerations
- Expected response time: [X ms]
- Memory usage: [X MB]
- Database query optimization needed: [Yes/No]

## Security Considerations
- [ ] Input validation
- [ ] Data sanitization
- [ ] Permission checks
- [ ] Secure storage

## Labels
`backend` `database` `high-priority` `mvp`

## Sprint
Sprint [X]

---

## Code Review Checklist
- [ ] Code follows Kotlin/Java conventions
- [ ] Tests provide adequate coverage
- [ ] No code smells or anti-patterns
- [ ] Documentation is clear
- [ ] Performance is acceptable
```

---

## Template 4: Integration/Testing Task

```markdown
## Description
[What needs to be integrated or tested]

## Priority
**Priority Level:** [High/Medium/Low]

## Team Role
**Assigned To:** Integration Engineer

## Estimated Time
**Estimate:** [X days]

## Dependencies
**Depends On:**
- Issue #X - [Issue Name] (Backend)
- Issue #Y - [Issue Name] (Design)

**Blocks:**
- Issue #Z - [Issue Name]

## Acceptance Criteria
- [ ] UI implemented matching design specs
- [ ] Backend integration complete
- [ ] All interactions working correctly
- [ ] Error states handled gracefully
- [ ] Loading states implemented
- [ ] Navigation working
- [ ] Tests written and passing
- [ ] Code reviewed and approved

## Implementation Checklist
- [ ] Layout XML created
- [ ] ViewModel implemented
- [ ] LiveData/Flow observers set up
- [ ] Repository/UseCase integration
- [ ] Error handling
- [ ] Loading states
- [ ] Empty states
- [ ] Navigation

## UI Components
- Activity/Fragment: [Name]
- Layout file: [res/layout/file_name.xml]
- ViewModel: [ClassName]
- Adapter (if applicable): [ClassName]

## Testing Requirements
- [ ] ViewModel unit tests
- [ ] Repository integration tests
- [ ] UI tests (Espresso)
- [ ] Navigation tests
- [ ] Edge case tests

## Performance Requirements
- Screen load time: < [X] seconds
- Smooth scrolling (60 FPS)
- No memory leaks
- Efficient database queries

## Manual Testing Checklist
- [ ] Test on different screen sizes
- [ ] Test with different data scenarios (empty, few items, many items)
- [ ] Test offline behavior
- [ ] Test error scenarios
- [ ] Test rotation and configuration changes
- [ ] Test navigation flows

## Labels
`integration` `ui` `testing` `high-priority` `mvp`

## Sprint
Sprint [X]

---

## Devices Tested
- [ ] Pixel [X] (Android [X])
- [ ] Samsung Galaxy [X] (Android [X])
- [ ] Low-end device (Android [X])

## Screenshots
[Attach screenshots of implemented feature]
```

---

## Template 5: Bug Report

```markdown
## Bug Description
[Clear description of the bug]

## Priority
**Severity:** [Critical/High/Medium/Low]

## Environment
- Device: [Device name]
- Android Version: [X.X]
- App Version: [X.X.X]
- Build: [Debug/Release]

## Steps to Reproduce
1. Step 1
2. Step 2
3. Step 3

## Expected Behavior
[What should happen]

## Actual Behavior
[What actually happens]

## Screenshots/Logs
[Attach screenshots or error logs]

```
[Error log or stack trace]
```

## Possible Cause
[If known]

## Suggested Fix
[If known]

## Impact
**User Impact:** [Description of how this affects users]
**Workaround Available:** [Yes/No - describe if yes]

## Labels
`bug` `critical` `ui` `backend` `integration`

---

## Fix Checklist
- [ ] Bug reproduced
- [ ] Root cause identified
- [ ] Fix implemented
- [ ] Tests added to prevent regression
- [ ] Verified fix works
- [ ] Code reviewed
- [ ] Deployed to staging
- [ ] Verified on staging
```

---

## Label Definitions

### By Team
- `ui-ux` - Design tasks
- `backend` - Backend development
- `integration` - Integration and testing

### By Type
- `feature` - New feature
- `bug` - Bug fix
- `enhancement` - Improvement to existing feature
- `documentation` - Documentation update
- `testing` - Test creation or fixes

### By Priority
- `critical` - Blocks other work, must fix immediately
- `high-priority` - Must have for MVP
- `medium-priority` - Should have for MVP
- `low-priority` - Nice to have, post-MVP

### By Status
- `mvp` - Part of MVP scope
- `blocked` - Waiting on dependencies
- `in-progress` - Currently being worked on
- `ready-for-review` - Ready for code review
- `ready-for-testing` - Ready for QA

### By Area
- `database` - Database related
- `ui` - User interface
- `architecture` - Project architecture
- `performance` - Performance related
- `security` - Security related
- `ci-cd` - CI/CD pipeline

---

## Issue Workflow

1. **Create Issue** - Use appropriate template
2. **Triage** - Assign priority, labels, and sprint
3. **Assign** - Assign to team member
4. **In Progress** - Team member starts work
5. **Code Review** - Create PR and request review
6. **Testing** - QA testing or self-testing
7. **Done** - Close issue and update sprint board

---

## Quick Copy Issues

To quickly create all 30 issues in GitHub, you can use GitHub CLI:

```bash
# Install GitHub CLI if not already installed
# Then run:

gh issue create --title "Issue #1: Design To-Do List App UI/UX Wireframes" \
  --body-file issue_templates/issue_01.md \
  --label "ui-ux,design,high-priority,mvp" \
  --assignee @username

# Repeat for all 30 issues
```

Or use the GitHub web interface to create issues one by one using the templates above.

---

## Automation Suggestions

### GitHub Actions
- Auto-label PRs based on files changed
- Auto-assign reviewers based on file paths
- Run tests on PR creation
- Update issue status when PR merged

### Project Board
- Use GitHub Projects for sprint planning
- Columns: Backlog, Sprint Planned, In Progress, Review, Testing, Done
- Automate moving issues based on PR status

---

*Template Version: 1.0*  
*Last Updated: 2025-11-01*
