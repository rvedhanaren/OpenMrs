Feature: To Manage Patient Record Details By Using OpenMrs Application
Scenario: Login Functionality
Given user Must Launch The Url 
When user Must Enter The Valid Username In User Name Field
And user Must Enter The Valid Password In Password Field 
Then user Able to Select The Location
Then user Must Clik The Login Button and its Navigate to Home Page
Scenario: Register Functionality
Given verify dash Board Pages Redirected
When must Click a Regiser a Patient Menu
And user Must Enter The Patient Given Name Family Name and then Click The Next Button
And user Must Select The Patient Gender then Click The Next Button
And user Must Enter The Patient Date Of Birth then Click The Next Button
And user Must Enter The Patient Address then Click The Next Button
And user Must Enter The Patient Phone number then Click The Next Button
And user Must Click The Next Button 
Then user Must Click The Conffirm Button
Scenario: Medical Record Functionality
Given user Must Click The Start Visit Option one
When user Must Click The Confirm Button one
And user Must Click The Attachment Option
And user Must Click The Upload File Button
And user Must Redirect to Patient details Screen one
And user Must Click On End Visit Option
And user Must Click The Start Visit Option two 
Then user Must Click The Confirm Button two
And user Must Click The Capture Vitalas Option
And user Must Enter The Height in Height Field
And user Must Click The next Button three
And user Must Enter The Weight in Weight Field
And user Must Click The next Button Four
And user Must Click The Save Form Option And Then Click Save Button
And user Must Click The End Visit Option and Then click The Yes Button
Then user Must Redirect to Patient details Screen two
And user Must Click The Merge Visit Option and Select The Merge List 
And user Must Click The Merge Selected Visit and Click The Return Page
Then user Must Click The Add Past Visit then Click The Cancel Button
And  user Must Click The Delete Patient Option 
Then user Must Give The Reason And Then Click Confirm Button
And user Must Pass the Patient Id In Find Patient Record Search box 

  



