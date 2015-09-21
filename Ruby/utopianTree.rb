
#Utopian Tree
t = gets.to_i #Test Cases
array = []
(0...t).each do |i|
  array.push(gets.to_i)
end

(0...array.length).each do |i| #Cycle amount
  height=1 #Starts at 1m
  cycle=0
  (0...array[i]).each do
    if cycle % 2 == 0
      height = height * 2
    else
      height += 1      
    end
    cycle += 1
  end
  puts height
end
