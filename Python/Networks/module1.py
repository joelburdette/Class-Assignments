#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Joel Burdette
#
# Created:     9/10/2014
# Copyright:   (c) Joel Burdette 2014
# Licence:     <your licence>
#-------------------------------------------------------------------------------

from socket import*

sSock = socket(AF_INET, SOCK_STREAM)
sSock.bind(("",6789))
sSock.listen(1)

while True:
    print "Ready to serve"
    conSocket, addr = sSock.accept()
    msg = conSocket.recv(1024)
    filename = msg.split()[1]
    f = open(filename[1:])
    output = f.read()
try:
    conSocket.send("HTTP/1.1 200 OK \r\n\r\n".encode())
    conSocket.send(output.encode())
    conSocket.close()
except IOError:
    conSocket.send("HTTP/1.1 404 Not Found \r\n\r\n".encode())
    conSocket.send("<html><body>404 Not Found<\body><\html> \r\n\r\n".encode())
    conSocket.close()
def main():
    if __name__== '__main__':
        main()
