export const playSound = async (freq, time) => {
  await new Promise((res, rej) => {
    const context = new AudioContext();

    const oscillator = context.createOscillator();
    const envelope = context.createGain();
    const decayRate = time * 1000; // seconds

    oscillator.frequency.value = freq;
    oscillator.type = "sine";
    envelope.gain.value = 1;

    oscillator.connect(envelope);
    envelope.connect(context.destination);

    oscillator.start(context.currentTime);
    envelope.gain.exponentialRampToValueAtTime(
      0.001,
      context.currentTime + decayRate
    );
    setTimeout(() => (oscillator.stop(context.currentTime), res()), decayRate);
  });
};
