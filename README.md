# JAVA APPLET 

It can be executed by browsers running under many platforms, including Linux, Windows, Mac Os etc.


#  SUPPORT : 
Applets support jdk-8 and lower.


# NOT SUPPORTED : 
As of September, 2018, Firefox no longer offers a version which supports NPAPI(the technology required to run Java applets).Also 
Google's Chrome version 45 and above have dropped support for NPAPI, and therefore Java Plugin do not work on these browsers anymore.


# LIFE CYCLE : 

init(): is used to initialized the Applet. It is invoked only once.

start(): is invoked after the init() method or browser is maximized. It is used to start the Applet.

paint(Graphics g): is used to paint the Applet. It provides Graphics class object that can be used for drawing oval, rectangle, arc etc.

stop(): is used to stop the Applet. It is invoked when Applet is stop or browser is minimized.

destroy(): is used to destroy the Applet. It is invoked only once.
