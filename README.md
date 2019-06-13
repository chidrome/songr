# songr
This repo holds a "RESTful" spring server with multiple get routes.

## Architecture

#### Main Files
  * [HelloWorldController.java](./src/main/java/com/chidrome1/lab11/Songr/Controllers/HelloWorldController.java)
  * [ShowAlbumController.java](./src/main/java/com/chidrome1/lab11/Songr/Controllers/ShowAlbumController.java)
  
#### Test Files
  * [HelloWorldControllerTest.java](./src/test/java/com/chidrome1/lab11/Songr/HelloWorldControllerTest.java)

## Usage
-`git clone repo`
- Open terminal, and run this command: `./gradlew bootRun`
  
#### Routes
* `/`: will return `Home Stub Route`
* `/hello`: will return `Hello World`
* `/capitalize/{input words here}`: will return  the words that you inputed capitalized. 
  * Ex. `/capitalize/{hello world}`       output: `HELLO WORLD`
* `/reverse?sentence=Your sentence here`: will return the sentence you you inputted in reverse
  * Ex. `/reverse?sentence=Hello world` output: `world Hello`
* `/albums`: will display all albums in database
  * includes POST route to add new albums to the database and redirects to `/albums` to display