import { Note } from "octavian";

const playSound = async (freq, time, chord) => {
  await new Promise((res, rej) => {
    document.querySelector("#textMusic").style.display = "flex";
    document.querySelector("#noteMusic").innerText = chord;

    const context = new AudioContext();
    const oscillator = context.createOscillator();
    const envelope = context.createGain();
    const decayRate = time;

    oscillator.frequency.value = freq;
    oscillator.type = "sine";
    envelope.gain.value = 1;

    oscillator.connect(envelope);
    envelope.connect(context.destination);

    oscillator.start(context.currentTime);
    envelope.gain.exponentialRampToValueAtTime(
      0.00001,
      context.currentTime + decayRate
    );
    setTimeout(
      () => (oscillator.stop(context.currentTime), res()),
      decayRate * 1000
    );
  });
};

export const initSound = (notes) => {
  document.querySelector("#playMusic").addEventListener("click", async () => {
    const mapNotes = notes.map((note) => {
      const { frequency } = new Note(note.chord);
      return { chord: note.chord, frequency, time: note.time };
    });
    for (const note of mapNotes) {
      await playSound(note.frequency, note.time, note.chord);
      document.querySelector("#textMusic").style.display = "none";
    }
  });
};