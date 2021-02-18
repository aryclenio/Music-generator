let metronome, count;

const playMetronome = async (time) => {
  await new Promise((res, rej) => {
    const context = new AudioContext();

    metronome = setInterval(() => {
      const oscillator = context.createOscillator();
      const envelope = context.createGain();

      oscillator.frequency.value = 440;
      oscillator.type = "sine";
      envelope.gain.value = 0.4;

      oscillator.connect(envelope);
      envelope.connect(context.destination);
      oscillator.start(context.currentTime);
      envelope.gain.exponentialRampToValueAtTime(
        0.00001,
        context.currentTime + time / 1000
      );
      setTimeout(() => (oscillator.stop(context.currentTime), time), 100);
    }, time);
  });
};

export const stopMetronome = () => clearInterval(metronome);

export const initMetronome = (time) => {
  document
    .querySelector("#playMetronome")
    .addEventListener("click", async () => {
      document.querySelector("#textMetronome").style.display = "flex";

      switch (time) {
        case 16:
          playMetronome(250);
        case 8:
          playMetronome(500);
        case 4:
          playMetronome(1000);
      }
    });

  document
    .querySelector("#pauseMetronome")
    .addEventListener("click", async () => {
      stopMetronome();
      document.querySelector("#textMetronome").style.display = "none";
    });
};
