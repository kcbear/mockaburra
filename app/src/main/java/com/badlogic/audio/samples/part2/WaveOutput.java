package com.badlogic.audio.samples.part2;

import com.badlogic.audio.io.AudioDevice;
import com.badlogic.audio.io.WaveDecoder;

import java.io.FileInputStream;

import static mockaburra.file.FileUtils.getFileInputStream;

/**
 * A simple example how to read in a Wave file via
 * a {@link WaveDecoder} and output its contents to
 * an {@link AudioDevice}.
 *
 * @author mzechner
 */
public class WaveOutput {
    public static void main(String[] argv) throws Exception {
        FileInputStream input = getFileInputStream(WaveOutput.class, "samples/sample.wav");

        AudioDevice device = new AudioDevice();
        WaveDecoder decoder = new WaveDecoder(input);
        float[] samples = new float[1024];

        while (decoder.readSamples(samples) > 0) {
            device.writeSamples(samples);
        }
    }
}
