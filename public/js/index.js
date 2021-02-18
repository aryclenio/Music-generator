import "core-js/stable";
import "regenerator-runtime/runtime";
import file from "../out/notes.json";
import { initSound } from "./sound";
import { initMetronome } from "./metronome";

document.getElementById("music-name").innerText = file.name;
initMetronome(file.metronome);
initSound(file.notes);
