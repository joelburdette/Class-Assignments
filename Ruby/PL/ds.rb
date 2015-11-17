#Ruby Data structure practice
#int arrays
my_array = [1,1,3]

demo_array = [100, 200, 300, 400, 500]

print demo_array[2]

#string arrays
string_array = ["yo","werd"]

#multi-dimensional arrays
multi_d_array = [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]]

multi_d_array.each { |x| puts "#{x}\n" }

my_2d_array = [["thing", "thing"], ["thing", "thing"]]

#Hashes
my_hash = { "name" => "Eric",
  "age" => 26,
  "hungry?" => true
}

puts my_hash["name"]
puts my_hash["age"]
puts my_hash["hungry?"]
#
pets = Hash.new

pets ["bob"] = "Kinkajou"

puts pets["bob"]

#Iteration

#arrays
languages = ["HTML", "CSS", "JavaScript", "Python", "Ruby"]

languages.each { |a| puts a}

#Hashes
family = { "Homer" => "dad",
  "Marge" => "mom",
  "Lisa" => "sister",
  "Maggie" => "sister",
  "Abe" => "grandpa",
  "Santa's Little Helper" => "dog"
}

friends.each { |x| puts "#{x}" }
family.each { |x, y| puts "#{x}: #{y}" }

secret_identities = {
  "The Batman" => "Bruce Wayne",
  "Superman" => "Clark Kent",
  "Wonder Woman" => "Diana Prince",
  "Freakazoid" => "Dexter Douglas"
}
  
  secret_identities.each do |item, price|
      puts "#{item}: #{price}"
  end

  lunch_order = {
  "Ryan" => "wonton soup",
  "Eric" => "hamburger",
  "Jimmy" => "sandwich",
  "Sasha" => "salad",
  "Cole" => "taco"
}

lunch_order.each do |key,value|
    puts "#{value}"
end
