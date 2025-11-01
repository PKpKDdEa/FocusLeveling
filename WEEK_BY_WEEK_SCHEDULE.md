# Focus Leveling MVP - Week by Week Schedule

## 📅 Overview

**Duration:** 4 weeks (28 days)  
**Structure:** 3 weeks development + 1 week finalization  
**Team:** UI/UX Designer, Backend Developer, Integration Engineer  
**Work Days:** Monday - Friday (weekends for catch-up only if needed)

---

## Week 1: Foundation Sprint (Days 1-7)
**Goal:** Set up architecture, design basics, and database foundation

### Day 1: Monday - Kickoff & Setup
**Team Meeting (9:00 AM - 10:30 AM):**
- Review revised 4-week timeline
- Discuss MVP scope and priorities
- Assign Week 1 tasks
- Set daily standup time (9:00 AM)

**UI/UX Designer:**
- [ ] Set up Figma workspace
- [ ] Review Material Design guidelines
- [ ] Research 2-3 competitor to-do apps (Google Keep, Microsoft To Do)
- [ ] Start sketching wireframes for main screens
- **Deliverable:** Initial wireframe sketches (low-fidelity)

**Backend Developer:**
- [ ] Set up Android Studio
- [ ] Clone repository
- [ ] Review Room database documentation
- [ ] Draft database schema (Tasks table)
- **Deliverable:** Database schema diagram (draft)

**Integration Engineer:**
- [ ] Set up Android Studio
- [ ] Clone repository
- [ ] Review MVVM architecture articles
- [ ] Create initial package structure (ui, data, domain)
- **Deliverable:** Empty package structure created

**End of Day Sync (5:00 PM):** Share progress, identify blockers

---

### Day 2: Tuesday - Core Architecture
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Complete wireframes for main task list screen
- [ ] Complete wireframes for add/edit task screen
- [ ] Share wireframes with team for feedback
- [ ] Start color palette selection (Material Design colors)
- **Deliverable:** Wireframes for 2 main screens

**Backend Developer:**
- [ ] Finalize database schema
- [ ] Create Task entity class with Room annotations
- [ ] Create TaskStatus and TaskPriority enums
- [ ] Start data model implementation
- **Deliverable:** Task entity class complete

**Integration Engineer:**
- [ ] Set up MVVM base classes
- [ ] Create ViewModel base class
- [ ] Set up navigation structure
- [ ] Create main Activity
- **Deliverable:** MVVM foundation ready

**End of Day Sync:** Review wireframes, discuss database schema

---

### Day 3: Wednesday - Design & Data Layer
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Finalize color palette (primary, secondary, accent colors)
- [ ] Define typography system (Material Design defaults)
- [ ] Start designing task list item component
- [ ] Create button and input field styles
- **Deliverable:** Color system + typography documented

**Backend Developer:**
- [ ] Complete all data model classes
- [ ] Set up Room database configuration
- [ ] Create database class with singleton pattern
- [ ] Add type converters for Date
- **Deliverable:** Room database configured

**Integration Engineer:**
- [ ] Create main task list Fragment
- [ ] Set up RecyclerView for task list
- [ ] Create TaskViewModel skeleton
- [ ] Set up LiveData observables
- **Deliverable:** Empty task list screen

**End of Day Sync:** Review color system, test database setup

---

### Day 4: Thursday - Repository & UI Components
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Complete task list item component design
- [ ] Design add/edit task form layout
- [ ] Design priority selector UI
- [ ] Design date picker integration
- **Deliverable:** All UI component designs

**Backend Developer:**
- [ ] Create TaskDao interface with CRUD operations
- [ ] Implement TaskRepository interface
- [ ] Implement TaskRepository with Room DAO
- [ ] Test basic CRUD operations
- **Deliverable:** Repository layer working

**Integration Engineer:**
- [ ] Create task item layout XML
- [ ] Create TaskAdapter for RecyclerView
- [ ] Implement basic list item UI
- [ ] Connect adapter to RecyclerView
- **Deliverable:** Task list can display items (with dummy data)

**End of Day Sync:** Review designs, test repository operations

---

### Day 5: Friday - Business Logic & Integration Prep
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Complete add/edit task screen design
- [ ] Select Material Design icons for app
- [ ] Create icon asset list
- [ ] Prepare design handoff notes for integration
- **Deliverable:** All core screen designs complete

