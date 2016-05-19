# spring-boot-gradle-heroku-demo

This is a sample application for quick start development of the Spring Boot application using IntelliJ IDEA and publish it on Heroku.

You can run or debug it locally. Just choose "local app" configuration within IDEA and click Run or Debug.

Also you can run it with Gradle. Just type a command:
```bash
gradle bootRun
```

When it is started locate your browser to [http://localhost:8080](http://localhost:8080).

## Heroku deployment

This project is configured for Heroku deployment. You have to clone this repository:
```bash
git clone https://github.com/sreym/spring-boot-gradle-heroku-demo.git
cd spring-boot-gradle-heroku-demo
```

Then you have to create an Heroku app:
```bash
heroku create
```

And after this you can deploy it:
```bash
git push heroku master
```

## Using it without IntelliJ IDEA Ultimate Edition (plain text editor?)

Initialization that you have to do once. There are git clone, creating heroku app and creating Postgres addon.

```bash
git clone https://github.com/sreym/spring-boot-gradle-heroku-demo.git
cd spring-boot-gradle-heroku-demo
git checkout database
heroku create
heroku addons:create heroku-postgresql
```

For local running type the next command: 
```bash
DATABASE_URL=`heroku config:get DATABASE_URL` ./gradlew bootRun
```
After this you can locate your browser to [http://localhost:8080](http://localhost:8080).

For publish on herokuapp:
```bash
git commit -a -m "There are lots of changes in this patch..."
git push heroku database:master
```
After this you can type ```heroku open``` and it will open browser for your server.
