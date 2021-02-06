import { playSound } from "./oscilator";
import { Note } from "octavian";
import file from "./notes.json";

document.querySelector("button").addEventListener("click", () => {
  const mapNotes = file.notes.map((note) => {
    const { frequency } = new Note(note.chord);
    return { frequency, time: note.time };
  });
  mapNotes.forEach((note, index) => {
    setTimeout(function () {
      playSound(note.frequency, note.time);
    }, note.time);
  });
});
