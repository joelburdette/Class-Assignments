#Ruby Loops and Iterators practice
#while
counter = 1
while counter < 11
  puts counter
  counter = counter + 1 # or counter += 1
end

#infinite loops!
i = 0
while i < 5
  puts i
#...increment i!
end

#until
counter = 1
until counter == 10
  puts counter
  counter += 1
end

#for 
um = 10
for num in 1...um #... means exclusive, will not print 10
  puts num
end

for num in 1..15 # inclusive, will print 15
  puts num
end

#loop method
i = 20
loop do
  i -= 1
  print "#{i}"
  break if i <= 0
end

i = 20
loop do
  i -= 1
  next if i % 2 == 1 # skips certain steps
  print "#{i}"
  break if i <= 0
end

#array iteration
array = [1,2,3,4,5]

array.each do |x|
  x += 10
  print "#{x}"
end

#manipulation
odds = [1,3,5,7,9]
odds.each do |x| 
    print x * 2
end

#.times iterator
10.times {print "chunky"}
