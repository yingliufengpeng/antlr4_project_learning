grammar MM;

@header {
package generated.core;
}

start: ID ADD ID
//    | M '-' N
    ;

id: ID;

M: 'M';
N: 'N';

ADD: '+';

ID: [_|a-z|A-Z] [a-z|A-Z|0-9]*;

WS  : [ \t\r\n]+ -> skip ;

