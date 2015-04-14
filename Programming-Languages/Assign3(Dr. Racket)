#lang racket
;Joel Burdette Dr. Rouse Programming Languages 3/6/15

;.1 Returns volume of circle with x parameter radius
(define (volume x) (* x x x 4/3 3.14159)) 

;.2 Returns real and complex roots of with a, b, & c coef w/ if func.
(define (ifRoots a b c)
  (define disc (sqrt (- (* b b)
     (* 4.0 a c))))
  (define root1 (/ (- (- b) disc)
     (* 2.0 a)))
  (define root2 (/ (+ (- b) disc)
     (* 2.0 a)))
  (print root1)
  (if (not(real? root1))(print " complex roots")
  (unless (equal? root1 root2)(print root2))))

;3. Same as 2, but uses cond function
(define (condRoots a b c)
  (define disc (sqrt (- (* b b)
     (* 4.0 a c))))
  (define root1 (/ (- (- b) disc)
     (* 2.0 a)))
  (define root2 (/ (+ (- b) disc)
     (* 2.0 a)))
  (print root1)
  (cond [(not(real? root1))(print " complex roots")]
        [(unless(equal? root1 root2)(print root2))]))

;4. Returns a parameter raised to the b parameter power
(define (power a b) 
  (expt a b))

;6. Returns min followed by max values of list parameter
(define (minMax lst)
  (list (apply min lst) (apply max lst)))
