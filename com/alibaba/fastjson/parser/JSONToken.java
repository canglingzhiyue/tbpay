package com.alibaba.fastjson.parser;

import com.taobao.android.weex_framework.util.a;
import com.taobao.popupcenter.strategy.PopStrategy;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class JSONToken {
    public static final int COLON = 17;
    public static final int COMMA = 16;
    public static final int EOF = 20;
    public static final int ERROR = 1;
    public static final int FALSE = 7;
    public static final int IDENTIFIER = 18;
    public static final int LBRACE = 12;
    public static final int LBRACKET = 14;
    public static final int LITERAL_FLOAT = 3;
    public static final int LITERAL_INT = 2;
    public static final int LITERAL_ISO8601_DATE = 5;
    public static final int LITERAL_STRING = 4;
    public static final int LPAREN = 10;
    public static final int NEW = 9;
    public static final int NULL = 8;
    public static final int RBRACE = 13;
    public static final int RBRACKET = 15;
    public static final int RPAREN = 11;
    public static final int SET = 21;
    public static final int TREE_SET = 22;
    public static final int TRUE = 6;
    public static final int UNDEFINED = 23;

    static {
        kge.a(407093611);
    }

    public static String name(int i) {
        switch (i) {
            case 1:
                return "error";
            case 2:
                return "int";
            case 3:
                return PopStrategy.IDENTIFIER_FLOAT;
            case 4:
                return "string";
            case 5:
                return "iso8601";
            case 6:
                return "true";
            case 7:
                return "false";
            case 8:
                return "null";
            case 9:
                return "new";
            case 10:
                return riy.BRACKET_START_STR;
            case 11:
                return riy.BRACKET_END_STR;
            case 12:
                return riy.BLOCK_START_STR;
            case 13:
                return riy.BLOCK_END_STR;
            case 14:
                return riy.ARRAY_START_STR;
            case 15:
                return riy.ARRAY_END_STR;
            case 16:
                return ",";
            case 17:
                return ":";
            case 18:
                return "ident";
            case 19:
            default:
                return "Unknown";
            case 20:
                return "EOF";
            case 21:
                return a.ATOM_Set;
            case 22:
                return "TreeSet";
            case 23:
                return "undefined";
        }
    }
}
