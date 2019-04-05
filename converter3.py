###########################################################################
#
# This Python 3 script converts a hexadecimal number to base64
# @in: hexString: hexidecimal number to convert
# @out: output: the bc4 converted number
# 
# Ruth Perry April 4, 2019 For Signal Path Coding Assessment
#
##########################################################################

import codecs

hexString = raw_input("Enter hexadecimal to convert:")
output = codecs.encode(codecs.decode(hexString, 'hex'), 'base64').decode()
print(hexString + "    Converted to:    " + output)
