#-------------------------------------------------------------------------------
# Name:        UDPPingCilent
# Author:      Joel Burdette
# Created:     23/09/2014
# Enviroment:  PyScripter
# Course:      Networks
#-------------------------------------------------------------------------------

from socket import *
import time
clientSocket = socket(AF_INET, SOCK_DGRAM)	#This creates socket
cilentSocket.settimeout(1)
data = "hello world!"
for i in range(0,10):

        clientSocket.sendto(data, ("localhost",12000))

        print "Sending request", i
        try:
            recv_data, addr = clientSocket.recvfrom(1024)
            print "ping from: ", addr, "data: ", recv_data
            InitialTime = time.clock()
            print 'RTT:', (time.clock()-InitialTime), 's'
        except:
            print "timeout"
clientSocket.close()


def main():
    pass

if __name__ == '__main__':
    main()
