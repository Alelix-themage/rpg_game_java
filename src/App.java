import javax.sound.sampled.*;

public class App {

    public static void beep(int hz, int durationMs, double volume) throws LineUnavailableException {
        float sampleRate = 44100; // Qualidade do som
        byte[] buffer = new byte[(int) (sampleRate * durationMs / 1000)];
        AudioFormat format = new AudioFormat(sampleRate, 8, 1, true, false);
        SourceDataLine line = AudioSystem.getSourceDataLine(format);
        
        line.open(format);
        line.start();

        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte) (Math.sin(2  Math.PI  i  hz / sampleRate)  127 * volume);
        }
        line.write(buffer, 0, buffer.length);
        line.drain();
        line.close();
    }

    public static void main(String[] args) throws Exception {
        int C = 261;  // Nota Dó (C)
        int E = 329;  // Nota Mi (E)
        int G = 392;  // Nota Sol (G)

        // Tocando a música: C - E - G - C
        beep(C, 300, 1.0);
        Thread.sleep(100);
        beep(E, 300, 1.0);
        Thread.sleep(100);
        beep(G, 300, 1.0);
        Thread.sleep(300);
        beep(C * 2, 500, 1.0); // Nota Dó oitava acima
    }
}