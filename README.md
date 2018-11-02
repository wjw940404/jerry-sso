# jerry-sso
Cas单点登录

Version：5.3.4

使用说明

一、生成https证书和导入到本地jre（证书路径根据项目所在位置不同而需要自行更改）

1、生成证书：

keytool -genkey -alias cas -keyalg RSA -keysize 2048 -keypass changeit -storepass changeit -keystore D:\jerry\cas-overlay-template\etc\cas\thekeystore -dname "CN=cas.example.org,OU=jerry.com,O=jerry,L=Guangzhou,ST=Guangdong,C=CN"

2、导出cer证书：

keytool -exportcert -alias cas -keystore D:\jerry\cas-overlay-template\etc\cas\thekeystore -file D:\jerry\cas-overlay-template\etc\cas\cas.cer -storepass changeit

3、导入证书至jre：

以管理员身份运行cmd，到此目录下执行该命令：

目录： C:\Program Files\Java\jdk1.8.0_181\jre\lib\security        // 该目录为jdk安装目录下

命令： keytool -import -alias cas -keystore ./cacerts -file “D:\jerry\cas-overlay-template\etc\cas\cas.cer”

4：将项目的整个etc文件夹拷贝到项目所在磁盘的根目录下（默认配置文件设置的路径是在项目磁盘根目录下，可以自己修改）

二、修改hosts文件（C:\Windows\System32\drivers\etc\hosts），加入下面的配置：
127.0.0.1        cas.example.org

三、配置tomcat（在/conf/server.xml中编辑），需要tomcat9

注释掉下面的配置：

    <Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />


设定http/1.1协议 还有配置keystore的位置和密码

    <Connector protocol="org.apache.coyote.http11.Http11NioProtocol"
               port="8443" maxThreads="200"
               scheme="https" secure="true" SSLEnabled="true"
               keystoreFile="D:\etc\cas\thekeystore" keystorePass="changeit"
               clientAuth="false" sslProtocol="TLS"/>
               
四、使用war命令打包，并将打包的文件放入tomcat中运行（或直接在idea里面执行run命令）

五、访问https://cas.example.org:8443/cas，如正常即显示cas登录页，用户名：casuser   密码：Mellon