**Backend Developer:**
- [ ] Create AddTaskUseCase
- [ ] Create UpdateTaskUseCase
- [ ] Create DeleteTaskUseCase
- [ ] Create GetAllTasksUseCase
- [ ] Add basic validation logic
- **Deliverable:** Business logic layer working

**Integration Engineer:**
- [ ] Create add/edit task Fragment
- [ ] Create add/edit task layout XML
- [ ] Create AddEditTaskViewModel
- [ ] Set up navigation to add/edit screen
- **Deliverable:** Add/edit screen exists (UI only)

**Week 1 Review (4:00 PM - 5:00 PM):**
- Demo what's built so far
- Review completed designs
- Test database operations
- Plan Week 2 tasks

**Week 1 Success Criteria:**
✅ All wireframes and designs approved  
✅ Database working with CRUD operations  
✅ Repository layer complete  
✅ Basic UI screens created  
✅ No major blockers for Week 2

---

## Week 2: Core Features Sprint (Days 8-14)
**Goal:** Implement functional CRUD operations

### Day 8: Monday - Integration Begins
**Week Planning (9:00 AM - 9:30 AM):** Review Week 2 goals

**Daily Standup (9:30 AM - 9:45 AM)**

**UI/UX Designer:**
- [ ] Export icons in all required densities
- [ ] Create app launcher icon
- [ ] Refine task list item design based on implementation feedback
- [ ] Support integration team with design questions
- **Deliverable:** All icon assets exported

**Backend Developer:**
- [ ] Implement sorting logic (by date, priority, status)
- [ ] Add filter methods to repository
- [ ] Implement CompleteTaskUseCase
- [ ] Test all use cases
- **Deliverable:** Sorting and filtering working

**Integration Engineer:**
- [ ] Connect TaskListViewModel to repository
- [ ] Implement LiveData observation in Fragment
- [ ] Display tasks from database
- [ ] Handle empty list state
- **Deliverable:** Task list shows real data from database

**End of Day Sync:** Test viewing tasks from database

---

### Day 9: Tuesday - Task Creation
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Review add/edit screen implementation
- [ ] Adjust designs if needed for technical feasibility
- [ ] Design error message states
- [ ] Design success feedback (Toast/Snackbar)
- **Deliverable:** Error state designs

**Backend Developer:**
- [ ] Add input validation to use cases
- [ ] Implement error handling
- [ ] Add success/failure return types
- [ ] Test edge cases
- **Deliverable:** Robust validation logic

**Integration Engineer:**
- [ ] Implement title and description input fields
- [ ] Implement date picker dialog
- [ ] Implement priority selector (RadioGroup/Spinner)
- [ ] Connect UI to AddEditTaskViewModel
- **Deliverable:** Add task form fully functional

**End of Day Sync:** Test creating a task end-to-end

---

### Day 10: Wednesday - Save & View Tasks
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Design task completion checkbox UI
- [ ] Design priority indicator visual
- [ ] Refine spacing and typography
- [ ] Support integration team
- **Deliverable:** Visual polish suggestions

**Backend Developer:**
- [ ] Optimize database queries
- [ ] Add indexes to frequently queried columns
- [ ] Implement task status toggle
- [ ] Support integration team
- **Deliverable:** Optimized database operations

**Integration Engineer:**
- [ ] Implement save task functionality
- [ ] Handle form validation errors
- [ ] Show success message on save
- [ ] Navigate back to list after save
- [ ] Verify task appears in list
- **Deliverable:** Can add task and see it in list

**End of Day Sync:** Full add + view flow working

---

### Day 11: Thursday - Edit & Update Tasks
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Design edit mode indicator
- [ ] Design update vs create button states
- [ ] Review edit flow UX
- [ ] Support integration team
- **Deliverable:** Edit mode designs

**Backend Developer:**
- [ ] Verify update operations work correctly
- [ ] Add created_at and updated_at timestamps
- [ ] Test concurrent updates
- [ ] Support integration team
- **Deliverable:** Reliable update operations

**Integration Engineer:**
- [ ] Implement click to edit functionality
- [ ] Load task data into edit form
- [ ] Change "Add" to "Update" button in edit mode
- [ ] Implement update task functionality
- [ ] Verify updates appear in list
- **Deliverable:** Can edit existing tasks

**End of Day Sync:** Test add + view + edit flow

---

### Day 12: Friday - Complete & Delete Tasks
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Design completed task visual state (strikethrough, grayed out)
- [ ] Design delete confirmation dialog
- [ ] Design swipe actions (if time permits)
- [ ] Final design review
- **Deliverable:** Complete/delete UI designs

