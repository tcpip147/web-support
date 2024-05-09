package com.tcpip147.websupport.css.language;

import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.tcpip147.websupport.css.language.psi.CssTypes.*;

%%

%{
  public CssLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class CssLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

At='@'
Hex=[0-9a-fA-F]
NewlineOrSpace=('\r\n' | [ \t\r\n\f])
Unicode='\\' Hex Hex? Hex? Hex? Hex? Hex? NewlineOrSpace
Escape=Unicode | '\\' ~[\r\n\f0-9a-fA-F]
Nmstart=[_a-zA-Z] | Nonascii | Escape
Nmchar=[_a-zA-Z0-9\-] | Nonascii | Escape
Comment='\/*' ~'*'* '*'+ ( ~[\/*] ~'*'* '*'+)* '\/'
Name=Nmchar+
Url=U R L '(' Whitespace ( [!#$%&*-~] | Nonascii | Escape)* Whitespace ')'
Space=[ \t\r\n\f]+
Whitespace=Space
Newline='\n' | '\r\n' | '\r' | '\f'
ZeroToFourZeros='0'? '0'? '0'? '0'?;

A='a' | 'A' | '\\' ZeroToFourZeros ('41' | '61') NewlineOrSpace
B='b' | 'B' | '\\' ZeroToFourZeros ('42' | '62') NewlineOrSpace
C='c' | 'C' | '\\' ZeroToFourZeros ('43' | '63') NewlineOrSpace
D='d' | 'D' | '\\' ZeroToFourZeros ('44' | '64') NewlineOrSpace
E='e' | 'E' | '\\' ZeroToFourZeros ('45' | '65') NewlineOrSpace
F='f' | 'F' | '\\' ZeroToFourZeros ('46' | '66') NewlineOrSpace
G='g' | 'G' | '\\' ZeroToFourZeros ('47' | '67') NewlineOrSpace | '\\g' | '\\G'
H='h' | 'H' | '\\' ZeroToFourZeros ('48' | '68') NewlineOrSpace | '\\h' | '\\H'
I='i' | 'I' | '\\' ZeroToFourZeros ('49' | '69') NewlineOrSpace | '\\i' | '\\I'
K='k' | 'K' | '\\' ZeroToFourZeros ('4b' | '6b') NewlineOrSpace | '\\k' | '\\K'
L='l' | 'L' | '\\' ZeroToFourZeros ('4c' | '6c') NewlineOrSpace | '\\l' | '\\L'
M='m' | 'M' | '\\' ZeroToFourZeros ('4d' | '6d') NewlineOrSpace | '\\m' | '\\M'
N='n' | 'N' | '\\' ZeroToFourZeros ('4e' | '6e') NewlineOrSpace | '\\n' | '\\N'
O='o' | 'O' | '\\' ZeroToFourZeros ('4f' | '6f') NewlineOrSpace | '\\o' | '\\O'
P='p' | 'P' | '\\' ZeroToFourZeros ('50' | '70') NewlineOrSpace | '\\p' | '\\P'
Q='q' | 'Q' | '\\' ZeroToFourZeros ('51' | '71') NewlineOrSpace | '\\q' | '\\Q'
R='r' | 'R' | '\\' ZeroToFourZeros ('52' | '72') NewlineOrSpace | '\\r' | '\\R'
S='s' | 'S' | '\\' ZeroToFourZeros ('53' | '73') NewlineOrSpace | '\\s' | '\\S'
T='t' | 'T' | '\\' ZeroToFourZeros ('54' | '74') NewlineOrSpace | '\\t' | '\\T'
U='u' | 'U' | '\\' ZeroToFourZeros ('55' | '75') NewlineOrSpace | '\\u' | '\\U'
V='v' | 'V' | '\\' ZeroToFourZeros ('56' | '76') NewlineOrSpace | '\\v' | '\\V'
W='w' | 'W' | '\\' ZeroToFourZeros ('57' | '77') NewlineOrSpace | '\\w' | '\\W'
X='x' | 'X' | '\\' ZeroToFourZeros ('58' | '78') NewlineOrSpace | '\\x' | '\\X'
Y='y' | 'Y' | '\\' ZeroToFourZeros ('59' | '79') NewlineOrSpace | '\\y' | '\\Y'
Z='z' | 'Z' | '\\' ZeroToFourZeros ('5a' | '7a') NewlineOrSpace | '\\z' | '\\Z'

DashChar='-' | '\\' ZeroToFourZeros '2d' NewlineOrSpace
Cdo='<!--'
Cdc='-->'
Includes='~='
DashMatch='|='
Hash='#' Name
Import=At I M P O R T
Page=At P A G E
Media=At M E D I A
Namespace=At N A M E S P A C E
Charset='@charset '
Important='!' ( Space | Comment)* I M P O R T A N T

FontRelative=Number E M | Number E X | Number C H | Number R E M
ViewportRelative=Number V W | Number V H | Number V M I N | Number V M A X
AbsLength=(Number P X | Number C M | Number M M | Number I N | Number P T | Number P C | Number Q)
Angle=(Number D E G | Number R A D | Number G R A D | Number T U R N)
Time=(Number M S | Number S)
Freq=(Number H Z | Number K H Z)
Percentage=Number '%'
Url_='url\('
UnicodeRange=([u|U] '+?' '?'? '?'? '?'? '?'? '?'? | [u|U] '+' Hex '?'? '?'? '?'? '?'? '?'? | [u|U] '+' Hex Hex '?'? '?'? '?'? '?'? | [u|U] '+' Hex Hex Hex '?'? '?'? '?'? | [u|U] '+' Hex Hex Hex Hex '?'? '?'? | [u|U] '+' Hex Hex Hex Hex Hex '?'?)
MediaOnly=O N L Y
Not=N O T
And=A N D
Resolution=(Number D P I | Number D P C M | Number D P P X)
Length=(AbsLength | FontRelative | ViewportRelative)
Dimension=(Length | Time | Freq | Resolution | Angle)
UnknownDimension=Number Ident
Nonascii=~[\u0000-\u007f]
Plus='+'
Minus='-'
Greater='>'
Comma=','
Tilde='~'
PseudoNot=':' N O T '\('
Number=([0-9]+ | [0-9]* '.' [0-9]+)

String_='\"' (~[\n\r\f\\\"] | '\\' Newline | Nonascii | Escape)* '\"' | '\'' ( ~[\n\r\f\\'] | '\\' Newline | Nonascii | Escape)* '\''
PrefixMatch='\^='
SuffixMatch='\$='
SubstringMatch='*='

FontFace=At F O N T DashChar F A C E
Supports=At S U P P O R T S
Or=O R
VendorPrefix=('-' M O Z '-' | '-' W E B K I T '-' | '-' O '-')
Keyframes=At VendorPrefix? K E Y F R A M E S
From=F R O M
To=T O
Calc='calc\('
Viewport=At V I E W P O R T
CounterStyle=At C O U N T E R DashChar S T Y L E
FontFeatureValues=At F O N T DashChar F E A T U R E DashChar V A L U E S
DxImageTransform='progid:DXImageTransform.Microsoft.' Function_
AtKeyword=At Ident
Variable='--' Nmstart Nmchar*
Var='var\('
Ident='-'? Nmstart Nmchar*
Function_=Ident '\('

%%
<YYINITIAL> {
    {Comment}   { return COMMENT; }
    {Url}   { return URL; }
    {Space}   { return SPACE; }
    {Cdo}   { return CDO; }
    {Cdc}   { return CDC; }
    {Includes}   { return INCLUDES; }
    {DashMatch}   { return DASHMATCH; }
    {Hash}   { return HASH; }
    {Import}   { return IMPORTS; }
    {Page}   { return PAGE; }
    {Media}   { return MEDIA; }
    {Namespace}   { return NAMESPACE; }
    {Charset}   { return CHARSET; }
    {Important}   { return IMPORTANT; }
    {Percentage}   { return PERCENTAGE; }
    {Url_}   { return URL_; }
    {UnicodeRange}   { return UNICODERANGE; }
    {MediaOnly}   { return MEDIAONLY; }
    {Not}   { return NOT; }
    {And}   { return AND; }
    {Dimension}   { return DIMENSION; }
    {UnknownDimension}   { return UNKNOWNDIMENSION; }
    {Plus}   { return PLUS; }
    {Minus}   { return MINUS; }
    {Greater}   { return GREATER; }
    {Comma}   { return COMMA; }
    {PseudoNot}   { return PSEUDONOT; }
    {Number}   { return NUMBER; }
    {String_}   { return STRING_; }
    {PrefixMatch}   { return PREFIXMATCH; }
    {SuffixMatch}   { return SUFFIXMATCH; }
    {SubstringMatch}   { return SUBSTRINGMATCH; }
    {FontFace}   { return FONTFACE; }
    {Supports}   { return SUPPORTS; }
    {Or}   { return OR; }
    {Keyframes}   { return KEYFRAMES; }
    {From}   { return FROM; }
    {To}   { return TO; }
    {Calc}   { return CALC; }
    {Viewport}   { return VIEWPORT; }
    {CounterStyle}   { return COUNTERSTYLE; }
    {FontFeatureValues}   { return FONTFEATUREVALUES; }
    {DxImageTransform}   { return DXIMAGETRANSFORM; }
    {AtKeyword}   { return ATKEYWORD; }
    {Variable}   { return VARIABLE; }
    {Var}   { return VAR; }
    {Ident}   { return IDENT; }
    {Function_}   { return FUNCTION_; }
}

[^] { return BAD_CHARACTER; }
