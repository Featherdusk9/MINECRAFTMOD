MINECRAFT MOD
=============

Java Installation
-----------------

1. Download Openjdk17 https://jdk.java.net/17/. 
2. Extract the file. 
3. Create a folder in C:\Program Files\Java\ 
4. Move the jdk-17.0.1.jdk file into the folder
5. Set the path (for windows) 
   - Select Control Panel and then System.
   - Click Advanced and then Environment Variables.
   - Select path -> edit -> New -> browse -> jdk-17.0.1.jdk -> bin
6. Set correct version of Java in your preferred IDE

Git Installation (Only for Windows)
----------------

1. Install git for windows https://git-scm.com/downloads
2. Control panel -> Systems and security -> System -> Advanced System settings -> Advanced -> environment variables -> Select path -> edit -> New -> browse -> git folder -> bin
3. Go to user folder
4. create a Git folder 
5. Use commandline and go inside your git folder
6. `git clone https://github.com/Featherdusk9/MinecraftMod.git`
7. `cd MinecraftMod`
8. `git checkout -b <name>-dev` for example `git checkout -b vib-dev` This creates a new branch
9. `git pull` to make sure the branch is up to date
10. You can use `git branch` to see all the branches you have on your local machine
11. You can use `git status` to see any changes that have been made to files 

**To Push Changes**

1. `git status` to see your changes
2. `git add .` to add all your changes
3. `git commit -m "<your message>"` to commit your changes
4. `git push origin <name of your local branch>` to push changes
5. Go to Git on the web and create a pull request 
6. Add one reviewer to look over what changes you've made
7. Merge after reviewed 
8. Notify others to pull when master has been changed 

Setting up and Building 
-----------------------
1. First before adding project to IDE go to command line
2. Go to folder where MinecraftMod is
3. If on Windows
   - `gradlew gen<name of IDE>Runs` for example (gradlew genEclipseRuns) (gradlew genIntellijRuns) (gradlew genVSCodeRuns)
4. If on Mac
   - `./gradlew gen<name of IDE>Runs` for example (./gradlew genEclipseRuns) (./gradlew genIntellijRuns) (./gradlew genVSCodeRuns)
5. If using Eclipse do `gradlew eclipse` or `./gradlew eclipse`

**Eclipse**
https://www.eclipse.org/downloads/
1. When first launching Eclipse: Java 11 + Vm should be 17.0.1
2. Go to Preferences -> Java -> Installed JREs 
3. Make sure it is set to a version of Java 17 
4. Import Project
5. gradle -> existing project -> Browse folder
6. Find the folder of MinecraftMod
7. next -> Override workspace settings
8. Make sure Gradle Wrapper is selected 
9. Select Java home -> browse -> your folder that java 17 is stored in
10. Make sure preview loads so that it means that no errors will occur
<img width="429" alt="Screen Shot 2021-12-21 at 1 40 48 AM" src="https://user-images.githubusercontent.com/90982699/146883696-7ebba45c-b064-4244-a93b-5e23ad398f14.png">

11. Finish 
12. Go to run configurations 
13. Click on Java Application
14. To run program select _runClient_

**Intellij**
https://www.jetbrains.com/idea/download/#section=windows
1. Open and browse for MinecraftMod folder
2. If prompted select Gradle Project
3. Right Click Project and select _Project Structure_
4. Make sure Project SDK is some version of Java 17
<img width="530" alt="Screen Shot 2021-12-21 at 1 47 55 AM" src="https://user-images.githubusercontent.com/90982699/146884521-bf88b56f-2a2a-4898-a5f0-87af4917a5a7.png">
5. To run the project select runClient which should be already set up in the top right corner
<img width="787" alt="Screen Shot 2021-12-21 at 1 48 30 AM" src="https://user-images.githubusercontent.com/90982699/146884582-6c34165c-c0af-447a-a630-db7cfd680e33.png">

**VSCode**
https://code.visualstudio.com/download
1. Get Java Extension Pack 
2. Open and browse for MinecraftMod folder
3. Confirm the version of Java used in VSCode
4. Run without debugging to run program 


If your branch is behind the Master
-----------------------------------
1. git checkout master
2. git pull origin master
3. git checkout BranchNameBehindCommit(your branch)
4. git merge master // Now your branch is in sync with local Master branch
5. git push origin branchBehindCommit






