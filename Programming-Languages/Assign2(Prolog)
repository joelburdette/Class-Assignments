/*Joel Burdette, Dr. Rouse, Programming Languages, 2/1/15 */
/*Facts*/
father_fact(isaac, abraham).
father_fact(jacob, isaac).
father_fact(judas, jacob).
father_fact(phares, judas).
father_fact(zara, judas).
father_fact(esrom, phares).
father_fact(aram, esrom).
father_fact(aminadab, aram).
father_fact(naasson, aminadab).
father_fact(salmon, naasson).
father_fact(boaz, salmon).
father_fact(obed, boaz).
father_fact(jesse, obed).
father_fact(david, jesse).
father_fact(solomon, david).
father_fact(roboam, solomon).
father_fact(abia, roboam).
father_fact(asa, abia).
father_fact(jehoshaphat, asa).
father_fact(joram, jehoshaphat).
father_fact(ozias, joram).
father_fact(joatham, ozias).
father_fact(achaz, joatham).
father_fact(ezekias, achaz).
father_fact(manasses, ezekias).
father_fact(amon, manasses).
father_fact(josiah, amon).
father_fact(jechoniah, josiah).
father_fact(shealtiel, jechoniah).
father_fact(zorobabel, shealtiel).
father_fact(abiud, zorobabel).
father_fact(eliakim, abiud).
father_fact(azor, eliakim).
father_fact(sadoc, azor).
father_fact(achim, sadoc).
father_fact(eliud, achim).
father_fact(eleazar, eliud).
father_fact(matthan, eleazar).
father_fact(jacob, matthan).
father_fact(joseph, jacob).
father_fact(jesus, god).

female_fact(zara).
female_fact(bathseba).
female_fact(mary).
female_fact(ruth).

mother_fact(obed, ruth).
mother_fact(solomon, bathseba).
mother_fact(jesus, mary).
	
	/*Derived logic rules
	For father, query father(son, Y).
	For son, query son(father, Y).
	For grandfather, query grandfather(son,Y).
	For sibling, query sibling(X, Y).
	For mother, query mother(son, Y).
	For female, query female(Y).*/
	father(X, Y) :- father_fact(X,Y), format('~a\'s father is ~a', [X, Y]).
	father(X, Y) :- \+father_fact(X,Y), format('~a\'s father is unknown',[X]).
	son(X,Y) :- father_fact(Y,X),  \+female_fact(Y), format('~a\'s son is ~a', [X, Y]).
	son(X,Y) :- \+ father_fact(Y,X), format('~a had no sons', [X]).
	sibling(X,Y) :- father_fact(X,Z), father_fact(Y,Z), \+ (X=Y), format('~a\'s sibling is ~a', [X, Y]).
	grandfather(X,Y) :- father_fact(X,Z), father_fact(Z,Y), format('~a\'s grandfather is ~a', [X, Y]).
	grandfather(X,Y) :- \+ father_fact(X,Z), father_fact(Z,Y), format('~a\'s grandfather is unknown', [X]).
	grandfather(X,Y) :- father_fact(X,Z), \+ father_fact(Z,Y), format('~a\'s grandfather is unknown', [X]).
	mother(X, Y) :- mother_fact(X,Y), format('~a\'s mother is ~a', [X, Y]).
	mother(X, Y) :- \+mother_fact(X,Y), format('~a\'s mother is unknown',[X]).
	female(X):- forall(female_fact(X), format('~a ~n',[X])).
