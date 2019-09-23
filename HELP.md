# Getting Started

### Initial Steps & Requirements

 **At this point we assume you already have a Working Github Account Setup**
   
 1. you should be able to successfully Login into your account

#### Setting up Git

    1. Download and install the latest version of Git
    https://github.com/git-for-windows/git/releases/download/v2.23.0.windows.1/Git-2.23.0-64-bit.exe

##### Forking the sample repository in your accounts. 

    1. On GitHub, navigate to https://github.com/miguelcoca/SimpleMVC.git repository.
    2. In the top-right corner of the page, click Fork.
    3. Fork button
    4. That's it! Now, you have a fork of the original octocat/Spoon-Knife repository.

##### Step 2: Create a local clone of your fork

      Right now, you have a fork of the SimpleMVC repository, 
      but you don't have the files in that repository on your computer. 
      Let's create a clone of your fork locally on your computer.
      
      1. On GitHub, navigate to your fork of the SimpleMVC repository.
      2. Under the repository name, click Clone or download.
      3. In the Clone with HTTPs section, click  to copy the clone URL for the repository.
      4. Open CMD Terminal.
      5. Type git clone, and then paste the URL you copied earlier. 
         It will look like this, with your GitHub username instead of YOUR-USERNAME:     
      
              $ git clone https://github.com/YOUR-USERNAME/SimpleMVC
         
         Press Enter. Your local clone will be created.
      
              $ git clone https://github.com/YOUR-USERNAME/SimpleMVC
              > Cloning into `Spoon-Knife`...
              > remote: Counting objects: 10, done.
              > remote: Compressing objects: 100% (8/8), done.
              > remove: Total 10 (delta 1), reused 10 (delta 1)
              > Unpacking objects: 100% (10/10), done.
              Now, you have a local copy of your fork of the SimpleMVC repository! 

#### Now lets get started by creating a new file.

    Open the sample project in your IDE.
    Start adding a new controller file that will be mapped to a "/helloworld" URL and it 
    should return "Hello world" String in the Browser the controller class 
    should be named as "MVCSimpleController.java" and it should contain a 
    "public String Welcome()" method

#### Once you have the new class files we will precede as follows

    git status
    git add MVCSimpleController.java
    git commit -m "my first commit"
    git push -u origin master

