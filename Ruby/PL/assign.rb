=begin
Joel Burdette
Dr. Rouse
Programming Languages 
4/13/15
Ruby Programming Exercises
=end
def occurrences (list,key) #Task 1, occurrences takes the array and the key.
  freq = Hash.new(0) #Creates a hash that will store array values and their count.
  list.each{|list| freq[list] += 1} #For each array value, increment its occurrence.
  puts freq["#{key}"] #Print key's occurrence.
end

def sort! (list) #Takes the array.
  for i in 0..list.size-2 #First comparator loop.
    min = i #Base case
    for j in i+1..list.size-1 #Second comparator loop
      min = j if list[j] < list[min] #Compare the current min with the next value in the array.
    end
    list[i], list[min] = list[min], list[i] #If less than, swap places.
  end
end

def num_smaller (list,key) #Task 2, takes the array.
  sort!(list) #sort list first
  count = 0  #Initialize count
  list.each do |list| #Parse list
    if list == key #compare current value to key.
      print count # print count
    end
	count += 1 #Increment count
  end
end

def second_smallest (list) #Task 3, takes the array.
  sort!(list) #sort the list first
  puts list[1] #Print the second smallest element
end

def dsort! (list) #Task 4, takes the array.
  for i in 0..list.size-2 #First comparator loop.
    min = i #Base case
    for j in i+1..list.size-1 #Second comparator loop
      min = j if list[j] < list[min] #Compare the current min with the next value in the array.
    end
    list[i], list[min] = list[min], list[i] #If less than, swap places.
  end
  puts list #print the sorted list
end
