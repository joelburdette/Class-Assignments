=begin
Joel Burdette
Algorithms
=end
Village = Struct.new(:x, :y, :name)

def distance(p1, p2)
  Math.hypot(p1.x - p2.x, p1.y - p2.y).round(3)
end

def bruteforce(villages)
  mindist, minpts = Float::MAX, []
  villages.combination(2) do |pi,pj|
    dist = distance(pi, pj)
    if dist < mindist
      mindist = dist
      minpts = [pi, pj]
    end
  end
  [mindist, minpts]
end

def recursive(villages)
  return bruteforce(villages) if villages.length <= 3
  xP = villages.sort_by(&:x)
  mid = villages.length / 2
  xm = xP[mid].x
  dL, pairL = recursive(xP[0,mid])
  dR, pairR = recursive(xP[mid..-1])
  dmin, dpair = dL<dR ? [dL, pairL] : [dR, pairR]
  yP = xP.find_all {|p| (xm - p.x).abs < dmin}.sort_by(&:y)
  closest, closestPair = dmin, dpair
  0.upto(yP.length - 2) do |i|
    (i+1).upto(yP.length - 1) do |k|
      break if (yP[k].y - yP[i].y) >= dmin
      dist = distance(yP[i], yP[k])
      if dist < closest
        closest = dist
        closestPair = [yP[i], yP[k]]
      end
    end
  end
  [closest, closestPair]
end

puts "How many villages are there?"
num = gets.chomp
villages = Array.new
for i in 1..num.to_i
puts "Please enter village #{i}"
value = gets.chomp.split(" ")
village = Village.new(value[0].to_i, value[1].to_i, value[2].to_s)
villages << village
end
puts recursive(villages)
