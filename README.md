This is reproducer to show JDK libraries are getting failed to provide messages in localized languages. To test it in JBoss EAP 8 follow below steps. 
add JAVA_OPTS in standalone.conf as below -Duser.language=de -Duser.country=DE -Duser.timezone=Europe/Berlin -DLANG=de_DE.UTF-8.
In the Bean.java, give some local path for a file called fruit.xml in Mar() and Unmar() methods.
Build the project. 
start JBoss EAP 8. 
deploy the project. 
In the Bean.java, give some local path for a file called fruit.xml in Mar() and Unmar() methods.
Click the Marshal button in the jsp. This will create a file "fruit.xml" in the path given in Bean.java.
Edit that file and make some xml mistake. eg. remove a "/" from somewhere.
Then hit the "Unmarshal" button in the browser. 
You should see getMessage and getLocalizedMessage both in German in the JBoss EAP server logs.
Expected output is that getMessage should be in english and getLocalizedMessage in German. 