**Backend Developer:**
- [ ] Implement task deletion
- [ ] Test cascading deletes (if any)
- [ ] Add soft delete option (mark as archived)
- [ ] Final repository testing
- **Deliverable:** Delete operations working

**Integration Engineer:**
- [ ] Implement task completion checkbox
- [ ] Toggle task status on checkbox click
- [ ] Update UI when task completed
- [ ] Implement delete button with confirmation
- [ ] Handle delete action
- **Deliverable:** Can complete and delete tasks

**Week 2 Review (4:00 PM - 5:00 PM):**
- Demo all CRUD operations
- Test on physical device
- Create bug list
- Plan Week 3 tasks

**Week 2 Success Criteria:**
✅ Can add new tasks  
✅ Can view all tasks  
✅ Can edit existing tasks  
✅ Can mark tasks complete  
✅ Can delete tasks  
✅ All data persists correctly

---

## Week 3: Completion Sprint (Days 15-21)
**Goal:** Polish, test, and prepare for finalization

### Day 15: Monday - Navigation & Polish
**Week Planning (9:00 AM - 9:30 AM):** Review Week 3 goals

**Daily Standup (9:30 AM - 9:45 AM)**

**UI/UX Designer:**
- [ ] Review app flow and suggest improvements
- [ ] Design loading states
- [ ] Design better empty state
- [ ] Support bug fixes
- **Deliverable:** Polish recommendations

**Backend Developer:**
- [ ] Add loading states to repository
- [ ] Implement error handling improvements
- [ ] Add data validation edge cases
- [ ] Support bug fixes
- **Deliverable:** Robust error handling

**Integration Engineer:**
- [ ] Implement proper navigation flow
- [ ] Add back button handling
- [ ] Add loading indicators
- [ ] Fix navigation bugs
- **Deliverable:** Smooth navigation

**End of Day Sync:** Test complete user flows

---

### Day 16: Tuesday - Lifecycle & Sorting
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Design sort menu/options
- [ ] Design filter UI (if time permits)
- [ ] Review UI consistency across screens
- [ ] Support integration
- **Deliverable:** Sort UI design

**Backend Developer:**
- [ ] Test sort options (date, priority)
- [ ] Implement filter by status
- [ ] Add default sort order
- [ ] Support integration
- **Deliverable:** Sorting working

**Integration Engineer:**
- [ ] Implement lifecycle handling (rotation, background)
- [ ] Save and restore instance state
- [ ] Handle configuration changes
- [ ] Implement sort menu
- [ ] Connect sort to repository
- **Deliverable:** App handles lifecycle properly

**End of Day Sync:** Test app behavior in edge cases

---

### Day 17: Wednesday - Feature Complete
**Daily Standup (9:00 AM - 9:15 AM)**

**All Team Members:**
- [ ] Fix high-priority bugs
- [ ] Test all features thoroughly
- [ ] Verify data persistence
- [ ] Test on multiple screen sizes
- [ ] Document known issues
- **Deliverable:** Feature-complete MVP

**Pair Programming Session (2:00 PM - 5:00 PM):**
- All team members test together
- Fix bugs immediately
- Verify all acceptance criteria met

**End of Day Sync:** Alpha version ready

---

### Day 18: Thursday - Bug Bash Day
**Daily Standup (9:00 AM - 9:15 AM)**

**All Team Members:**
- [ ] Dedicated testing day
- [ ] Try to break the app
- [ ] Test edge cases
- [ ] Test with real usage scenarios
- [ ] Document all bugs found
- [ ] Prioritize bugs (critical, high, medium, low)
- **Deliverable:** Comprehensive bug list

**Testing Focus Areas:**
- Empty states (no tasks)
- Many tasks (100+ tasks)
- Long task titles/descriptions
- Various date combinations
- All priority levels
- Rapid clicking/actions
- Background/foreground transitions
- App restart scenarios

**End of Day Sync:** Prioritized bug list ready

---

### Day 19: Friday - Critical Bug Fixes
**Daily Standup (9:00 AM - 9:15 AM)**

**All Team Members:**
- [ ] Fix all critical bugs (crashes, data loss)
- [ ] Fix high-priority bugs (major features broken)
- [ ] Retest fixed bugs
- [ ] Update bug list status
- [ ] Prepare for Week 4
- **Deliverable:** Stable MVP ready for finalization

