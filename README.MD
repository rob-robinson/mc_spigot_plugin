# Minecraft Plugin Testing ...

## works in IntelliJ Community Edition, and Spigot server...

This repo is for my own use to moving from machine to another machine with ease ...

The setup for this project is based on the setup that Kody Simpson uses for plugin development in the video series [Spigot Plugin Development (youtube playlist)](https://www.youtube.com/playlist?list=PLfu_Bpi_zcDNEKmR82hnbv9UxQ16nUBF7)

This setup also assumes you have:
* the [Spigot Server](https://www.spigotmc.org/wiki/spigot-installation/) installed.
* [Maven](https://maven.apache.org/download.cgi) installed

```
mvn verify

# cp ./target/hello-1.0-SNAPSHOT.jar /mc-spigot/plugins/

# stop spigot
> stop

# start spigot

java -Xms512M -Xmx1G -XX:+UseConcMarkSweepGC -jar /mc-spigot/spigot-1.14.4.jar

```