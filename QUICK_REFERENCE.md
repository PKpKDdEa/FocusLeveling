# Focus Leveling MVP - Quick Reference Guide

## 🎯 Mission
Build a functional Android To-Do List MVP in **4 weeks** (3 weeks development + 1 week finalization) and deliver a presentation.

---

## ⏰ Timeline At-a-Glance

| Week | Days | Goal | Deliverable |
|------|------|------|-------------|
| **Week 1** | 1-7 | Foundation | Designs, Database, Architecture |
| **Week 2** | 8-14 | Core Features | Add, View, Edit tasks working |
| **Week 3** | 15-21 | Completion | All features, Bug fixes, Stable MVP |
| **Week 4** | 22-28 | Finalization | Polish, Testing, Presentation |

---

## ✅ MVP Must-Have Features

1. **Add Task** - Create new tasks with title, description, due date, priority
2. **View Tasks** - Display list of all tasks
3. **Complete Task** - Mark tasks as done/undone
4. **Edit Task** - Modify existing tasks
5. **Delete Task** - Remove tasks
6. **Persist Data** - Save to local database (Room)
7. **Clean UI** - Simple, functional Material Design interface

---

## 👥 Team Roles & Focus

### 🎨 UI/UX Designer
**What:** Design screens, color system, components  
**How:** Simplified designs, Material Design defaults, Figma  
**Key:** Speed over perfection, support integration team

### 💻 Backend Developer
**What:** Database, repository, business logic  
**How:** Room database, MVVM pattern, clean architecture  
**Key:** Simple schema, reliable CRUD operations

### 🔗 Integration Engineer
**What:** Connect UI with backend, implement features  
**How:** ViewModels, LiveData, RecyclerView, navigation  
**Key:** Get it working, test continuously

---

## 📋 Priority Issues (Must Complete)

### Week 1 (6 issues)
- #1: Wireframes (2d) 🎨
- #2: Color System (1d) 🎨
- #8: Database Schema (1.5d) 💻
- #9: Room Setup (2d) 💻
- #11: Data Models (1d) 💻
- #16: MVVM Setup (1.5d) 🔗

### Week 2 (7 issues)
- #3: Task Item Design (1d) 🎨
- #4: Add/Edit Screen Design (1.5d) 🎨
- #10: Repository (1.5d) 💻
- #12: Business Logic (2d) 💻
- #15: Sorting (1d) 💻
- #17: Main Screen (2.5d) 🔗
- #18: Add/Edit Screen (2.5d) 🔗

### Week 3 (5 issues)
- #5: Icons (0.5d) 🎨
- #20: Integration (2d) 🔗
- #21: Navigation (1.5d) 🔗
- #27: Lifecycle (1d) 🔗
- #29: Final Testing (2d) 🔗

### Week 4 (Finalization)
- Bug fixes
- UI polish
- Empty states
- Presentation prep

---

## 🚫 What We're Cutting (Post-MVP)

