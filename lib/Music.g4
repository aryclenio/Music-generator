grammar Music;

init: 'begin' '<' NOME '>' prog 'end' EOF;

prog: 'metro' '=' VALUE notes+;

notes: NOTE ',' TIME;

NOME: [a-z]+;
VALUE: [0-9]+;
NOTE: [A-F][2-9];
TIME: '0' ('.' [0-9] +)?;
SPACE: [ \n\t\r] -> skip;