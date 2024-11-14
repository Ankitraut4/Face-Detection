package com.company;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class Main {

    public static void main(String[] args) {

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        String imFile="images/WhatsAppImag.jpeg";
        Mat src= Imgcodecs.imread(imFile);

        String xmlFile="xml/lbpcascade_frontalface.xml";
        CascadeClassifier c=new CascadeClassifier(xmlFile);

        MatOfRect faceDec=new MatOfRect();
        c.detectMultiScale(src,faceDec);
        System.out.println(String.format("Detected faces: %d",
                faceDec.toArray().length));

        for (Rect re: faceDec.toArray() ){
            Imgproc.rectangle(src,new Point(re.x,re.y),new Point(re.x + re.width,re.y+re.height),
                    new Scalar(0,0,225),5);
        }

        Imgcodecs.imwrite("images/WhatsAppImag.jpeg",src);
        System.out.println("Image Detected Finished");
    }
}
