# Music-generator

Music generator is an Domain Specific Language created to transform music notes into an web page that plays music on the web.

# Necessary technologies

- NodeJS > 12
- Yarn
- Java
- Antlr4

# Project Structure

Bellow, you can see the project structure with the main files and folders

```
├── lib/                   - Contins the implementation of Music8 DSL
├──── test/                - Contains the .ms files with examples of music files readed by the main class
├──── Music.g4             - Main antlr grammar file
├──── MusicConverter.java  - Java class interpreter that reads file and gives a json output understandable by server
├── public/                - Contains the main page that will handle the Javascript files and note convertion.
├──── js/                  - Contains js files
├──────── sound.js         - File responsible to convert json notes to WebAudio API frequency
├──────── metronome.js     - File responsible to start a metronome on the specific time interpolation
├──── css/                 - Contains css files
├──── out/                 - Contains the MusicConverter.java json output
├── .gitignore             - Git config to exclude folders that don't need to be in git.
├── LICENSE                - MIT license.
├── package.json           - NPM file that scructure project dependencies.
├── webpack.config.js      - Webpack server config file
```

# Available scripts

In the project directory, you can run:

```console
yarn start
```

Starts the server that provides a web page using webpack.

```console
yarn grammar
```

Run the antlr file that compiles the grammar Music.g4

```console
yarn compile
```

Compile every java class inside the project and outputs it in the lib folder.

```console
yarn test
```

Run the Java class MusicConverter that outputs a json file in public/out folder

```console
yarn grun
```

Run grun command that outputs a tree with the music.ms file.
