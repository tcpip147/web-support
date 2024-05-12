package com.tcpip147.websupport.css.language;

import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;

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

// private symbols
AT="@"
HEX=[0-9a-fA-F]
NEW_LINE_OR_SPACE=("\r\n" | [ \t\r\n\f])?
UNICODE="\\" {HEX} {HEX}? {HEX}? {HEX}? {HEX}? {HEX}? {NEW_LINE_OR_SPACE}
ESCAPE={UNICODE} | "\\" [^\r\n\f0-9a-fA-F]
NMSTART=[_a-zA-Z] | {NON_ASCII} | {ESCAPE}
NMCHAR=[_a-zA-Z0-9\-] | {NON_ASCII} | {ESCAPE}
NAME={NMCHAR}+
WHITESPACE={SPACE}?
NEWLINE="\n" | "\r\n" | "\r" | "\f"
ZERO_TO_FOUR_ZEROS="0"? "0"? "0"? "0"?
A="a" | "A" | "\\" {ZERO_TO_FOUR_ZEROS} ("41" | "61") {NEW_LINE_OR_SPACE}
B="b" | "B" | "\\" {ZERO_TO_FOUR_ZEROS} ("42" | "62") {NEW_LINE_OR_SPACE}
C="c" | "C" | "\\" {ZERO_TO_FOUR_ZEROS} ("43" | "63") {NEW_LINE_OR_SPACE}
D="d" | "D" | "\\" {ZERO_TO_FOUR_ZEROS} ("44" | "64") {NEW_LINE_OR_SPACE}
E="e" | "E" | "\\" {ZERO_TO_FOUR_ZEROS} ("45" | "65") {NEW_LINE_OR_SPACE}
F="f" | "F" | "\\" {ZERO_TO_FOUR_ZEROS} ("46" | "66") {NEW_LINE_OR_SPACE}
G="g" | "G" | "\\" {ZERO_TO_FOUR_ZEROS} ("47" | "67") {NEW_LINE_OR_SPACE} | "\\g" | "\\G"
H="h" | "H" | "\\" {ZERO_TO_FOUR_ZEROS} ("48" | "68") {NEW_LINE_OR_SPACE} | "\\h" | "\\H"
I="i" | "I" | "\\" {ZERO_TO_FOUR_ZEROS} ("49" | "69") {NEW_LINE_OR_SPACE} | "\\i" | "\\I"
K="k" | "K" | "\\" {ZERO_TO_FOUR_ZEROS} ("4b" | "6b") {NEW_LINE_OR_SPACE} | "\\k" | "\\K"
L="l" | "L" | "\\" {ZERO_TO_FOUR_ZEROS} ("4c" | "6c") {NEW_LINE_OR_SPACE} | "\\l" | "\\L"
M="m" | "M" | "\\" {ZERO_TO_FOUR_ZEROS} ("4d" | "6d") {NEW_LINE_OR_SPACE} | "\\m" | "\\M"
N="n" | "N" | "\\" {ZERO_TO_FOUR_ZEROS} ("4e" | "6e") {NEW_LINE_OR_SPACE} | "\\n" | "\\N"
O="o" | "O" | "\\" {ZERO_TO_FOUR_ZEROS} ("4f" | "6f") {NEW_LINE_OR_SPACE} | "\\o" | "\\O"
P="p" | "P" | "\\" {ZERO_TO_FOUR_ZEROS} ("50" | "70") {NEW_LINE_OR_SPACE} | "\\p" | "\\P"
Q="q" | "Q" | "\\" {ZERO_TO_FOUR_ZEROS} ("51" | "71") {NEW_LINE_OR_SPACE} | "\\q" | "\\Q"
R="r" | "R" | "\\" {ZERO_TO_FOUR_ZEROS} ("52" | "72") {NEW_LINE_OR_SPACE} | "\\r" | "\\R"
S="s" | "S" | "\\" {ZERO_TO_FOUR_ZEROS} ("53" | "73") {NEW_LINE_OR_SPACE} | "\\s" | "\\S"
T="t" | "T" | "\\" {ZERO_TO_FOUR_ZEROS} ("54" | "74") {NEW_LINE_OR_SPACE} | "\\t" | "\\T"
U="u" | "U" | "\\" {ZERO_TO_FOUR_ZEROS} ("55" | "75") {NEW_LINE_OR_SPACE} | "\\u" | "\\U"
V="v" | "V" | "\\" {ZERO_TO_FOUR_ZEROS} ("56" | "76") {NEW_LINE_OR_SPACE} | "\\v" | "\\V"
W="w" | "W" | "\\" {ZERO_TO_FOUR_ZEROS} ("57" | "77") {NEW_LINE_OR_SPACE} | "\\w" | "\\W"
X="x" | "X" | "\\" {ZERO_TO_FOUR_ZEROS} ("58" | "78") {NEW_LINE_OR_SPACE} | "\\x" | "\\X"
Y="y" | "Y" | "\\" {ZERO_TO_FOUR_ZEROS} ("59" | "79") {NEW_LINE_OR_SPACE} | "\\y" | "\\Y"
Z="z" | "Z" | "\\" {ZERO_TO_FOUR_ZEROS} ("5a" | "7a") {NEW_LINE_OR_SPACE} | "\\z" | "\\Z"
DASH_CHAR="-" | "\\" {ZERO_TO_FOUR_ZEROS} "2d" {NEW_LINE_OR_SPACE}
FONT_RELATIVE={NUMBER} {E} {M} | {NUMBER} {E} {X} | {NUMBER} {C} {H} | {NUMBER} {R} {E} {M}
VIEWPORT_RELATIVE={NUMBER} {V} {W} | {NUMBER} {V} {H} | {NUMBER} {V} {M} {I} {N} | {NUMBER} {V} {M} {A} {X}
ABS_LENGTH= {NUMBER} {P} {X} | {NUMBER} {C} {M} | {NUMBER} {M} {M} | {NUMBER} {I} {N} | {NUMBER} {P} {T} | {NUMBER} {P} {C} | {NUMBER} {Q}
ANGLE={NUMBER} {D} {E} {G} | {NUMBER} {R} {A} {D} | {NUMBER} {G} {R} {A} {D} | {NUMBER} {T} {U} {R} {N}
TIME={NUMBER} {M} {S} | {NUMBER} {S}
FREQ={NUMBER} {H} {Z} | {NUMBER} {K} {H} {Z}
RESOLUTION={NUMBER} {D} {P} {I} | {NUMBER} {D} {P} {C} {M} | {NUMBER} {D} {P} {P} {X}
LENGTH={ABS_LENGTH} | {FONT_RELATIVE} | {VIEWPORT_RELATIVE}
NON_ASCII=[^\u0000-\u007f]
VENDOR_PREFIX="-" {M} {O} {Z} "-" | "-" {W} {E} {B} {K} {I} {T} "-" | "-" {O} "-"