**Week 3 Review (4:00 PM - 5:00 PM):**
- Demo complete MVP
- Review bug list
- Celebrate milestone! 🎉
- Plan Week 4 finalization

**Week 3 Success Criteria:**
✅ All core features working  
✅ App is stable (no crashes)  
✅ Critical bugs fixed  
✅ Ready for finalization week  
✅ Team is proud of the work!

---

## Week 4: Finalization & Presentation (Days 22-28)
**Goal:** Polish, prepare presentation, deliver demo

### Day 22: Monday - Final Polish
**Week Planning (9:00 AM - 9:30 AM):** Review presentation requirements

**Daily Standup (9:30 AM - 9:45 AM)**

**UI/UX Designer:**
- [ ] Implement empty state illustration/message
- [ ] Improve error messages text
- [ ] Check UI consistency
- [ ] Take screenshots for presentation
- **Deliverable:** Polished UI

**Backend Developer:**
- [ ] Fix medium-priority bugs
- [ ] Optimize slow queries
- [ ] Add logging for debugging
- [ ] Verify data integrity
- **Deliverable:** Stable backend

**Integration Engineer:**
- [ ] Add smooth animations
- [ ] Improve loading feedback
- [ ] Polish transitions
- [ ] Fix minor UI bugs
- **Deliverable:** Smooth UX

**End of Day Sync:** App feels polished

---

### Day 23: Tuesday - QA & Edge Cases
**Daily Standup (9:00 AM - 9:15 AM)**

**All Team Members:**
- [ ] Test all user flows again
- [ ] Test edge cases
- [ ] Verify error messages are helpful
- [ ] Test on low-end device (if available)
- [ ] Fix any new issues found
- **Deliverable:** Thoroughly tested app

**Testing Checklist:**
- [ ] Add task with minimal data
- [ ] Add task with maximum data
- [ ] Edit recently created task
- [ ] Complete and uncomplete task multiple times
- [ ] Delete task and verify it's gone
- [ ] Close and reopen app - data persists
- [ ] Fill database with 50+ tasks
- [ ] Test sort options
- [ ] Rotate device during various operations

**End of Day Sync:** App is rock solid

---

### Day 24: Wednesday - Presentation Preparation
**Daily Standup (9:00 AM - 9:15 AM)**

**UI/UX Designer:**
- [ ] Create presentation slides (title, team, features, demo, roadmap)
- [ ] Take high-quality screenshots
- [ ] Record screen recording of app (backup)
- [ ] Design presentation visuals
- **Deliverable:** Presentation slides

**Backend Developer:**
- [ ] Prepare technical architecture diagram
- [ ] Document technology choices
- [ ] Prepare to explain backend design
- [ ] Fix any remaining bugs
- **Deliverable:** Technical documentation

**Integration Engineer:**
- [ ] Create demo script (step-by-step)
- [ ] Set up demo data (realistic tasks)
- [ ] Export release APK
- [ ] Test APK on clean device
- [ ] Prepare backup demo plan (if live demo fails)
- **Deliverable:** Demo ready

**Team Meeting (2:00 PM - 4:00 PM):**
- Practice presentation together
- Each person presents their part
- Time the presentation
- Give each other feedback

**End of Day Sync:** First presentation rehearsal complete

---

### Day 25: Thursday - Rehearsal Day
**Daily Standup (9:00 AM - 9:15 AM)**

**Morning (9:30 AM - 12:00 PM):**
- [ ] Final bug fixes (critical only)
- [ ] Polish presentation slides
- [ ] Refine demo script
- [ ] Test demo multiple times

**Afternoon (2:00 PM - 5:00 PM):**
- [ ] Full presentation rehearsal
- [ ] Each team member presents their section
- [ ] Practice live demo
- [ ] Practice with backup video demo
- [ ] Time everything (aim for 15-20 minutes)
- [ ] Q&A practice
- **Deliverable:** Confident presentation

**Presentation Structure:**
1. **Introduction (2 min)** - Team, project overview
2. **Problem & Solution (2 min)** - Why this app?
3. **Features (3 min)** - What can it do?
4. **Live Demo (7 min)** - Show it working
5. **Technical Overview (3 min)** - Architecture, tech stack
6. **Future Roadmap (2 min)** - What's next?
7. **Q&A (5 min)** - Answer questions

**End of Day Sync:** Ready to present tomorrow!

---

