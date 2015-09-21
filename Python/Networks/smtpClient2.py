#-------------------------------------------------------------------------------
# Name:        SMTP
# Course:      Networks COSC 3603
# Author:      Joel Burdette
# Created:     01/10/2014
# Environment: Pyscripter
# Description: Simple socket SMTP mail client
#-------------------------------------------------------------------------------
from socket import *
import smtplib
msg = "\r\n I love computer networks!"
endmsg = "\r\n.\r\n"
#Create mailserver and call it mailserver.
mailserver = 'smtp.gmail.com'
mailport = 587
fromaddr = 'joelburdette05@gmail.com'
toaddrs  = 'joelburdette05@gmail.com'
username = 'joelburdette05'
password = 'Mypass0414'
server = smtplib.SMTP('smtp.gmail.com:587')
server.starttls()
server.login(username,password)
server.sendmail(fromaddr, toaddrs, msg)
server.quit()
#Create Socket called clientSocket and establish TCP connection with mailserver.
clientSocket = socket(AF_INET, SOCK_STREAM)
clientSocket.connect((mailserver, mailport))

recv = clientSocket.recv(1024)
print recv
if recv[:3] != '220':
    print '220 reply not received from server.'
#Send HELO command and print server response
heloCommand = 'HELO Alice\r\n'
clientSocket.send(heloCommand)
recv1 = clientSocket.recv(1024)
print recv1
if recv1[:3] != '250':
    print '250 reply not received from server.'
#Send MAIL FROM command and print server response.
fromCommand = "<joelburdette@letu.edu>\r\n"
clientSocket.send(fromCommand)
recv1 = clientSocket.recv(1024)
print recv1
if recv1[:3] != '250':
    print '250 reply not received from server.'
#Send RCPT TO command and print server response.
toCommand = "<joelburdette@letu.edu>\r\n"
clientSocket.send(toCommand)
recv1 = clientSocket.recv(1024)
print recv1
if recv1[:3] != '250':
    print '250 reply not received from server.'
#Send DATA command and print server response.
dataCommand = "Data"
print dataCommand
clientSocket.send(dataCommand)
recv1 = clientSocket.recv(1024)
print recv1
if recv1[:3] != '250':
    print '250 reply not received from server.'
#Send message data.
clientSocket.send(msg + endmsg)
print recv1
if recv1[:3] != '250':
    print '250 reply not received from server.'
#Send Quit command and get server response.
quitCommand = "Quit\r\n"
print quitCommand
clientSocket.send(quitCommand)
recv1 = clientSocket.recv(1024)
print recv1
if recv1[:3] != '250':
    print '250 reply not received from server.'
clientSocket.close()
