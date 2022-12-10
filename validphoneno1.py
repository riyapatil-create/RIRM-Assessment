 import re

num = input('Enter a mobile number to validate: ')

Pattern = re.compile("[7-9][0-9]{9}")

if Pattern.match(num):
    print('Valid Mobile Number')
else:
	print("Invalid Mobile Number")