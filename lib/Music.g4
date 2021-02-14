grammar Music;

prog: '{' met '}' EOF;

met: '"metronome": ' VALUE "," notes;

notes: '"notes": ' '[' chord ']';

chord: '{' '"chord": ' CHORDVALUE ',' time '}' ','| '{' '"chord": ' CHORDVALUE ',' time '} ;

time: "time": ' TIMEVALUE;

VALUE: [0-9]+;
CHORDVALUE: [A-F][2-9];
TIMEVALUE: '0' ('.' [0-9] +)?;