// public symbols
COMMENT="/*" [^*]* "*"+ ([^/*] [^*]* "*"+)* "/"
URL={U} {R} {L} "(" {WHITESPACE} ([\!#\$%&\*\-\~] | {NON_ASCII} | {ESCAPE})* {WHITESPACE} ")"
SPACE=[ \t\r\n\f]+
CDO="<!--"
CDC="-->"
INCLUDES="~="
DASH_MATCH="|="
HASH="#" {NAME}
IMPORT={AT} {I} {M} {P} {O} {R} {T}
PAGE={AT} {P} {A} {G} {E}
MEDIA={AT} {M} {E} {D} {I} {A}
NAMESPACE={AT} {N} {A} {M} {E} {S} {P} {A} {C} {E}
CHARSET="@charset "
IMPORTANT="!" ({SPACE} | {COMMENT})* {I} {M} {P} {O} {R} {T} {A} {N} {T}
PERCENTAGE={NUMBER} "%"
URL_="url("
UNICODE_RANGE=[u|U] "+?" "?"? "?"? "?"? "?"? "?"?
             |[u|U] "+" {HEX} "?"? "?"? "?"? "?"? "?"?
             |[u|U] "+" {HEX} {HEX} "?"? "?"? "?"? "?"?
             |[u|U] "+" {HEX} {HEX} {HEX} "?"? "?"? "?"?
             |[u|U] "+" {HEX} {HEX} {HEX} {HEX} "?"? "?"?
             |[u|U] "+" {HEX} {HEX} {HEX} {HEX} {HEX} "?"?

MEDIA_ONLY={O} {N} {L} {Y}
NOT={N} {O} {T}
AND={A} {N} {D}
DIMENSION={LENGTH} | {TIME} | {FREQ} | {RESOLUTION} | {ANGLE}
UNKNOWN_DIMENSION={NUMBER} {IDENT}
PLUS="+"
MINUS="-"
GREATER=">"
COMMA=","
TILDE="~"
PSEUDO_NOT=":" {N} {O} {T} "("
NUMBER=[0-9]+ | [0-9]* "." [0-9]+
STRING_="\"" ([^\n\r\f\"] | "\\" {NEWLINE} | {NON_ASCII} | {ESCAPE})* "\""
       |"'" ([^\n\r\f\"] | "\\" {NEWLINE} | {NON_ASCII} | {ESCAPE})* "'"

PREFIX_MATCH="^="
SUFFIX_MATCH="$="
SUBSTRING_MATCH="*="
FONT_FACE={AT} {F} {O} {N} {T} {DASH_CHAR} {F} {A} {C} {E}
SUPPORTS={AT} {S} {U} {P} {P} {O} {R} {T} {S}
OR={O} {R}
KEY_FRAMES={AT} {VENDOR_PREFIX}? {K} {E} {Y} {F} {R} {A} {M} {E} {S}
FROM={F} {R} {O} {M}
TO={T} {O}
CALC="calc("
VIEWPORT={AT} {V} {I} {E} {W} {P} {O} {R} {T}
COUNTER_STYLE={AT} {C} {O} {U} {N} {T} {E} {R} {DASH_CHAR} {S} {T} {Y} {L} {E}
FONT_FEATURE_VALUES={AT} {F} {O} {N} {T} {DASH_CHAR} {F} {E} {A} {T} {U} {R} {E} {DASH_CHAR} {V} {A} {L} {U} {E} {S}
DX_IMAGE_TRANSFORM="progid:DXImageTransform.Microsoft." {FUNCTION_}
AT_KEYWORD={AT} {IDENT}
VARIABLE="--" {NMSTART} {NMCHAR}*
VAR="var("
IDENT="-"? {NMSTART} {NMCHAR}*
FUNCTION_={IDENT} "("

%%

<YYINITIAL> {
  {COMMENT}                 { return COMMENT; }
  {URL}                     { return URL; }
  {SPACE}                   { return SPACE; }
  {CDO}                     { return CDO; }
  {CDC}                     { return CDC; }
  {INCLUDES}                { return INCLUDES; }
  {DASH_MATCH}              { return DASH_MATCH; }
  {HASH}                    { return HASH; }
  {IMPORT}                  { return IMPORT; }
  {PAGE}                    { return PAGE; }
  {MEDIA}                   { return MEDIA; }
  {NAMESPACE}               { return NAMESPACE; }
  {CHARSET}                 { return CHARSET; }
  {IMPORTANT}               { return IMPORTANT; }
  {PERCENTAGE}              { return PERCENTAGE; }
  {URL_}                    { return URL_; }
  {UNICODE_RANGE}           { return UNICODE_RANGE; }
  {MEDIA_ONLY}              { return MEDIA_ONLY; }
  {NOT}                     { return NOT; }
  {AND}                     { return AND; }
  {DIMENSION}               { return DIMENSION; }
  {UNKNOWN_DIMENSION}       { return UNKNOWN_DIMENSION; }
  {PLUS}                    { return PLUS; }
  {MINUS}                   { return MINUS; }
  {GREATER}                 { return GREATER; }
  {COMMA}                   { return COMMA; }
  {TILDE}                   { return TILDE; }
  {PSEUDO_NOT}              { return PSEUDO_NOT; }
  {NUMBER}                  { return NUMBER; }
  {STRING_}                 { return STRING_; }
  {PREFIX_MATCH}            { return PREFIX_MATCH; }
  {SUFFIX_MATCH}            { return SUFFIX_MATCH; }
  {SUBSTRING_MATCH}         { return SUBSTRING_MATCH; }
  {FONT_FACE}               { return FONT_FACE; }
  {SUPPORTS}                { return SUPPORTS; }
  {OR}                      { return OR; }
  {KEY_FRAMES}              { return KEY_FRAMES; }
  {FROM}                    { return FROM; }
  {TO}                      { return TO; }
  {CALC}                    { return CALC; }
  {VIEWPORT}                { return VIEWPORT; }
  {COUNTER_STYLE}           { return COUNTER_STYLE; }
  {FONT_FEATURE_VALUES}     { return FONT_FEATURE_VALUES; }
  {DX_IMAGE_TRANSFORM}      { return DX_IMAGE_TRANSFORM; }
  {AT_KEYWORD}              { return AT_KEYWORD; }
  {VARIABLE}                { return VARIABLE; }
  {VAR}                     { return VAR; }
  {IDENT}                   { return IDENT; }
  {FUNCTION_}               { return FUNCTION_; }
}

[^] { return BAD_CHARACTER; }
