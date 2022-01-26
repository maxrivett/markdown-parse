# Title 

<!-- 
    This file tests a case in which there
    is an image file, which is similarly
    formatted to a link. We do not want to 
    count the image as a link.

    This was solved by checking if the 
    character before the first open 
    bracket is an exclamation point.
    If it is, we set a flag boolean to 
    true which will eventually prevent 
    the image from being added to the 
    ArrayList.
 -->

Look at this image I took: ![Image](png)
I hope it isn't mistaken for a link.