### Day 26: Friday - Final Day Before Presentation
**Daily Standup (9:00 AM - 9:15 AM)**

**Morning (9:30 AM - 12:00 PM):**
- [ ] Final presentation rehearsal
- [ ] Test demo one more time
- [ ] Verify backup materials ready
- [ ] Check presentation equipment (projector, HDMI, etc.)
- [ ] Prepare presenter notes

**Afternoon (2:00 PM - 5:00 PM):**
- [ ] Final polish and minor fixes
- [ ] Relax and build confidence
- [ ] Review Q&A responses
- [ ] Celebrate completion of MVP! 🎊

**Evening:** Get good rest, stay confident!

---

### Day 27-28: Weekend - Presentation Ready

**Before Presentation:**
- [ ] Device fully charged
- [ ] Demo data loaded
- [ ] APK installed and tested
- [ ] Presentation slides on multiple devices
- [ ] Backup video demo ready
- [ ] Internet connection tested (if needed)
- [ ] All team members know their parts

**Backup Plans:**
- If live demo fails → Show recorded video
- If video fails → Show screenshots and explain
- If device fails → Use backup device
- If nervous → Take deep breath, slow down

**During Presentation:**
- Speak clearly and confidently
- Make eye contact
- Demonstrate enthusiasm
- Handle questions gracefully
- Support each other

**After Presentation:**
- Celebrate as a team! 🎉
- Collect feedback
- Reflect on what we learned
- Plan next steps

---

## 📊 Daily Time Allocation Guide

### Typical Developer Day (8 hours)
- **9:00 AM - 9:15 AM:** Daily standup (15 min)
- **9:15 AM - 12:00 PM:** Focused work (2h 45m)
- **12:00 PM - 1:00 PM:** Lunch break
- **1:00 PM - 3:00 PM:** Focused work (2h)
- **3:00 PM - 3:15 PM:** Break
- **3:15 PM - 5:00 PM:** Focused work (1h 45m)
- **5:00 PM - 5:15 PM:** End of day sync (15 min)
- **5:15 PM - 5:30 PM:** Update progress board

### Time Management Tips
- **Block out focus time** - Turn off notifications during coding
- **Take regular breaks** - Every 90 minutes
- **Ask for help early** - Don't stay blocked > 1 hour
- **Pair program when stuck** - Two heads are better than one
- **Test as you go** - Don't wait until end of week

---

## 🚨 What to Do When Behind Schedule

### If Behind After Day 3:
- Simplify designs further
- Use more Material Design defaults
- Cut non-essential UI polish

### If Behind After Day 10:
- Focus only on add + view tasks
- Defer edit functionality to Week 3
- Use simpler UI layouts

### If Behind After Day 17:
- Cut delete functionality
- Focus on add + view + complete only
- Use video demo instead of live demo

### Emergency Scope Reduction:
**Minimal MVP:**
- Add task (title only)
- View task list
- Mark as complete
- That's it!

---

## ✅ Daily Checklist Template

### Every Day:
- [ ] Attend daily standup
- [ ] Work on assigned tasks
- [ ] Test your changes
- [ ] Commit code with clear messages
- [ ] Update progress board
- [ ] Attend end-of-day sync
- [ ] Help teammates if they're blocked

### Every Friday:
- [ ] Demo your week's work
- [ ] Review week goals vs actual
- [ ] Plan next week's tasks
- [ ] Celebrate weekly progress

---

## 📈 Progress Tracking

### Weekly Goals Tracker

**Week 1:** 
- [ ] Designs complete
- [ ] Database working  
- [ ] Basic UI exists

**Week 2:**
- [ ] Add tasks working
- [ ] View tasks working
- [ ] Edit tasks working

**Week 3:**
- [ ] All features working
- [ ] App stable
- [ ] Bug list created

**Week 4:**
- [ ] Bugs fixed
- [ ] Presentation ready
- [ ] Demo tested

---

## 🎯 Final Thoughts

This schedule is **aggressive but achievable** with:
- Daily discipline and focus
- Strong team collaboration
- Realistic scope management
- Continuous testing and feedback
- Positive attitude and flexibility

**Remember:**
- Done is better than perfect
- Test continuously
- Help each other
- Stay focused on the goal
- Have fun building!

**You've got this! 🚀**

---

*Last Updated: 2025-11-01*  
*Timeline: 4 weeks (3 weeks MVP + 1 week finalization)*  
*Team: 3 members*
