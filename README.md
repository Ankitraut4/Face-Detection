# Face-Detection Project


This project detects the number of faces in an image using OpenCV's Java library. The program reads an image file, detects faces within the image, and outputs the image with rectangles around detected faces.

Table of Contents
    
    Introduction
    
    Setup
    
    Code Explanation
    
    About OpenCV
    
    Algorithm Used


Introduction

The goal of this project is to identify and count the number of faces in an image using the OpenCV library. OpenCV provides a robust set of tools for image processing, which makes it well-suited for face detection tasks.


Setup

1]Clone the repository.

2]Download and set up the OpenCV library for Java in your project.

3]Place your target image in the images/ directory,  (or modify the code to read any image file).

4]Ensure the xml/lbpcascade_frontalface.xml classifier file is included. This is used for the face detection algorithm.


Code Explanation - 
The code includes the following steps:

1. Load OpenCV's Native Library: 
System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
This line loads the OpenCV native library required for all OpenCV operations in Java.

2. Load the Image: 
The code reads an image file using Imgcodecs.imread(), which loads it as a matrix of pixel values.

3. Initialize the Face Classifier:
The classifier, CascadeClassifier, is loaded from an XML file that contains the pre-trained data for detecting frontal faces.

4. Detect Faces:
Using detectMultiScale(), the classifier scans the image for faces, returning an array of rectangles where faces are found.

5. Draw Rectangles Around Faces:
For each detected face, a red rectangle is drawn around it using Imgproc.rectangle().

6. Save and Display Results:
The program saves the modified image to the specified directory and prints the number of faces detected.

About OpenCV

OpenCV (Open Source Computer Vision) is a popular library for computer vision tasks, including face detection, object tracking, and image processing. It supports multiple programming languages, including C++, Python, and Java. OpenCV’s Java library enables seamless integration with Java projects, making it ideal for applications in image processing.

Algorithm Used

This project uses the LBP (Local Binary Patterns) Cascade Classifier to detect faces in images. The LBP method is a fast, efficient algorithm that recognizes patterns in facial features and compares them to patterns in a trained classifier file (lbpcascade_frontalface.xml). The classifier contains pre-trained data on common facial features, allowing the algorithm to identify faces with high accuracy.

