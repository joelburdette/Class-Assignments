=begin
Joel Burdette
Algorithms
10/27/15
Order Statistic problem
=end
def sort!(list)
    quick(list,0,list.size-1, com = 0)
  end

  def quick(list, l, r, com)
    if l < r
      com += 1
      piv = part(list, l, r)
      quick(list, l, piv-1, com)
      quick(list, piv+1, r, com)
    end
    $comArray << com
    list
  end

  def part(list, l, r)
    x = list[r]
    i = l-1
    for j in l..r-1
      if list[j] <= x
        i += 1
        list[i], list[j] = list[j], list[i]
      end
    end
    list[i+1], list[r] = list[r], list[i+1]
    i+1
  end

$comArray = Array.new
array = Array.new
10000.times do
  array << rand(20000)
end
sort!(array)
$comArray.sort!()
puts "min = #{$comArray[0]} comparisons"
puts "max = #{$comArray[$comArray.length - 1]} comparisons"
puts "avg = #{$comArray[$comArray.length / 2]} comparisons"