- Interactive prototype (#6)
- Dependency injection framework (#13)
- Data backup/export (#14)
- Task detail screen (#19)
- Notifications (#22)
- Search functionality (#23)
- Automated tests (#24, #25)
- Settings screen (#26)
- Performance optimization (#28)
- CI/CD pipeline (#30)

---

## 📅 Daily Routine

### Every Morning
- **9:00 AM:** Daily standup (15 min)
  - What did I do yesterday?
  - What will I do today?
  - Any blockers?

### During Day
- Focus on assigned tasks
- Test your changes
- Ask for help if blocked > 1 hour
- Commit code regularly

### Every Evening
- **5:00 PM:** End-of-day sync (15 min)
- Update progress board
- Plan tomorrow's work

### Every Friday
- **4:00 PM:** Week review & demo (1 hour)
- Celebrate progress
- Plan next week

---

## 🔄 Weekly Milestones

### Week 1 Checkpoint
✅ Designs approved  
✅ Database working  
✅ Basic UI exists  
✅ No blockers

### Week 2 Checkpoint
✅ Add tasks working  
✅ View tasks working  
✅ Edit tasks working  
✅ Data persists

### Week 3 Checkpoint
✅ All features complete  
✅ App is stable  
✅ Bug list created  
✅ Ready for finalization

### Week 4 Checkpoint
✅ Bugs fixed  
✅ App polished  
✅ Presentation ready  
✅ Demo tested

---

## 🚨 Emergency Scope Reduction

### If Behind After Day 10
Cut: Edit functionality → Focus on Add + View only

### If Behind After Day 17
Cut: Delete functionality → Focus on Add + View + Complete only

### Absolute Minimum MVP
- Add task (title only)
- View task list
- Mark as complete
- Done!

---

## 🎯 Key Success Factors

1. **Clear Priorities** - Focus ruthlessly on must-haves
2. **Daily Progress** - Make visible progress every day
3. **Test Continuously** - Don't wait until the end
4. **Ask for Help Early** - Don't stay blocked
5. **Team Collaboration** - Help each other succeed
6. **Realistic Expectations** - Good enough > Perfect
7. **Positive Attitude** - Celebrate small wins

---

## 📊 Technical Stack

**Platform:** Android (Kotlin)  
**Architecture:** MVVM  
**Database:** Room (SQLite)  
**UI:** Material Design Components  
**Design:** Figma  
**Version Control:** Git + GitHub

---

## 📖 Essential Documentation

1. **[PROJECT_PLAN.md](./PROJECT_PLAN.md)** - Complete 4-week plan
2. **[WEEK_BY_WEEK_SCHEDULE.md](./WEEK_BY_WEEK_SCHEDULE.md)** - Daily breakdown
3. **[TEAM_KICKOFF_CHECKLIST.md](./TEAM_KICKOFF_CHECKLIST.md)** - Getting started
4. **[MVP_TODO_APP_ISSUES.md](./MVP_TODO_APP_ISSUES.md)** - Detailed issue specs

---

## 🆘 When Things Go Wrong

### Problem: Behind schedule
**Solution:** Cut scope, focus on essentials, pair program

### Problem: Technical blocker
**Solution:** Try simpler approach, ask team, Google/Stack Overflow

### Problem: Design-dev mismatch
**Solution:** Simplify design, pragmatic compromise

### Problem: Integration issues
**Solution:** Define clear interfaces, use mock data, pair program

### Problem: Bugs everywhere
**Solution:** Stop adding features, fix bugs first, test more

---

## 💡 Quick Tips

- **Use Material Design defaults** - Don't reinvent the wheel
- **Test on device** - Not just emulator
- **Commit frequently** - Save your work
- **Write clear code** - You'll thank yourself later
- **Document weird fixes** - Future you will appreciate it
- **Take breaks** - Fresh mind = better code
- **Help teammates** - Teach and learn together

---

## 🎉 Celebration Plan

- **End of Week 1:** Team dinner
- **End of Week 2:** Team lunch
- **End of Week 3:** Big celebration - MVP done!
- **After Presentation:** Epic team party! 🎊

---

## ✅ Week 1 Checklist

### Day 1 (Monday)
- [ ] Kickoff meeting
- [ ] Set up dev environments
- [ ] Start wireframes / schema / architecture

### Day 2 (Tuesday)
- [ ] Complete wireframes
- [ ] Create data models
- [ ] Set up MVVM structure

### Day 3 (Wednesday)
- [ ] Finalize color system
- [ ] Configure Room database
- [ ] Create main screen

### Day 4 (Thursday)
- [ ] Complete UI designs
- [ ] Implement repository
- [ ] Add task list UI

### Day 5 (Friday)
- [ ] Complete designs
- [ ] Complete business logic
- [ ] Week 1 demo

---

## 🎤 Presentation Outline (Week 4)

1. **Introduction** (2 min) - Team & project
2. **Problem** (2 min) - Why this app?
3. **Features** (3 min) - What it does
4. **Live Demo** (7 min) - Show it working!
5. **Tech Stack** (3 min) - How it's built
6. **Roadmap** (2 min) - What's next
7. **Q&A** (5 min)

**Total: 20-25 minutes**

---

## 📞 Communication

**Daily:** Slack/Discord for quick questions  
**Standup:** 9:00 AM every weekday  
**Weekly:** Friday 4:00 PM review  
**Urgent:** Call/text for blockers

---

## 🏁 Bottom Line

**Timeline:** 4 weeks  
**Goal:** Working MVP + Presentation  
**Strategy:** Ruthless focus on essentials  
**Success:** Team delivers a demo-able app on time  

**You got this! 🚀**

---

*Quick Reference v1.0*  
*Last Updated: 2025-11-01*  
*For detailed information, see PROJECT_PLAN.md*
