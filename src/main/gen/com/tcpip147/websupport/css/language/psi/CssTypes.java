// This is a generated file. Not intended for manual editing.
package com.tcpip147.websupport.css.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tcpip147.websupport.css.language.psi.impl.*;

public interface CssTypes {

  IElementType ANY_ = new CssElementType("ANY_");
  IElementType ATTRIB = new CssElementType("ATTRIB");
  IElementType AT_RULE = new CssElementType("AT_RULE");
  IElementType BLOCK = new CssElementType("BLOCK");
  IElementType CALC_ = new CssElementType("CALC_");
  IElementType CALC_PRODUCT = new CssElementType("CALC_PRODUCT");
  IElementType CALC_SUM = new CssElementType("CALC_SUM");
  IElementType CALC_VALUE = new CssElementType("CALC_VALUE");
  IElementType CHARSET_ = new CssElementType("CHARSET_");
  IElementType CLASS_NAME = new CssElementType("CLASS_NAME");
  IElementType COMBINATOR = new CssElementType("COMBINATOR");
  IElementType COUNTER_STYLE_ = new CssElementType("COUNTER_STYLE_");
  IElementType DECLARATION = new CssElementType("DECLARATION");
  IElementType DECLARATION_LIST = new CssElementType("DECLARATION_LIST");
  IElementType DIMENSION_ = new CssElementType("DIMENSION_");
  IElementType DX_IMAGE_TRANSFORM_ = new CssElementType("DX_IMAGE_TRANSFORM_");
  IElementType ELEMENT_NAME = new CssElementType("ELEMENT_NAME");
  IElementType EXPR = new CssElementType("EXPR");
  IElementType EXPRESSION = new CssElementType("EXPRESSION");
  IElementType FEATURE_TYPE = new CssElementType("FEATURE_TYPE");
  IElementType FEATURE_VALUE_BLOCK = new CssElementType("FEATURE_VALUE_BLOCK");
  IElementType FEATURE_VALUE_DEFINITION = new CssElementType("FEATURE_VALUE_DEFINITION");
  IElementType FONT_FACE_DECLARATION = new CssElementType("FONT_FACE_DECLARATION");
  IElementType FONT_FACE_RULE = new CssElementType("FONT_FACE_RULE");
  IElementType FONT_FAMILY_NAME = new CssElementType("FONT_FAMILY_NAME");
  IElementType FONT_FAMILY_NAME_LIST = new CssElementType("FONT_FAMILY_NAME_LIST");
  IElementType FONT_FEATURE_VALUES_RULE = new CssElementType("FONT_FEATURE_VALUES_RULE");
  IElementType FUNCTION = new CssElementType("FUNCTION");
  IElementType FUNCTIONAL_PSEUDO = new CssElementType("FUNCTIONAL_PSEUDO");
  IElementType GENERAL_ENCLOSED = new CssElementType("GENERAL_ENCLOSED");
  IElementType GROUP_RULE_BODY = new CssElementType("GROUP_RULE_BODY");
  IElementType HEXCOLOR = new CssElementType("HEXCOLOR");
  IElementType IDENT_ = new CssElementType("IDENT_");
  IElementType IMPORTS = new CssElementType("IMPORTS");
  IElementType KEYFRAMES_RULE = new CssElementType("KEYFRAMES_RULE");
  IElementType KEYFRAME_BLOCK = new CssElementType("KEYFRAME_BLOCK");
  IElementType KEYFRAME_SELECTOR = new CssElementType("KEYFRAME_SELECTOR");
  IElementType MEDIA_ = new CssElementType("MEDIA_");
  IElementType MEDIA_EXPRESSION = new CssElementType("MEDIA_EXPRESSION");
  IElementType MEDIA_FEATURE = new CssElementType("MEDIA_FEATURE");
  IElementType MEDIA_QUERY = new CssElementType("MEDIA_QUERY");
  IElementType MEDIA_QUERY_LIST = new CssElementType("MEDIA_QUERY_LIST");
  IElementType MEDIA_TYPE = new CssElementType("MEDIA_TYPE");
  IElementType NAMESPACE_ = new CssElementType("NAMESPACE_");
  IElementType NAMESPACE_PREFIX = new CssElementType("NAMESPACE_PREFIX");
  IElementType NEGATION = new CssElementType("NEGATION");
  IElementType NEGATION_ARG = new CssElementType("NEGATION_ARG");
  IElementType NESTED_STATEMENT = new CssElementType("NESTED_STATEMENT");
  IElementType NUMBER_ = new CssElementType("NUMBER_");
  IElementType OPERATOR_ = new CssElementType("OPERATOR_");
  IElementType PAGE_ = new CssElementType("PAGE_");
  IElementType PERCENTAGE_ = new CssElementType("PERCENTAGE_");
  IElementType PRIO = new CssElementType("PRIO");
  IElementType PROPERTY_ = new CssElementType("PROPERTY_");
  IElementType PSEUDO = new CssElementType("PSEUDO");
  IElementType PSEUDO_PAGE = new CssElementType("PSEUDO_PAGE");
  IElementType RULESET = new CssElementType("RULESET");
  IElementType SELECTOR = new CssElementType("SELECTOR");
  IElementType SELECTOR_GROUP = new CssElementType("SELECTOR_GROUP");
  IElementType SIMPLE_SELECTOR_SEQUENCE = new CssElementType("SIMPLE_SELECTOR_SEQUENCE");
  IElementType SUPPORTS_CONDITION = new CssElementType("SUPPORTS_CONDITION");
  IElementType SUPPORTS_CONDITION_IN_PARENS = new CssElementType("SUPPORTS_CONDITION_IN_PARENS");
  IElementType SUPPORTS_CONJUNCTION = new CssElementType("SUPPORTS_CONJUNCTION");
  IElementType SUPPORTS_DECLARATION_CONDITION = new CssElementType("SUPPORTS_DECLARATION_CONDITION");
  IElementType SUPPORTS_DISJUNCTION = new CssElementType("SUPPORTS_DISJUNCTION");
  IElementType SUPPORTS_NEGATION = new CssElementType("SUPPORTS_NEGATION");
  IElementType SUPPORTS_RULE = new CssElementType("SUPPORTS_RULE");
  IElementType TERM = new CssElementType("TERM");
  IElementType TYPE_NAMESPACE_PREFIX = new CssElementType("TYPE_NAMESPACE_PREFIX");
  IElementType TYPE_SELECTOR = new CssElementType("TYPE_SELECTOR");
  IElementType UNIVERSAL = new CssElementType("UNIVERSAL");
  IElementType UNKNOWN_DIMENSION_ = new CssElementType("UNKNOWN_DIMENSION_");
  IElementType UNUSED = new CssElementType("UNUSED");
  IElementType URL_WRAP = new CssElementType("URL_WRAP");
  IElementType VALUE = new CssElementType("VALUE");
  IElementType VAR_ = new CssElementType("VAR_");
  IElementType VIEWPORT_ = new CssElementType("VIEWPORT_");
  IElementType WS = new CssElementType("WS");

