#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Joel Burdette
#
# Created:     30/09/2014
# Copyright:   (c) Joel Burdette 2014
# Licence:     <your licence>
#-------------------------------------------------------------------------------

from socket import *
mailserver = 'mail.letu.edu'
clientSocket = socket(AF_INET, SOCK_STREAM)
clientSocket.connect((mailserver, 5789))
recv = clientSocket.recv(1024)
print recv
if recv[:3] != '220':
    print '220 reply not received from server.'

#Send HELO command and print server response
heloCommand = 'HELO \r\n'
clientSocket.send(heloCommand)
recv1 = clientSocket.recv(1024)
print recv1
if recv1[:3] != '250':
    print '250 reply not received from server.'

#Send MAIL FROM command and print server response.
#Start, end
#command = "STARTSMTP\r\n"
#clientSocket.send(command)
#recvdiscard = clientSocket.recv(1024)
#print recvdiscard
clientSocket.send("MAIL From: joelburdette04@gmail.com\r\n")
recv2 = clientSocket.recv(1024)
print recv2
if recv2[:3] != '250':
    print '250 reply not received from server.'

# Send RCPT TO command and print server response.
#command = "STARTTLS\r\n"
#clientSocket.send(command)
recvdiscard = clientSocket.recv(1024)
print recvdiscard
clientSocket.send("RCPT To: joelburdette04@gmail.com\r\n")
recv2 = clientSocket.recv(1024)
print recv2
if recv2[:3] != '250':
    print '250 reply not received from server.'
# Send DATA command and print server response.
command = "DATA\r\n"
clientSocket.send(command)
recvdiscard = clientSocket.recv(1024)
print recvdiscard
clientSocket.send("DATA: joelburdette04@gmail.com\r\n")
recv2 = clientSocket.recv(1024)
print recv2
if recv2[:3] != '250':
    print '250 reply not received from server.'
# Send message data.
#recv5 = clientSocket.recv(1024)
#print recv5
#if recv5[:3] != '250':
#    print '250 reply not received from server.'
clientSocket.close()
