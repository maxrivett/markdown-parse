# Title

<!-- 
    This file tests a case in which there
    is text directly after the link which
    caused the algorithm to loop infinitely. 

    This was solved by checking if there is
    another open bracket after the previous
    one, and if not, the program will break
    out of the loop.
 -->

Here is a [link](www.google.com) and some more text.