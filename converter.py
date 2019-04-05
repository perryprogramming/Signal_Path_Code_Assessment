###########################################################################
#
# This Python 2 script converts a hexadecimal number to base64
# @in: hexString: hexidecimal number to convert
# @out: output: the bc4 converted number
# 
# Ruth Perry April 4, 2019 For Signal Path Coding Assessment
#
##########################################################################

import binascii

hexString = raw_input("Enter hexadecimal to convert:")
output = binascii.b2a_base64(hexString.decode("hex"))
print(hexString + "    Converted to:    " + output)
