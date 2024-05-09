// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.tcpip147.websupport.css.language.psi.CssTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CssParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return stylesheet(b, l + 1);
  }

  /* ********************************************************** */
  // ident ws
  //        | number ws
  //        | percentage ws
  //        | dimension ws
  //        | unknownDimension ws
  //        | String_ ws
  //        | url ws
  //        | Hash ws
  //        | UnicodeRange ws
  //        | Includes ws
  //        | DashMatch ws
  //        | ':' ws
  //        | Function_ ws ( any_ | unused)* ')' ws
  //        | '(' ws ( any_ | unused)* ')' ws
  //        | '[' ws ( any_ | unused)* ']' ws
  public static boolean any_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_, "<any>");
    r = any__0(b, l + 1);
    if (!r) r = any__1(b, l + 1);
    if (!r) r = any__2(b, l + 1);
    if (!r) r = any__3(b, l + 1);
    if (!r) r = any__4(b, l + 1);
    if (!r) r = any__5(b, l + 1);
    if (!r) r = any__6(b, l + 1);
    if (!r) r = any__7(b, l + 1);
    if (!r) r = any__8(b, l + 1);
    if (!r) r = any__9(b, l + 1);
    if (!r) r = any__10(b, l + 1);
    if (!r) r = any__11(b, l + 1);
    if (!r) r = any__12(b, l + 1);
    if (!r) r = any__13(b, l + 1);
    if (!r) r = any__14(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ident ws
  private static boolean any__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // number ws
  private static boolean any__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // percentage ws
  private static boolean any__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = percentage(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dimension ws
  private static boolean any__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dimension(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unknownDimension ws
  private static boolean any__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unknownDimension(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // String_ ws
  private static boolean any__5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // url ws
  private static boolean any__6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = url(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Hash ws
  private static boolean any__7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UnicodeRange ws
  private static boolean any__8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNICODERANGE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Includes ws
  private static boolean any__9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCLUDES);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DashMatch ws
  private static boolean any__10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DASHMATCH);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' ws
  private static boolean any__11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Function_ ws ( any_ | unused)* ')' ws
  private static boolean any__12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION_);
    r = r && ws(b, l + 1);
    r = r && any__12_2(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( any_ | unused)*
  private static boolean any__12_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__12_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!any__12_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "any__12_2", c)) break;
    }
    return true;
  }

  // any_ | unused
  private static boolean any__12_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__12_2_0")) return false;
    boolean r;
    r = any_(b, l + 1);
    if (!r) r = unused(b, l + 1);
    return r;
  }

  // '(' ws ( any_ | unused)* ')' ws
  private static boolean any__13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && ws(b, l + 1);
    r = r && any__13_2(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( any_ | unused)*
  private static boolean any__13_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__13_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!any__13_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "any__13_2", c)) break;
    }
    return true;
  }

  // any_ | unused
  private static boolean any__13_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__13_2_0")) return false;
    boolean r;
    r = any_(b, l + 1);
    if (!r) r = unused(b, l + 1);
    return r;
  }

  // '[' ws ( any_ | unused)* ']' ws
  private static boolean any__14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && ws(b, l + 1);
    r = r && any__14_2(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( any_ | unused)*
  private static boolean any__14_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__14_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!any__14_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "any__14_2", c)) break;
    }
    return true;
  }

  // any_ | unused
  private static boolean any__14_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any__14_2_0")) return false;
    boolean r;
    r = any_(b, l + 1);
    if (!r) r = unused(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // AtKeyword ws any_* (block | ';' ws)
  public static boolean atRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atRule")) return false;
    if (!nextTokenIs(b, ATKEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATKEYWORD);
    r = r && ws(b, l + 1);
    r = r && atRule_2(b, l + 1);
    r = r && atRule_3(b, l + 1);
    exit_section_(b, m, AT_RULE, r);
    return r;
  }

  // any_*
  private static boolean atRule_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atRule_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!any_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "atRule_2", c)) break;
    }
    return true;
  }

  // block | ';' ws
  private static boolean atRule_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atRule_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block(b, l + 1);
    if (!r) r = atRule_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' ws
  private static boolean atRule_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atRule_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' ws typeNamespacePrefix? ident ws ( (PrefixMatch | SuffixMatch | SubstringMatch | '=' | Includes | DashMatch) ws ( ident | String_ ) ws )? ']'
  public static boolean attrib(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrib")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIB, "<attrib>");
    r = consumeToken(b, "[");
    r = r && ws(b, l + 1);
    r = r && attrib_2(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && attrib_5(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeNamespacePrefix?
  private static boolean attrib_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrib_2")) return false;
    typeNamespacePrefix(b, l + 1);
    return true;
  }

  // ( (PrefixMatch | SuffixMatch | SubstringMatch | '=' | Includes | DashMatch) ws ( ident | String_ ) ws )?
  private static boolean attrib_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrib_5")) return false;
    attrib_5_0(b, l + 1);
    return true;
  }

  // (PrefixMatch | SuffixMatch | SubstringMatch | '=' | Includes | DashMatch) ws ( ident | String_ ) ws
  private static boolean attrib_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrib_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attrib_5_0_0(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && attrib_5_0_2(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PrefixMatch | SuffixMatch | SubstringMatch | '=' | Includes | DashMatch
  private static boolean attrib_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrib_5_0_0")) return false;
    boolean r;
    r = consumeToken(b, PREFIXMATCH);
    if (!r) r = consumeToken(b, SUFFIXMATCH);
    if (!r) r = consumeToken(b, SUBSTRINGMATCH);
    if (!r) r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, INCLUDES);
    if (!r) r = consumeToken(b, DASHMATCH);
    return r;
  }

  // ident | String_
  private static boolean attrib_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrib_5_0_2")) return false;
    boolean r;
    r = ident(b, l + 1);
    if (!r) r = consumeToken(b, STRING_);
    return r;
  }

  /* ********************************************************** */
  // '{' ws (declarationList | nestedStatement | any_ | block | AtKeyword ws | ';' ws)* '}' ws
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    r = consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && block_2(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (declarationList | nestedStatement | any_ | block | AtKeyword ws | ';' ws)*
  private static boolean block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!block_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_2", c)) break;
    }
    return true;
  }

  // declarationList | nestedStatement | any_ | block | AtKeyword ws | ';' ws
  private static boolean block_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarationList(b, l + 1);
    if (!r) r = nestedStatement(b, l + 1);
    if (!r) r = any_(b, l + 1);
    if (!r) r = block(b, l + 1);
    if (!r) r = block_2_0_4(b, l + 1);
    if (!r) r = block_2_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AtKeyword ws
  private static boolean block_2_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_2_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATKEYWORD);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' ws
  private static boolean block_2_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_2_0_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Calc ws calcSum ')' ws
  public static boolean calc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc")) return false;
    if (!nextTokenIs(b, CALC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CALC);
    r = r && ws(b, l + 1);
    r = r && calcSum(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && ws(b, l + 1);
    exit_section_(b, m, CALC, r);
    return r;
  }

  /* ********************************************************** */
  // calcValue ('*' ws calcValue | '/' ws number ws)*
  public static boolean calcProduct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcProduct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC_PRODUCT, "<calc product>");
    r = calcValue(b, l + 1);
    r = r && calcProduct_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('*' ws calcValue | '/' ws number ws)*
  private static boolean calcProduct_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcProduct_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!calcProduct_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "calcProduct_1", c)) break;
    }
    return true;
  }

  // '*' ws calcValue | '/' ws number ws
  private static boolean calcProduct_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcProduct_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calcProduct_1_0_0(b, l + 1);
    if (!r) r = calcProduct_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' ws calcValue
  private static boolean calcProduct_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcProduct_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && ws(b, l + 1);
    r = r && calcValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '/' ws number ws
  private static boolean calcProduct_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcProduct_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && ws(b, l + 1);
    r = r && number(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // calcProduct (Space ws ( Plus | Minus) ws Space ws calcProduct)*
  public static boolean calcSum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcSum")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC_SUM, "<calc sum>");
    r = calcProduct(b, l + 1);
    r = r && calcSum_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Space ws ( Plus | Minus) ws Space ws calcProduct)*
  private static boolean calcSum_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcSum_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!calcSum_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "calcSum_1", c)) break;
    }
    return true;
  }

  // Space ws ( Plus | Minus) ws Space ws calcProduct
  private static boolean calcSum_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcSum_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    r = r && calcSum_1_0_2(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    r = r && calcProduct(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Plus | Minus
  private static boolean calcSum_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcSum_1_0_2")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // number ws
  //             | dimension ws
  //             | unknownDimension ws
  //             | percentage ws
  //             | '(' ws calcSum ')' ws
  public static boolean calcValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC_VALUE, "<calc value>");
    r = calcValue_0(b, l + 1);
    if (!r) r = calcValue_1(b, l + 1);
    if (!r) r = calcValue_2(b, l + 1);
    if (!r) r = calcValue_3(b, l + 1);
    if (!r) r = calcValue_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // number ws
  private static boolean calcValue_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcValue_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dimension ws
  private static boolean calcValue_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcValue_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dimension(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unknownDimension ws
  private static boolean calcValue_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcValue_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unknownDimension(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // percentage ws
  private static boolean calcValue_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcValue_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = percentage(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' ws calcSum ')' ws
  private static boolean calcValue_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcValue_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && ws(b, l + 1);
    r = r && calcSum(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Charset ws String_ ws ';' ws
  //           | Charset ws String_ ws
  public static boolean charset(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charset")) return false;
    if (!nextTokenIs(b, CHARSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = charset_0(b, l + 1);
    if (!r) r = charset_1(b, l + 1);
    exit_section_(b, m, CHARSET, r);
    return r;
  }

  // Charset ws String_ ws ';' ws
  private static boolean charset_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charset_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHARSET);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, STRING_);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Charset ws String_ ws
  private static boolean charset_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charset_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHARSET);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, STRING_);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '.' ident
  public static boolean className(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "className")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_NAME, "<class name>");
    r = consumeToken(b, ".");
    r = r && ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Plus ws
  //              | Greater ws
  //              | Tilde ws
  //              | Space ws
  public static boolean combinator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "combinator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMBINATOR, "<combinator>");
    r = combinator_0(b, l + 1);
    if (!r) r = combinator_1(b, l + 1);
    if (!r) r = combinator_2(b, l + 1);
    if (!r) r = combinator_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Plus ws
  private static boolean combinator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "combinator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Greater ws
  private static boolean combinator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "combinator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GREATER);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Tilde ws
  private static boolean combinator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "combinator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TILDE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Space ws
  private static boolean combinator_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "combinator_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CounterStyle ws ident ws '{' ws declarationList? '}' ws
  public static boolean counterStyle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counterStyle")) return false;
    if (!nextTokenIs(b, COUNTERSTYLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COUNTERSTYLE);
    r = r && ws(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && counterStyle_6(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, m, COUNTER_STYLE, r);
    return r;
  }

  // declarationList?
  private static boolean counterStyle_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counterStyle_6")) return false;
    declarationList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // property_ ':' ws expr prio?
  //               | property_ ':' ws value
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = declaration_0(b, l + 1);
    if (!r) r = declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // property_ ':' ws expr prio?
  private static boolean declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && ws(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && declaration_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prio?
  private static boolean declaration_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0_4")) return false;
    prio(b, l + 1);
    return true;
  }

  // property_ ':' ws value
  private static boolean declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && ws(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (';' ws)* declaration ws (';' ws declaration?)*
  public static boolean declarationList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_LIST, "<declaration list>");
    r = declarationList_0(b, l + 1);
    r = r && declaration(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && declarationList_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (';' ws)*
  private static boolean declarationList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declarationList_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declarationList_0", c)) break;
    }
    return true;
  }

  // ';' ws
  private static boolean declarationList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' ws declaration?)*
  private static boolean declarationList_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declarationList_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declarationList_3", c)) break;
    }
    return true;
  }

  // ';' ws declaration?
  private static boolean declarationList_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && ws(b, l + 1);
    r = r && declarationList_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // declaration?
  private static boolean declarationList_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_3_0_2")) return false;
    declaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (Plus | Minus)? Dimension
  public static boolean dimension(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dimension")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIMENSION, "<dimension>");
    r = dimension_0(b, l + 1);
    r = r && consumeToken(b, DIMENSION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Plus | Minus)?
  private static boolean dimension_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dimension_0")) return false;
    dimension_0_0(b, l + 1);
    return true;
  }

  // Plus | Minus
  private static boolean dimension_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dimension_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // DxImageTransform ws expr ')' ws
  public static boolean dxImageTransform(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dxImageTransform")) return false;
    if (!nextTokenIs(b, DXIMAGETRANSFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DXIMAGETRANSFORM);
    r = r && ws(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && ws(b, l + 1);
    exit_section_(b, m, DX_IMAGE_TRANSFORM, r);
    return r;
  }

  /* ********************************************************** */
  // ident
  public static boolean elementName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_NAME, "<element name>");
    r = ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // term (operator_? term)*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = term(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (operator_? term)*
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
    }
    return true;
  }

  // operator_? term
  private static boolean expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_1_0_0(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // operator_?
  private static boolean expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0_0")) return false;
    operator_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (( Plus | Minus | Dimension | UnknownDimension | Number | String_ | ident) ws)+
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!expression_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( Plus | Minus | Dimension | UnknownDimension | Number | String_ | ident) ws
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_0_0(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Plus | Minus | Dimension | UnknownDimension | Number | String_ | ident
  private static boolean expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, DIMENSION);
    if (!r) r = consumeToken(b, UNKNOWNDIMENSION);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING_);
    if (!r) r = ident(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // AtKeyword
  public static boolean featureType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureType")) return false;
    if (!nextTokenIs(b, ATKEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATKEYWORD);
    exit_section_(b, m, FEATURE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // featureType ws '{' ws featureValueDefinition? (ws ';' ws featureValueDefinition?)* '}' ws
  public static boolean featureValueBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureValueBlock")) return false;
    if (!nextTokenIs(b, ATKEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = featureType(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && featureValueBlock_4(b, l + 1);
    r = r && featureValueBlock_5(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, m, FEATURE_VALUE_BLOCK, r);
    return r;
  }

  // featureValueDefinition?
  private static boolean featureValueBlock_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureValueBlock_4")) return false;
    featureValueDefinition(b, l + 1);
    return true;
  }

  // (ws ';' ws featureValueDefinition?)*
  private static boolean featureValueBlock_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureValueBlock_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!featureValueBlock_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "featureValueBlock_5", c)) break;
    }
    return true;
  }

  // ws ';' ws featureValueDefinition?
  private static boolean featureValueBlock_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureValueBlock_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && ws(b, l + 1);
    r = r && featureValueBlock_5_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // featureValueDefinition?
  private static boolean featureValueBlock_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureValueBlock_5_0_3")) return false;
    featureValueDefinition(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ident ws ':' ws number (ws number)*
  public static boolean featureValueDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureValueDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_VALUE_DEFINITION, "<feature value definition>");
    r = ident(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && ws(b, l + 1);
    r = r && number(b, l + 1);
    r = r && featureValueDefinition_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ws number)*
  private static boolean featureValueDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureValueDefinition_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!featureValueDefinition_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "featureValueDefinition_5", c)) break;
    }
    return true;
  }

  // ws number
  private static boolean featureValueDefinition_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureValueDefinition_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && number(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // property_ ':' ws expr
  //                       | property_ ':' ws value
  public static boolean fontFaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFaceDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FONT_FACE_DECLARATION, "<font face declaration>");
    r = fontFaceDeclaration_0(b, l + 1);
    if (!r) r = fontFaceDeclaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // property_ ':' ws expr
  private static boolean fontFaceDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFaceDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && ws(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // property_ ':' ws value
  private static boolean fontFaceDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFaceDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && ws(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FontFace ws '{' ws fontFaceDeclaration? (';' ws fontFaceDeclaration?)* '}' ws
  public static boolean fontFaceRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFaceRule")) return false;
    if (!nextTokenIs(b, FONTFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FONTFACE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && fontFaceRule_4(b, l + 1);
    r = r && fontFaceRule_5(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, m, FONT_FACE_RULE, r);
    return r;
  }

  // fontFaceDeclaration?
  private static boolean fontFaceRule_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFaceRule_4")) return false;
    fontFaceDeclaration(b, l + 1);
    return true;
  }

  // (';' ws fontFaceDeclaration?)*
  private static boolean fontFaceRule_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFaceRule_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fontFaceRule_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fontFaceRule_5", c)) break;
    }
    return true;
  }

  // ';' ws fontFaceDeclaration?
  private static boolean fontFaceRule_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFaceRule_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && ws(b, l + 1);
    r = r && fontFaceRule_5_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // fontFaceDeclaration?
  private static boolean fontFaceRule_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFaceRule_5_0_2")) return false;
    fontFaceDeclaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // String_
  //                  | ident ( ws ident)*
  public static boolean fontFamilyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFamilyName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FONT_FAMILY_NAME, "<font family name>");
    r = consumeToken(b, STRING_);
    if (!r) r = fontFamilyName_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ident ( ws ident)*
  private static boolean fontFamilyName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFamilyName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && fontFamilyName_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ws ident)*
  private static boolean fontFamilyName_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFamilyName_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fontFamilyName_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fontFamilyName_1_1", c)) break;
    }
    return true;
  }

  // ws ident
  private static boolean fontFamilyName_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFamilyName_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // fontFamilyName (ws Comma ws fontFamilyName)*
  public static boolean fontFamilyNameList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFamilyNameList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FONT_FAMILY_NAME_LIST, "<font family name list>");
    r = fontFamilyName(b, l + 1);
    r = r && fontFamilyNameList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ws Comma ws fontFamilyName)*
  private static boolean fontFamilyNameList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFamilyNameList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fontFamilyNameList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fontFamilyNameList_1", c)) break;
    }
    return true;
  }

  // ws Comma ws fontFamilyName
  private static boolean fontFamilyNameList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFamilyNameList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && fontFamilyName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FontFeatureValues ws fontFamilyNameList ws '{' ws featureValueBlock* '}' ws
  public static boolean fontFeatureValuesRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFeatureValuesRule")) return false;
    if (!nextTokenIs(b, FONTFEATUREVALUES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FONTFEATUREVALUES);
    r = r && ws(b, l + 1);
    r = r && fontFamilyNameList(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && fontFeatureValuesRule_6(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, m, FONT_FEATURE_VALUES_RULE, r);
    return r;
  }

  // featureValueBlock*
  private static boolean fontFeatureValuesRule_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fontFeatureValuesRule_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!featureValueBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fontFeatureValuesRule_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Function_ ws expr ')' ws
  public static boolean function_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_")) return false;
    if (!nextTokenIs(b, FUNCTION_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION_);
    r = r && ws(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && ws(b, l + 1);
    exit_section_(b, m, FUNCTION_, r);
    return r;
  }

  /* ********************************************************** */
  // Function_ ws expression ')'
  public static boolean functionalPseudo(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionalPseudo")) return false;
    if (!nextTokenIs(b, FUNCTION_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION_);
    r = r && ws(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, FUNCTIONAL_PSEUDO, r);
    return r;
  }

  /* ********************************************************** */
  // (Function_ | '(') (any_ | unused)* ')'
  public static boolean generalEnclosed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generalEnclosed")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERAL_ENCLOSED, "<general enclosed>");
    r = generalEnclosed_0(b, l + 1);
    r = r && generalEnclosed_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Function_ | '('
  private static boolean generalEnclosed_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generalEnclosed_0")) return false;
    boolean r;
    r = consumeToken(b, FUNCTION_);
    if (!r) r = consumeToken(b, "(");
    return r;
  }

  // (any_ | unused)*
  private static boolean generalEnclosed_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generalEnclosed_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generalEnclosed_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generalEnclosed_1", c)) break;
    }
    return true;
  }

  // any_ | unused
  private static boolean generalEnclosed_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generalEnclosed_1_0")) return false;
    boolean r;
    r = any_(b, l + 1);
    if (!r) r = unused(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '{' ws nestedStatement* '}' ws
  public static boolean groupRuleBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "groupRuleBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_RULE_BODY, "<group rule body>");
    r = consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && groupRuleBody_2(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // nestedStatement*
  private static boolean groupRuleBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "groupRuleBody_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nestedStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "groupRuleBody_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Hash ws
  public static boolean hexcolor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexcolor")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && ws(b, l + 1);
    exit_section_(b, m, HEXCOLOR, r);
    return r;
  }

  /* ********************************************************** */
  // Ident
  //         | MediaOnly
  //         | Not
  //         | And
  //         | Or
  //         | From
  //         | To
  public static boolean ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT, "<ident>");
    r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, MEDIAONLY);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, FROM);
    if (!r) r = consumeToken(b, TO);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Import ws (String_ | url) ws mediaQueryList ';' ws
  //     | Import ws ( String_ | url) ws ';' ws
  //     | Import ws ( String_ | url) ws mediaQueryList
  //     | Import ws ( String_ | url) ws
  public static boolean imports(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = imports_0(b, l + 1);
    if (!r) r = imports_1(b, l + 1);
    if (!r) r = imports_2(b, l + 1);
    if (!r) r = imports_3(b, l + 1);
    exit_section_(b, m, IMPORTS, r);
    return r;
  }

  // Import ws (String_ | url) ws mediaQueryList ';' ws
  private static boolean imports_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && ws(b, l + 1);
    r = r && imports_0_2(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && mediaQueryList(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // String_ | url
  private static boolean imports_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_0_2")) return false;
    boolean r;
    r = consumeToken(b, STRING_);
    if (!r) r = url(b, l + 1);
    return r;
  }

  // Import ws ( String_ | url) ws ';' ws
  private static boolean imports_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && ws(b, l + 1);
    r = r && imports_1_2(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // String_ | url
  private static boolean imports_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_1_2")) return false;
    boolean r;
    r = consumeToken(b, STRING_);
    if (!r) r = url(b, l + 1);
    return r;
  }

  // Import ws ( String_ | url) ws mediaQueryList
  private static boolean imports_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && ws(b, l + 1);
    r = r && imports_2_2(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && mediaQueryList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // String_ | url
  private static boolean imports_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_2_2")) return false;
    boolean r;
    r = consumeToken(b, STRING_);
    if (!r) r = url(b, l + 1);
    return r;
  }

  // Import ws ( String_ | url) ws
  private static boolean imports_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && ws(b, l + 1);
    r = r && imports_3_2(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // String_ | url
  private static boolean imports_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_3_2")) return false;
    boolean r;
    r = consumeToken(b, STRING_);
    if (!r) r = url(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // keyframeSelector '{' ws declarationList? '}' ws
  public static boolean keyframeBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyframeBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYFRAME_BLOCK, "<keyframe block>");
    r = keyframeSelector(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && keyframeBlock_3(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // declarationList?
  private static boolean keyframeBlock_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyframeBlock_3")) return false;
    declarationList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (From | To | Percentage) ws (Comma ws ( From | To | Percentage) ws)*
  public static boolean keyframeSelector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyframeSelector")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYFRAME_SELECTOR, "<keyframe selector>");
    r = keyframeSelector_0(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && keyframeSelector_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // From | To | Percentage
  private static boolean keyframeSelector_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyframeSelector_0")) return false;
    boolean r;
    r = consumeToken(b, FROM);
    if (!r) r = consumeToken(b, TO);
    if (!r) r = consumeToken(b, PERCENTAGE);
    return r;
  }

  // (Comma ws ( From | To | Percentage) ws)*
  private static boolean keyframeSelector_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyframeSelector_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!keyframeSelector_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "keyframeSelector_2", c)) break;
    }
    return true;
  }

  // Comma ws ( From | To | Percentage) ws
  private static boolean keyframeSelector_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyframeSelector_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && keyframeSelector_2_0_2(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // From | To | Percentage
  private static boolean keyframeSelector_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyframeSelector_2_0_2")) return false;
    boolean r;
    r = consumeToken(b, FROM);
    if (!r) r = consumeToken(b, TO);
    if (!r) r = consumeToken(b, PERCENTAGE);
    return r;
  }

  /* ********************************************************** */
  // Keyframes ws Space ws ident ws '{' ws keyframeBlock* '}' ws
  public static boolean keyframesRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyframesRule")) return false;
    if (!nextTokenIs(b, KEYFRAMES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYFRAMES);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && keyframesRule_8(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, m, KEYFRAMES_RULE, r);
    return r;
  }

  // keyframeBlock*
  private static boolean keyframesRule_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyframesRule_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!keyframeBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "keyframesRule_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Media ws mediaQueryList groupRuleBody ws
  public static boolean media(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "media")) return false;
    if (!nextTokenIs(b, MEDIA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MEDIA);
    r = r && ws(b, l + 1);
    r = r && mediaQueryList(b, l + 1);
    r = r && groupRuleBody(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, MEDIA, r);
    return r;
  }

  /* ********************************************************** */
  // '(' ws mediaFeature (':' ws expr)? ')' ws
  public static boolean mediaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEDIA_EXPRESSION, "<media expression>");
    r = consumeToken(b, "(");
    r = r && ws(b, l + 1);
    r = r && mediaFeature(b, l + 1);
    r = r && mediaExpression_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (':' ws expr)?
  private static boolean mediaExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaExpression_3")) return false;
    mediaExpression_3_0(b, l + 1);
    return true;
  }

  // ':' ws expr
  private static boolean mediaExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && ws(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident ws
  public static boolean mediaFeature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaFeature")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEDIA_FEATURE, "<media feature>");
    r = ident(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (MediaOnly | Not)? ws mediaType ws (And ws mediaExpression)*
  //              | mediaExpression ( And ws mediaExpression)*
  public static boolean mediaQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQuery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEDIA_QUERY, "<media query>");
    r = mediaQuery_0(b, l + 1);
    if (!r) r = mediaQuery_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (MediaOnly | Not)? ws mediaType ws (And ws mediaExpression)*
  private static boolean mediaQuery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQuery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mediaQuery_0_0(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && mediaType(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && mediaQuery_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (MediaOnly | Not)?
  private static boolean mediaQuery_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQuery_0_0")) return false;
    mediaQuery_0_0_0(b, l + 1);
    return true;
  }

  // MediaOnly | Not
  private static boolean mediaQuery_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQuery_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, MEDIAONLY);
    if (!r) r = consumeToken(b, NOT);
    return r;
  }

  // (And ws mediaExpression)*
  private static boolean mediaQuery_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQuery_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mediaQuery_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mediaQuery_0_4", c)) break;
    }
    return true;
  }

  // And ws mediaExpression
  private static boolean mediaQuery_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQuery_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && ws(b, l + 1);
    r = r && mediaExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mediaExpression ( And ws mediaExpression)*
  private static boolean mediaQuery_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQuery_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mediaExpression(b, l + 1);
    r = r && mediaQuery_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( And ws mediaExpression)*
  private static boolean mediaQuery_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQuery_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mediaQuery_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mediaQuery_1_1", c)) break;
    }
    return true;
  }

  // And ws mediaExpression
  private static boolean mediaQuery_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQuery_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && ws(b, l + 1);
    r = r && mediaExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (mediaQuery ( Comma ws mediaQuery)*)? ws
  public static boolean mediaQueryList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQueryList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEDIA_QUERY_LIST, "<media query list>");
    r = mediaQueryList_0(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (mediaQuery ( Comma ws mediaQuery)*)?
  private static boolean mediaQueryList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQueryList_0")) return false;
    mediaQueryList_0_0(b, l + 1);
    return true;
  }

  // mediaQuery ( Comma ws mediaQuery)*
  private static boolean mediaQueryList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQueryList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mediaQuery(b, l + 1);
    r = r && mediaQueryList_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Comma ws mediaQuery)*
  private static boolean mediaQueryList_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQueryList_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mediaQueryList_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mediaQueryList_0_0_1", c)) break;
    }
    return true;
  }

  // Comma ws mediaQuery
  private static boolean mediaQueryList_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaQueryList_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && mediaQuery(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident
  public static boolean mediaType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mediaType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEDIA_TYPE, "<media type>");
    r = ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ident
  public static boolean namespacePrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespacePrefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_PREFIX, "<namespace prefix>");
    r = ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Namespace ws (namespacePrefix ws)? (String_ | url) ws ';' ws
  //              | Namespace ws (namespacePrefix ws)? ( String_ | url) ws
  public static boolean namespace_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace__0(b, l + 1);
    if (!r) r = namespace__1(b, l + 1);
    exit_section_(b, m, NAMESPACE_, r);
    return r;
  }

  // Namespace ws (namespacePrefix ws)? (String_ | url) ws ';' ws
  private static boolean namespace__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAMESPACE);
    r = r && ws(b, l + 1);
    r = r && namespace__0_2(b, l + 1);
    r = r && namespace__0_3(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (namespacePrefix ws)?
  private static boolean namespace__0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace__0_2")) return false;
    namespace__0_2_0(b, l + 1);
    return true;
  }

  // namespacePrefix ws
  private static boolean namespace__0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace__0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespacePrefix(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // String_ | url
  private static boolean namespace__0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace__0_3")) return false;
    boolean r;
    r = consumeToken(b, STRING_);
    if (!r) r = url(b, l + 1);
    return r;
  }

  // Namespace ws (namespacePrefix ws)? ( String_ | url) ws
  private static boolean namespace__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAMESPACE);
    r = r && ws(b, l + 1);
    r = r && namespace__1_2(b, l + 1);
    r = r && namespace__1_3(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (namespacePrefix ws)?
  private static boolean namespace__1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace__1_2")) return false;
    namespace__1_2_0(b, l + 1);
    return true;
  }

  // namespacePrefix ws
  private static boolean namespace__1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace__1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespacePrefix(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // String_ | url
  private static boolean namespace__1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace__1_3")) return false;
    boolean r;
    r = consumeToken(b, STRING_);
    if (!r) r = url(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // PseudoNot ws negationArg ws ')'
  public static boolean negation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "negation")) return false;
    if (!nextTokenIs(b, PSEUDONOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PSEUDONOT);
    r = r && ws(b, l + 1);
    r = r && negationArg(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, NEGATION, r);
    return r;
  }

  /* ********************************************************** */
  // typeSelector
  //               | universal
  //               | Hash
  //               | className
  //               | attrib
  //               | pseudo
  public static boolean negationArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "negationArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEGATION_ARG, "<negation arg>");
    r = typeSelector(b, l + 1);
    if (!r) r = universal(b, l + 1);
    if (!r) r = consumeToken(b, HASH);
    if (!r) r = className(b, l + 1);
    if (!r) r = attrib(b, l + 1);
    if (!r) r = pseudo(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ruleset
  //                   | media
  //                   | page
  //                   | fontFaceRule
  //                   | keyframesRule
  //                   | supportsRule
  //                   | viewport
  //                   | counterStyle
  //                   | fontFeatureValuesRule
  //                   | atRule
  public static boolean nestedStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nestedStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NESTED_STATEMENT, "<nested statement>");
    r = ruleset(b, l + 1);
    if (!r) r = media(b, l + 1);
    if (!r) r = page(b, l + 1);
    if (!r) r = fontFaceRule(b, l + 1);
    if (!r) r = keyframesRule(b, l + 1);
    if (!r) r = supportsRule(b, l + 1);
    if (!r) r = viewport(b, l + 1);
    if (!r) r = counterStyle(b, l + 1);
    if (!r) r = fontFeatureValuesRule(b, l + 1);
    if (!r) r = atRule(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (Plus | Minus)? Number
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER, "<number>");
    r = number_0(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Plus | Minus)?
  private static boolean number_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_0")) return false;
    number_0_0(b, l + 1);
    return true;
  }

  // Plus | Minus
  private static boolean number_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // '/' ws
  //             | Comma ws
  //             | Space ws
  //             | '=' ws
  public static boolean operator_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_, "<operator>");
    r = operator__0(b, l + 1);
    if (!r) r = operator__1(b, l + 1);
    if (!r) r = operator__2(b, l + 1);
    if (!r) r = operator__3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '/' ws
  private static boolean operator__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Comma ws
  private static boolean operator__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Space ws
  private static boolean operator__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' ws
  private static boolean operator__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator__3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Page ws pseudoPage? '{' ws declaration? (';' ws declaration?)* '}' ws
  public static boolean page(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "page")) return false;
    if (!nextTokenIs(b, PAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAGE);
    r = r && ws(b, l + 1);
    r = r && page_2(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && page_5(b, l + 1);
    r = r && page_6(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, m, PAGE, r);
    return r;
  }

  // pseudoPage?
  private static boolean page_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "page_2")) return false;
    pseudoPage(b, l + 1);
    return true;
  }

  // declaration?
  private static boolean page_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "page_5")) return false;
    declaration(b, l + 1);
    return true;
  }

  // (';' ws declaration?)*
  private static boolean page_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "page_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!page_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "page_6", c)) break;
    }
    return true;
  }

  // ';' ws declaration?
  private static boolean page_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "page_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && ws(b, l + 1);
    r = r && page_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // declaration?
  private static boolean page_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "page_6_0_2")) return false;
    declaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (Plus | Minus)? Percentage
  public static boolean percentage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "percentage")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERCENTAGE, "<percentage>");
    r = percentage_0(b, l + 1);
    r = r && consumeToken(b, PERCENTAGE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Plus | Minus)?
  private static boolean percentage_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "percentage_0")) return false;
    percentage_0_0(b, l + 1);
    return true;
  }

  // Plus | Minus
  private static boolean percentage_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "percentage_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // Important ws
  public static boolean prio(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prio")) return false;
    if (!nextTokenIs(b, IMPORTANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORTANT);
    r = r && ws(b, l + 1);
    exit_section_(b, m, PRIO, r);
    return r;
  }

  /* ********************************************************** */
  // ident ws
  //             | Variable ws
  //             | '*' ident
  //             | '_' ident
  public static boolean property_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_, "<property>");
    r = property__0(b, l + 1);
    if (!r) r = property__1(b, l + 1);
    if (!r) r = property__2(b, l + 1);
    if (!r) r = property__3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ident ws
  private static boolean property__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Variable ws
  private static boolean property__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' ident
  private static boolean property__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '_' ident
  private static boolean property__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property__3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "_");
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' ':'? (ident | functionalPseudo)
  public static boolean pseudo(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pseudo")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PSEUDO, "<pseudo>");
    r = consumeToken(b, ":");
    r = r && pseudo_1(b, l + 1);
    r = r && pseudo_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ':'?
  private static boolean pseudo_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pseudo_1")) return false;
    consumeToken(b, ":");
    return true;
  }

  // ident | functionalPseudo
  private static boolean pseudo_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pseudo_2")) return false;
    boolean r;
    r = ident(b, l + 1);
    if (!r) r = functionalPseudo(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ':' ident ws
  public static boolean pseudoPage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pseudoPage")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PSEUDO_PAGE, "<pseudo page>");
    r = consumeToken(b, ":");
    r = r && ident(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // selectorGroup '{' ws declarationList? '}' ws
  //           | any_* '{' ws declarationList? '}' ws
  public static boolean ruleset(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleset")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULESET, "<ruleset>");
    r = ruleset_0(b, l + 1);
    if (!r) r = ruleset_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // selectorGroup '{' ws declarationList? '}' ws
  private static boolean ruleset_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleset_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectorGroup(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && ruleset_0_3(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // declarationList?
  private static boolean ruleset_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleset_0_3")) return false;
    declarationList(b, l + 1);
    return true;
  }

  // any_* '{' ws declarationList? '}' ws
  private static boolean ruleset_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleset_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ruleset_1_0(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && ruleset_1_3(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // any_*
  private static boolean ruleset_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleset_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!any_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ruleset_1_0", c)) break;
    }
    return true;
  }

  // declarationList?
  private static boolean ruleset_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleset_1_3")) return false;
    declarationList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simpleSelectorSequence ws (combinator simpleSelectorSequence ws)*
  public static boolean selector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTOR, "<selector>");
    r = simpleSelectorSequence(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && selector_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (combinator simpleSelectorSequence ws)*
  private static boolean selector_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!selector_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "selector_2", c)) break;
    }
    return true;
  }

  // combinator simpleSelectorSequence ws
  private static boolean selector_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = combinator(b, l + 1);
    r = r && simpleSelectorSequence(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // selector (Comma ws selector)*
  public static boolean selectorGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorGroup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTOR_GROUP, "<selector group>");
    r = selector(b, l + 1);
    r = r && selectorGroup_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Comma ws selector)*
  private static boolean selectorGroup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorGroup_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!selectorGroup_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "selectorGroup_1", c)) break;
    }
    return true;
  }

  // Comma ws selector
  private static boolean selectorGroup_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorGroup_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && selector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (typeSelector | universal) (Hash | className | attrib | pseudo | negation)*
  //                          | ( Hash | className | attrib | pseudo | negation)+
  public static boolean simpleSelectorSequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleSelectorSequence")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_SELECTOR_SEQUENCE, "<simple selector sequence>");
    r = simpleSelectorSequence_0(b, l + 1);
    if (!r) r = simpleSelectorSequence_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (typeSelector | universal) (Hash | className | attrib | pseudo | negation)*
  private static boolean simpleSelectorSequence_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleSelectorSequence_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleSelectorSequence_0_0(b, l + 1);
    r = r && simpleSelectorSequence_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeSelector | universal
  private static boolean simpleSelectorSequence_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleSelectorSequence_0_0")) return false;
    boolean r;
    r = typeSelector(b, l + 1);
    if (!r) r = universal(b, l + 1);
    return r;
  }

  // (Hash | className | attrib | pseudo | negation)*
  private static boolean simpleSelectorSequence_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleSelectorSequence_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simpleSelectorSequence_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleSelectorSequence_0_1", c)) break;
    }
    return true;
  }

  // Hash | className | attrib | pseudo | negation
  private static boolean simpleSelectorSequence_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleSelectorSequence_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, HASH);
    if (!r) r = className(b, l + 1);
    if (!r) r = attrib(b, l + 1);
    if (!r) r = pseudo(b, l + 1);
    if (!r) r = negation(b, l + 1);
    return r;
  }

  // ( Hash | className | attrib | pseudo | negation)+
  private static boolean simpleSelectorSequence_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleSelectorSequence_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleSelectorSequence_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!simpleSelectorSequence_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleSelectorSequence_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Hash | className | attrib | pseudo | negation
  private static boolean simpleSelectorSequence_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleSelectorSequence_1_0")) return false;
    boolean r;
    r = consumeToken(b, HASH);
    if (!r) r = className(b, l + 1);
    if (!r) r = attrib(b, l + 1);
    if (!r) r = pseudo(b, l + 1);
    if (!r) r = negation(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ws (charset ( Comment | Space | Cdo | Cdc)*)* (imports ( Comment | Space | Cdo | Cdc)*)* (
  //                namespace_ ( Comment | Space | Cdo | Cdc)*
  //                )* (nestedStatement ( Comment | Space | Cdo | Cdc)*)*
  static boolean stylesheet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && stylesheet_1(b, l + 1);
    r = r && stylesheet_2(b, l + 1);
    r = r && stylesheet_3(b, l + 1);
    r = r && stylesheet_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (charset ( Comment | Space | Cdo | Cdc)*)*
  private static boolean stylesheet_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stylesheet_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stylesheet_1", c)) break;
    }
    return true;
  }

  // charset ( Comment | Space | Cdo | Cdc)*
  private static boolean stylesheet_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = charset(b, l + 1);
    r = r && stylesheet_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Comment | Space | Cdo | Cdc)*
  private static boolean stylesheet_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stylesheet_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stylesheet_1_0_1", c)) break;
    }
    return true;
  }

  // Comment | Space | Cdo | Cdc
  private static boolean stylesheet_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, SPACE);
    if (!r) r = consumeToken(b, CDO);
    if (!r) r = consumeToken(b, CDC);
    return r;
  }

  // (imports ( Comment | Space | Cdo | Cdc)*)*
  private static boolean stylesheet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stylesheet_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stylesheet_2", c)) break;
    }
    return true;
  }

  // imports ( Comment | Space | Cdo | Cdc)*
  private static boolean stylesheet_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = imports(b, l + 1);
    r = r && stylesheet_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Comment | Space | Cdo | Cdc)*
  private static boolean stylesheet_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stylesheet_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stylesheet_2_0_1", c)) break;
    }
    return true;
  }

  // Comment | Space | Cdo | Cdc
  private static boolean stylesheet_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_2_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, SPACE);
    if (!r) r = consumeToken(b, CDO);
    if (!r) r = consumeToken(b, CDC);
    return r;
  }

  // (
  //                namespace_ ( Comment | Space | Cdo | Cdc)*
  //                )*
  private static boolean stylesheet_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stylesheet_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stylesheet_3", c)) break;
    }
    return true;
  }

  // namespace_ ( Comment | Space | Cdo | Cdc)*
  private static boolean stylesheet_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_(b, l + 1);
    r = r && stylesheet_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Comment | Space | Cdo | Cdc)*
  private static boolean stylesheet_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stylesheet_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stylesheet_3_0_1", c)) break;
    }
    return true;
  }

  // Comment | Space | Cdo | Cdc
  private static boolean stylesheet_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_3_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, SPACE);
    if (!r) r = consumeToken(b, CDO);
    if (!r) r = consumeToken(b, CDC);
    return r;
  }

  // (nestedStatement ( Comment | Space | Cdo | Cdc)*)*
  private static boolean stylesheet_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stylesheet_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stylesheet_4", c)) break;
    }
    return true;
  }

  // nestedStatement ( Comment | Space | Cdo | Cdc)*
  private static boolean stylesheet_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nestedStatement(b, l + 1);
    r = r && stylesheet_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Comment | Space | Cdo | Cdc)*
  private static boolean stylesheet_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stylesheet_4_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stylesheet_4_0_1", c)) break;
    }
    return true;
  }

  // Comment | Space | Cdo | Cdc
  private static boolean stylesheet_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_4_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, SPACE);
    if (!r) r = consumeToken(b, CDO);
    if (!r) r = consumeToken(b, CDC);
    return r;
  }

  /* ********************************************************** */
  // supportsNegation
  //                     | supportsConjunction
  //                     | supportsDisjunction
  //                     | supportsConditionInParens
  public static boolean supportsCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPPORTS_CONDITION, "<supports condition>");
    r = supportsNegation(b, l + 1);
    if (!r) r = supportsConjunction(b, l + 1);
    if (!r) r = supportsDisjunction(b, l + 1);
    if (!r) r = supportsConditionInParens(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' ws supportsCondition ws ')'
  //                             | supportsDeclarationCondition
  //                             | generalEnclosed
  public static boolean supportsConditionInParens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsConditionInParens")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPPORTS_CONDITION_IN_PARENS, "<supports condition in parens>");
    r = supportsConditionInParens_0(b, l + 1);
    if (!r) r = supportsDeclarationCondition(b, l + 1);
    if (!r) r = generalEnclosed(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' ws supportsCondition ws ')'
  private static boolean supportsConditionInParens_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsConditionInParens_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && ws(b, l + 1);
    r = r && supportsCondition(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // supportsConditionInParens (ws Space ws And ws Space ws supportsConditionInParens)+
  public static boolean supportsConjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsConjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPPORTS_CONJUNCTION, "<supports conjunction>");
    r = supportsConditionInParens(b, l + 1);
    r = r && supportsConjunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ws Space ws And ws Space ws supportsConditionInParens)+
  private static boolean supportsConjunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsConjunction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = supportsConjunction_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!supportsConjunction_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "supportsConjunction_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ws Space ws And ws Space ws supportsConditionInParens
  private static boolean supportsConjunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsConjunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, AND);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    r = r && supportsConditionInParens(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' ws declaration ')'
  public static boolean supportsDeclarationCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsDeclarationCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPPORTS_DECLARATION_CONDITION, "<supports declaration condition>");
    r = consumeToken(b, "(");
    r = r && ws(b, l + 1);
    r = r && declaration(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // supportsConditionInParens (ws Space ws Or ws Space ws supportsConditionInParens)+
  public static boolean supportsDisjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsDisjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPPORTS_DISJUNCTION, "<supports disjunction>");
    r = supportsConditionInParens(b, l + 1);
    r = r && supportsDisjunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ws Space ws Or ws Space ws supportsConditionInParens)+
  private static boolean supportsDisjunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsDisjunction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = supportsDisjunction_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!supportsDisjunction_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "supportsDisjunction_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ws Space ws Or ws Space ws supportsConditionInParens
  private static boolean supportsDisjunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsDisjunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, OR);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    r = r && supportsConditionInParens(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Not ws Space ws supportsConditionInParens
  public static boolean supportsNegation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsNegation")) return false;
    if (!nextTokenIs(b, NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, SPACE);
    r = r && ws(b, l + 1);
    r = r && supportsConditionInParens(b, l + 1);
    exit_section_(b, m, SUPPORTS_NEGATION, r);
    return r;
  }

  /* ********************************************************** */
  // Supports ws supportsCondition ws groupRuleBody
  public static boolean supportsRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supportsRule")) return false;
    if (!nextTokenIs(b, SUPPORTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUPPORTS);
    r = r && ws(b, l + 1);
    r = r && supportsCondition(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && groupRuleBody(b, l + 1);
    exit_section_(b, m, SUPPORTS_RULE, r);
    return r;
  }

  /* ********************************************************** */
  // number ws
  //        | percentage ws
  //        | dimension ws
  //        | String_ ws
  //        | UnicodeRange ws
  //        | ident ws
  //        | var_
  //        | url ws
  //        | hexcolor
  //        | calc
  //        | function_
  //        | unknownDimension ws
  //        | dxImageTransform
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = term_0(b, l + 1);
    if (!r) r = term_1(b, l + 1);
    if (!r) r = term_2(b, l + 1);
    if (!r) r = term_3(b, l + 1);
    if (!r) r = term_4(b, l + 1);
    if (!r) r = term_5(b, l + 1);
    if (!r) r = var_(b, l + 1);
    if (!r) r = term_7(b, l + 1);
    if (!r) r = hexcolor(b, l + 1);
    if (!r) r = calc(b, l + 1);
    if (!r) r = function_(b, l + 1);
    if (!r) r = term_11(b, l + 1);
    if (!r) r = dxImageTransform(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // number ws
  private static boolean term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // percentage ws
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = percentage(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dimension ws
  private static boolean term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dimension(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // String_ ws
  private static boolean term_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UnicodeRange ws
  private static boolean term_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNICODERANGE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ident ws
  private static boolean term_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // url ws
  private static boolean term_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = url(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unknownDimension ws
  private static boolean term_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unknownDimension(b, l + 1);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ident | '*')? '|'
  public static boolean typeNamespacePrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeNamespacePrefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAMESPACE_PREFIX, "<type namespace prefix>");
    r = typeNamespacePrefix_0(b, l + 1);
    r = r && consumeToken(b, "|");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ident | '*')?
  private static boolean typeNamespacePrefix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeNamespacePrefix_0")) return false;
    typeNamespacePrefix_0_0(b, l + 1);
    return true;
  }

  // ident | '*'
  private static boolean typeNamespacePrefix_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeNamespacePrefix_0_0")) return false;
    boolean r;
    r = ident(b, l + 1);
    if (!r) r = consumeToken(b, "*");
    return r;
  }

  /* ********************************************************** */
  // typeNamespacePrefix? elementName
  public static boolean typeSelector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSelector")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SELECTOR, "<type selector>");
    r = typeSelector_0(b, l + 1);
    r = r && elementName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeNamespacePrefix?
  private static boolean typeSelector_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSelector_0")) return false;
    typeNamespacePrefix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // typeNamespacePrefix? '*'
  public static boolean universal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "universal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNIVERSAL, "<universal>");
    r = universal_0(b, l + 1);
    r = r && consumeToken(b, "*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeNamespacePrefix?
  private static boolean universal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "universal_0")) return false;
    typeNamespacePrefix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (Plus | Minus)? UnknownDimension
  public static boolean unknownDimension(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknownDimension")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNKNOWN_DIMENSION, "<unknown dimension>");
    r = unknownDimension_0(b, l + 1);
    r = r && consumeToken(b, UNKNOWNDIMENSION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Plus | Minus)?
  private static boolean unknownDimension_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknownDimension_0")) return false;
    unknownDimension_0_0(b, l + 1);
    return true;
  }

  // Plus | Minus
  private static boolean unknownDimension_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknownDimension_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // block
  //          | AtKeyword ws
  //          | ';' ws
  //          | Cdo ws
  //          | Cdc ws
  public static boolean unused(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unused")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNUSED, "<unused>");
    r = block(b, l + 1);
    if (!r) r = unused_1(b, l + 1);
    if (!r) r = unused_2(b, l + 1);
    if (!r) r = unused_3(b, l + 1);
    if (!r) r = unused_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AtKeyword ws
  private static boolean unused_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unused_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATKEYWORD);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' ws
  private static boolean unused_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unused_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Cdo ws
  private static boolean unused_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unused_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CDO);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Cdc ws
  private static boolean unused_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unused_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CDC);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Url_ ws String_ ws ')'
  //       | Url
  public static boolean url(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url")) return false;
    if (!nextTokenIs(b, "<url>", URL, URL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, URL, "<url>");
    r = url_0(b, l + 1);
    if (!r) r = consumeToken(b, URL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Url_ ws String_ ws ')'
  private static boolean url_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, URL_);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, STRING_);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (any_ | block | AtKeyword ws)+
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = value_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!value_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // any_ | block | AtKeyword ws
  private static boolean value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = any_(b, l + 1);
    if (!r) r = block(b, l + 1);
    if (!r) r = value_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AtKeyword ws
  private static boolean value_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATKEYWORD);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Var ws Variable ws ')' ws
  public static boolean var_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, VARIABLE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && ws(b, l + 1);
    exit_section_(b, m, VAR_, r);
    return r;
  }

  /* ********************************************************** */
  // Viewport ws '{' ws declarationList? '}' ws
  public static boolean viewport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "viewport")) return false;
    if (!nextTokenIs(b, VIEWPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VIEWPORT);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ws(b, l + 1);
    r = r && viewport_4(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ws(b, l + 1);
    exit_section_(b, m, VIEWPORT, r);
    return r;
  }

  // declarationList?
  private static boolean viewport_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "viewport_4")) return false;
    declarationList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (Comment | Space)*
  public static boolean ws(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ws")) return false;
    Marker m = enter_section_(b, l, _NONE_, WS, "<ws>");
    while (true) {
      int c = current_position_(b);
      if (!ws_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ws", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // Comment | Space
  private static boolean ws_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ws_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, SPACE);
    return r;
  }

}
