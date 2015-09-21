likes(dan,sally).
likes(sally,dan).
likes(bob,alice).

dating(X, Y) :-
likes(X, Y),
likes(Y<X).

friendship(X, Y) :-
likes(X, Y);
likes(Y, X).

speed(ford, 100).
time(ford, 30).
speed(chevy, 102).
time(chevy, 21).

distance(X, Y) :- speed(X, Speed),
time(X, Time), Y is Speed * Time.
