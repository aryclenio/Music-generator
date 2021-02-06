import "core-js/stable";
import "regenerator-runtime/runtime";
import { playSound } from "./oscilator";
import { Note } from "octavian";
import file from "./notes.json";

document.querySelector("button").addEventListener("click", async () => {
  const mapNotes = file.notes.map((note) => {
    const { frequency } = new Note(note.chord);
    return { frequency, time: note.time };
  });
  for (const note of mapNotes) {
    await playSound(note.frequency, note.time);
  }
});
