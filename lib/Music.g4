grammar Music;

init: begin prog 'end' EOF;

begin: 'begin' '<' NAME '>';

prog: metro notes+;

metro: 'metro' VALUE 'times';

notes: 'play' NOTE TIME;

NAME: [a-zA-Z]+;
VALUE: [0-9]+;
NOTE: [A-G] '#'? [2-9];
TIME: [0-9]+ ('.' [0-9]+)?;
SPACE: [ \n\t\r] -> skip;