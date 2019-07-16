grammar MM;

@header {
package generated.core;
}

start: M '+' N;


M: 'M';
N: 'N';

WS  : [ \t\r\n]+ -> skip ;

