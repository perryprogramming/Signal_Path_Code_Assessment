# Signal_Path_Code_Assessment

Adrian and team,

Below are some notes on my responses and solutions to the Platform Engineering Code Assessment:


The coding assessment I took was: https://github.com/SignalPath/CodeTests/blob/master/platform.md

There are seperate files for each part of the coding assessment.

language_rank.txt includes my rankings of the languages listed.

There are two python scripts that convert a hexadecimal string to base64: converter.py is for python 2, and converter3.py is for python 3.  Both files can be run from the command line: python <file>  The script will prompt for hexadecimal string input and will display the converted string as output.
  
SpecialMath.scala is the conversion of specialMath.py as described in the assessment and below:

import sys

def specialMath(n):
	if(n==0):
		return 0
	elif(n==1):
		return 1
	return n + specialMath(n-1)	+ specialMath(n-2)

print specialMath(int(sys.argv[1]))

The scala file can be compiled and ran from the command line: scalac SpecialMath.scala; scala SpecialMath.scala
This file will also prompt for integer input from the command line and will display the output.


Thank you for your time and consideration,

Ruth Perry
