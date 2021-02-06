export const playMetronome = async (freq, time) => {
  await new Promise((res, rej) => {
    const context = new AudioContext();

    setInterval(() => {
      const oscillator = context.createOscillator();
      const envelope = context.createGain();

      oscillator.frequency.value = freq;
      oscillator.type = "sine";
      envelope.gain.value = 0.2;

      oscillator.connect(envelope);
      envelope.connect(context.destination);

      oscillator.start(context.currentTime);
      setTimeout(() => oscillator.stop(context.currentTime), 100);
    }, 500);
  });
};
