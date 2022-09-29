### Important remembering things

**For current directory path make variable user.dir**

`public static String currentDir = System.getProperty("user.dir");`

*now currentDir represent a current directory.*

**For new line in mac-os**

`"\r"`

**For dynamic name for file**
`currentDir +"/screenshots/" + System.currentTimeMillis()+ ".png"`

*+ System.currentTimeMillis() + is represents a dynamic numbering name.*

**For launching the browser without driver.exe file**

*Use WebDriverManager Class dependency*

<dependency>
	<groupId>io.github.bonigarcia</groupId>
	<artifactId>webdrivermanager</artifactId>
	<version>5.0.3</version>
</dependency>

`WebDriverManager.chromedriver().setup();`

`WebDriver driver = new ChromeDriver();` 


**For setup chrome driver in mac machine**

copy the chromedriver exec file and paste */usr/local/bin* folder then use