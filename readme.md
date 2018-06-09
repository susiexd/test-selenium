RemoteWebDriver服务端
```
cd config
服务端
java -jar selenium-server-standalone-3.12.0.jar -role hub
远程pc机
java -jar selenium-server-standalone-3.12.0.jar -Dwebdriver.ie.driver="C:\Program Files\internet explorer\IEDriverServer.exe" -role  webdriver -hub http://192.168.205.1:4444/grid/register/ -browser browserName=IE -port 7777

java -jar selenium-server-standalone-3.12.0.jar -Dwebdriver.firefox.bin="E:\Mozilla Firefox\firefox.exe" -role  webdriver -hub http://10.30.12.110:4444/grid/register -browser browserName=firefox -port 7777
```