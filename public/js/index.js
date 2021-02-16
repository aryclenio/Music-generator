import "core-js/stable";
import "regenerator-runtime/runtime";
import file from "../out/notes.json";
import { initSound } from "./sound";
import { initMetronome } from "./metronome";

initMetronome(file.metronome);
initSound(file.notes);
