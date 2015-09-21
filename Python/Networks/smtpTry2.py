#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Joel Burdette
#
# Created:     01/10/2014
# Copyright:   (c) Joel Burdette 2014
# Licence:     <your licence>
#-------------------------------------------------------------------------------
import smtplib
import email.utils
from email.mime.text import MIMEText

# Create the message
msg = MIMEText('Allison I got my program to work!')
msg['To'] = email.utils.formataddr(('Recipient', 'allisonloggins@letu.edu'))
msg['From'] = email.utils.formataddr(('Author', 'allisonloggins@letu.edu'))
msg['Subject'] = 'Simple test message'

server = smtplib.SMTP('mail.letu.edu')
server.set_debuglevel(True) # show communication with the server
try:
    server.sendmail('allisonloggins@letu.edu', ['allisonloggins@letu.edu'], msg.as_string())
finally:
    server.quit()
