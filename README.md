# AWS class with Test Driven Development (TDD)
**Worke done without commits to GitHub will not be graded.**

Try to *check* the *checkboxes* as you go, and commit changes to the Readme.md as well.

## Part 1
There are a few tests that are not finished. And so, you will have a few tasks here.
You will make frequent commits:
* Create one test, and make sure it fails
* Commit to GitHub
* Write your code to pass the test
* Commit to GitHub
## Part 2
* [x] Create a GitHub action to run your tests from Part 1
## Part 3 
* [x] You will use the TDD technique for this part, remember to create a test before you implement the method; commit to GitHub every working change you make
* [x] Create a method **removeBiggerThan(int threshold)** the AWS class that will remove all values bigger than a **threshold** that you send and return the number of removed values; use FILLER_VALUE to replace removed values
* [x] Create unit tests for **removeBiggerThan(int threshold)**
* [x] Create a method **stepMultiplier()** in the AWS class that will multiply all values less than 10 by 2, and all values that are less than 20 and bigger than 10 by 4, and all values that are less than 100 and bigger than 20 by 100;
* [x] Create a unit tests for **stepMultiplier()**



First commit :  1. corrected testFillAndExpandWithNegative() testcase
		2. added testRemoveBiggerThanFail() testcase which fails
		3. added testStepMultiplierFail() testcase which fails

Second commit : 1. added testRemoveBiggerThan() test
                2. added testStepMultiplier() test


Third commit : added testRemoveBiggerThan(int threshold) method to AWS.java  and checked the check box in part 3.

Fourth commit : added stepMultiplier() method to AWS.java  and checked the check box in part 3.

Fifth commit : corrected the testGetValues() test

commit 6 : corrected the testSetValues() test

commit 7 : corrected the testToString() test
