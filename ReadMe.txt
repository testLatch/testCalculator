Project Configuration : 

IDE : eclipse mars  or above
Programming Language : Java 1.8
Framework: 
	1. Project Configuration : Maven   
	2. TestNG

Project Setup Instruction steps : 

	1. Download Sourcecode from GitHub Repository  : https://github.com/testLatch/testCalculator/tree/master/testCalculator
	2. Make sure eclipse has maven installed (http://www.eclipse.org/m2e/)
	3. Please install TestNG from eclipse marketplace.
	4. File --> Import Maven Project --> Select downloaded Folder (or you can directly clone from github)
	4.1 Once the project is being setup success fully please do following 
	5. Maven --> Update Project 
	6. Maven --> Clean
	
Execute TestSuite :
	1. find main-suite.xml file under testCalculator Project
	2. right click on main-suite.xml file and select run as TestNG Suite 
	3. You can execute simple TestNG test-cases by just Maven Install but It will not generate custom-emailable-report.html file.
	
	
Reports : 
	1. Once you execute main-suite.xml file as testNG report it will generate custom-emailable-report.html file under test-output Folder. 
	2. I created the custom configuration to generate Well-define report.
	3. I kept enable default TestNG reporting as well.

	
Note : 

	1. I focused on test coverage instead of writing Test case description for each test cases.  
    2. I have not included test cases like divide("a" , 6) or add("a" , 23) because my method takes Double or integer as a parameter so these kind of test-cases will give me compile time error.
	3. Possible enhancement : Code Optimization, Javadoc , parameterized test case development, better reporting etc   


	