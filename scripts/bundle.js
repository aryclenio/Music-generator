const context = new AudioContext();

document.querySelector("button").addEventListener("click", () => {
  const freq = [80, 540, 1000, 340];
  freq.forEach((freq, index) => {
    setTimeout(function () {
      const oscillator = context.createOscillator();
      const envelope = context.createGain();
      const decayRate = 1.5; // seconds

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
      setTimeout(() => oscillator.stop(context.currentTime), decayRate * 1000);
    }, index * 2000);
  });
});
