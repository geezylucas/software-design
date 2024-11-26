package structural.facade;

import java.io.File;

import structural.facade.complexlibrary.AudioMixer;
import structural.facade.complexlibrary.BitrateReader;
import structural.facade.complexlibrary.Codec;
import structural.facade.complexlibrary.CodecFactory;
import structural.facade.complexlibrary.MPEG4CompressionCodec;
import structural.facade.complexlibrary.OggCompressionCodec;
import structural.facade.complexlibrary.VideoFile;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");

        return result;
    }
}