  IElementType AND = new CssTokenType("AND");
  IElementType AT_KEYWORD = new CssTokenType("AT_KEYWORD");
  IElementType CALC = new CssTokenType("CALC");
  IElementType CDC = new CssTokenType("CDC");
  IElementType CDO = new CssTokenType("CDO");
  IElementType CHARSET = new CssTokenType("CHARSET");
  IElementType COMMA = new CssTokenType("COMMA");
  IElementType COMMENT = new CssTokenType("COMMENT");
  IElementType COUNTER_STYLE = new CssTokenType("COUNTER_STYLE");
  IElementType DASH_MATCH = new CssTokenType("DASH_MATCH");
  IElementType DIMENSION = new CssTokenType("DIMENSION");
  IElementType DX_IMAGE_TRANSFORM = new CssTokenType("DX_IMAGE_TRANSFORM");
  IElementType FONT_FACE = new CssTokenType("FONT_FACE");
  IElementType FONT_FEATURE_VALUES = new CssTokenType("FONT_FEATURE_VALUES");
  IElementType FROM = new CssTokenType("FROM");
  IElementType FUNCTION_ = new CssTokenType("FUNCTION_");
  IElementType GREATER = new CssTokenType("GREATER");
  IElementType HASH = new CssTokenType("HASH");
  IElementType IDENT = new CssTokenType("IDENT");
  IElementType IMPORT = new CssTokenType("IMPORT");
  IElementType IMPORTANT = new CssTokenType("IMPORTANT");
  IElementType INCLUDES = new CssTokenType("INCLUDES");
  IElementType KEY_FRAMES = new CssTokenType("KEY_FRAMES");
  IElementType MEDIA = new CssTokenType("MEDIA");
  IElementType MEDIA_ONLY = new CssTokenType("MEDIA_ONLY");
  IElementType MINUS = new CssTokenType("MINUS");
  IElementType NAMESPACE = new CssTokenType("NAMESPACE");
  IElementType NOT = new CssTokenType("NOT");
  IElementType NUMBER = new CssTokenType("NUMBER");
  IElementType OR = new CssTokenType("OR");
  IElementType PAGE = new CssTokenType("PAGE");
  IElementType PERCENTAGE = new CssTokenType("PERCENTAGE");
  IElementType PLUS = new CssTokenType("PLUS");
  IElementType PREFIX_MATCH = new CssTokenType("PREFIX_MATCH");
  IElementType PSEUDO_NOT = new CssTokenType("PSEUDO_NOT");
  IElementType SPACE = new CssTokenType("SPACE");
  IElementType STRING_ = new CssTokenType("STRING_");
  IElementType SUBSTRING_MATCH = new CssTokenType("SUBSTRING_MATCH");
  IElementType SUFFIX_MATCH = new CssTokenType("SUFFIX_MATCH");
  IElementType SUPPORTS = new CssTokenType("SUPPORTS");
  IElementType TILDE = new CssTokenType("TILDE");
  IElementType TO = new CssTokenType("TO");
  IElementType UNICODE_RANGE = new CssTokenType("UNICODE_RANGE");
  IElementType UNKNOWN_DIMENSION = new CssTokenType("UNKNOWN_DIMENSION");
  IElementType URL = new CssTokenType("URL");
  IElementType URL_ = new CssTokenType("URL_");
  IElementType VAR = new CssTokenType("VAR");
  IElementType VARIABLE = new CssTokenType("VARIABLE");
  IElementType VIEWPORT = new CssTokenType("VIEWPORT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANY_) {
        return new CssAny_Impl(node);
      }
      else if (type == ATTRIB) {
        return new CssAttribImpl(node);
      }
      else if (type == AT_RULE) {
        return new CssAtRuleImpl(node);
      }
      else if (type == BLOCK) {
        return new CssBlockImpl(node);
      }
      else if (type == CALC_) {
        return new CssCalc_Impl(node);
      }
      else if (type == CALC_PRODUCT) {
        return new CssCalcProductImpl(node);
      }
      else if (type == CALC_SUM) {
        return new CssCalcSumImpl(node);
      }
      else if (type == CALC_VALUE) {
        return new CssCalcValueImpl(node);
      }
      else if (type == CHARSET_) {
        return new CssCharset_Impl(node);
      }
      else if (type == CLASS_NAME) {
        return new CssClassNameImpl(node);
      }
      else if (type == COMBINATOR) {
        return new CssCombinatorImpl(node);
      }
      else if (type == COUNTER_STYLE_) {
        return new CssCounterStyle_Impl(node);
      }
      else if (type == DECLARATION) {
        return new CssDeclarationImpl(node);
      }
      else if (type == DECLARATION_LIST) {
        return new CssDeclarationListImpl(node);
      }
      else if (type == DIMENSION_) {
        return new CssDimension_Impl(node);
      }
      else if (type == DX_IMAGE_TRANSFORM_) {
        return new CssDxImageTransform_Impl(node);
      }
      else if (type == ELEMENT_NAME) {
        return new CssElementNameImpl(node);
      }
      else if (type == EXPR) {
        return new CssExprImpl(node);
      }
      else if (type == EXPRESSION) {
        return new CssExpressionImpl(node);
      }
      else if (type == FEATURE_TYPE) {
        return new CssFeatureTypeImpl(node);
      }
      else if (type == FEATURE_VALUE_BLOCK) {
        return new CssFeatureValueBlockImpl(node);
      }
      else if (type == FEATURE_VALUE_DEFINITION) {
        return new CssFeatureValueDefinitionImpl(node);
      }
      else if (type == FONT_FACE_DECLARATION) {
        return new CssFontFaceDeclarationImpl(node);
      }
      else if (type == FONT_FACE_RULE) {
        return new CssFontFaceRuleImpl(node);
      }
      else if (type == FONT_FAMILY_NAME) {
        return new CssFontFamilyNameImpl(node);
      }
      else if (type == FONT_FAMILY_NAME_LIST) {
        return new CssFontFamilyNameListImpl(node);
      }
      else if (type == FONT_FEATURE_VALUES_RULE) {
        return new CssFontFeatureValuesRuleImpl(node);
      }
      else if (type == FUNCTION) {
        return new CssFunctionImpl(node);
      }
      else if (type == FUNCTIONAL_PSEUDO) {
        return new CssFunctionalPseudoImpl(node);
      }
      else if (type == GENERAL_ENCLOSED) {
        return new CssGeneralEnclosedImpl(node);
      }
      else if (type == GROUP_RULE_BODY) {
        return new CssGroupRuleBodyImpl(node);
      }
      else if (type == HEXCOLOR) {
        return new CssHexcolorImpl(node);
      }
      else if (type == IDENT_) {
        return new CssIdent_Impl(node);
      }
      else if (type == IMPORTS) {
        return new CssImportsImpl(node);
      }
      else if (type == KEYFRAMES_RULE) {
        return new CssKeyframesRuleImpl(node);
      }
      else if (type == KEYFRAME_BLOCK) {
        return new CssKeyframeBlockImpl(node);
      }
      else if (type == KEYFRAME_SELECTOR) {
        return new CssKeyframeSelectorImpl(node);
      }
      else if (type == MEDIA_) {
        return new CssMedia_Impl(node);
      }
      else if (type == MEDIA_EXPRESSION) {
        return new CssMediaExpressionImpl(node);
      }
      else if (type == MEDIA_FEATURE) {
        return new CssMediaFeatureImpl(node);
      }
      else if (type == MEDIA_QUERY) {
        return new CssMediaQueryImpl(node);
      }
      else if (type == MEDIA_QUERY_LIST) {
        return new CssMediaQueryListImpl(node);
      }
      else if (type == MEDIA_TYPE) {
        return new CssMediaTypeImpl(node);
      }
      else if (type == NAMESPACE_) {
        return new CssNamespace_Impl(node);
      }
      else if (type == NAMESPACE_PREFIX) {
        return new CssNamespacePrefixImpl(node);
      }
      else if (type == NEGATION) {
        return new CssNegationImpl(node);
      }
      else if (type == NEGATION_ARG) {
        return new CssNegationArgImpl(node);
      }
      else if (type == NESTED_STATEMENT) {
        return new CssNestedStatementImpl(node);
      }
      else if (type == NUMBER_) {
        return new CssNumber_Impl(node);
      }
      else if (type == OPERATOR_) {
        return new CssOperator_Impl(node);
      }
      else if (type == PAGE_) {
        return new CssPage_Impl(node);
      }
      else if (type == PERCENTAGE_) {
        return new CssPercentage_Impl(node);
      }
      else if (type == PRIO) {
        return new CssPrioImpl(node);
      }
      else if (type == PROPERTY_) {
        return new CssProperty_Impl(node);
      }
      else if (type == PSEUDO) {
        return new CssPseudoImpl(node);
      }
      else if (type == PSEUDO_PAGE) {
        return new CssPseudoPageImpl(node);
      }
      else if (type == RULESET) {
        return new CssRulesetImpl(node);
      }
      else if (type == SELECTOR) {
        return new CssSelectorImpl(node);
      }
      else if (type == SELECTOR_GROUP) {
        return new CssSelectorGroupImpl(node);
      }
      else if (type == SIMPLE_SELECTOR_SEQUENCE) {
        return new CssSimpleSelectorSequenceImpl(node);
      }
      else if (type == SUPPORTS_CONDITION) {
        return new CssSupportsConditionImpl(node);
      }
      else if (type == SUPPORTS_CONDITION_IN_PARENS) {
        return new CssSupportsConditionInParensImpl(node);
      }
      else if (type == SUPPORTS_CONJUNCTION) {
        return new CssSupportsConjunctionImpl(node);
      }
      else if (type == SUPPORTS_DECLARATION_CONDITION) {
        return new CssSupportsDeclarationConditionImpl(node);
      }
      else if (type == SUPPORTS_DISJUNCTION) {
        return new CssSupportsDisjunctionImpl(node);
      }
      else if (type == SUPPORTS_NEGATION) {
        return new CssSupportsNegationImpl(node);
      }
      else if (type == SUPPORTS_RULE) {
        return new CssSupportsRuleImpl(node);
      }
      else if (type == TERM) {
        return new CssTermImpl(node);
      }
      else if (type == TYPE_NAMESPACE_PREFIX) {
        return new CssTypeNamespacePrefixImpl(node);
      }
      else if (type == TYPE_SELECTOR) {
        return new CssTypeSelectorImpl(node);
      }
      else if (type == UNIVERSAL) {
        return new CssUniversalImpl(node);
      }
      else if (type == UNKNOWN_DIMENSION_) {
        return new CssUnknownDimension_Impl(node);
      }
      else if (type == UNUSED) {
        return new CssUnusedImpl(node);
      }
      else if (type == URL_WRAP) {
        return new CssUrlWrapImpl(node);
      }
      else if (type == VALUE) {
        return new CssValueImpl(node);
      }
      else if (type == VAR_) {
        return new CssVar_Impl(node);
      }
      else if (type == VIEWPORT_) {
        return new CssViewport_Impl(node);
      }
      else if (type == WS) {
        return new CssWsImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
