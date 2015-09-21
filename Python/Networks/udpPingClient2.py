#-------------------------------------------------------------------------------
# Name:        UDPPingCilent
# Author:      Joel Burdette
# Created:     23/09/2014
# Environment: PyScripter
# Course:      Networks COSC 3603
# Description: basic ping cilent with timeout and rtt
#-------------------------------------------------------------------------------

from socket import *
import time
clientSocket = socket(AF_INET, SOCK_DGRAM)	#This creates socket
clientSocket.settimeout(1) #timeout is 1 second
data = "hello world!"
for i in range(0,10): # 10 packets
        clientSocket.sendto(data, ("localhost",12000))
        InitialTime = time.clock() #start timer
        print "Sending request", i
        try:
            recv_data, addr = clientSocket.recvfrom(1024)
            print "ping from: ", addr, "data: ", recv_data
            print 'RTT:', (time.clock()-InitialTime), 's' #stop timer and print rtt
        except: #if rtt is greater than timeout(1), timeout
            print i,"timed out"
clientSocket.close()
def main():
    pass
if __name__ == '__main__':
    main()
