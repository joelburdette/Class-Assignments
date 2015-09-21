=begin
Joel Burdette
Dr. Rouse
Programming Languages 
4/13/15
Ruby Programming Exercises
=end

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
