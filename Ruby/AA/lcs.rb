=begin
Joel Burdette
Algorithms
11/10/15
LCS dynamic programming
=end

class LCS
  SELF, LEFT, UP, DIAG = [0,0], [0,-1], [-1,0], [-1,-1]

  def initialize(a, b)
    @m = Array.new(a.length) { Array.new(b.length) }
    a.each_char.with_index do |x, i|
      b.each_char.with_index do |y, j|
        compare(x, y, i, j)
      end
    end
  end

  def bs?
    bs = do_bs
    @i, @j = look(*bs)
    bs == DIAG
  end

  def val?(i=@i, j=@j)
    i >= 0 && j >= 0
  end

  def compare(c, d, i, j)
    @i, @j = i, j
    @m[i][j] = do_entry(c, d)
  end

  def look(x, y)
    [@i+x, @j+y]
  end

  def peek(x, y)
    i, j = look(x, y)
    val?(i, j) ? @m[i][j] : 0
  end

  def do_entry(c, d)
    c == d ? peek(*DIAG) + 1 : [peek(*LEFT), peek(*UP)].max
  end

  def bt
    @i, @j = @m.length-1, @m[0].length-1
    y = []
    y << @i+1 if bs? while val?
    y.reverse
  end

  def do_bs
    case peek(*SELF)
    when peek(*LEFT)
      then LEFT
    when peek(*UP)
      then UP
    else
      DIAG
    end
  end
end

def lcs(a, b)
  substring = LCS.new(a, b)
  substring.bt.map{|i| a[i]}.join
end

  puts lcs('thisisatest', 'testing123testing')
  puts lcs("studental", "letourneau")
