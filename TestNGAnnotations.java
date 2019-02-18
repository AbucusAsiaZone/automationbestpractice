public class TestNGAnnotations{

@Test
public void test1(){
System.out.println("Test1");
}

@Test
public void test2(){
System.out.println("Test2");
}

@BeforeTest
public void beforeTest(){
System.out.println("BeforeTest");
}

@AfterTest
public void afterTest(){
System.out.println("BeforeTest");
}

@BeforeMethod
public void beforeMethod(){
System.out.println("BeforeMethod");
}

@AfterMethod
public void afterMethod(){
System.out.println("AfterMethod");
}

@BeforeClass
public void beforeClass(){
System.out.println("BeforeClass");
}

@AfterClass
public void afterClass(){
System.out.println("AfterClass");
}

@BeforeSuite
public void beforeSuite(){
System.out.println("BeforeSuite");
}

@AfterSuite
public void afterClass(){
System.out.println("AfterSuite");
}

//---------------Execution order of Annotarions-------------
/**
BeforeSuite
BeforeTest
BeforeClass
BeforeMethod
Test1
AfterMethod
BeforeMethod
Test2
AfterMethod
AfterClass
AfterTest
AfterSuite

*/
