package com.taobao.android.engine.expression.operator;

import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class a {
    public static final int OPERATOR_ADD = 1;
    public static final int OPERATOR_AND = 6;
    public static final int OPERATOR_DIVISION = 4;
    public static final int OPERATOR_EQUAL = 8;
    public static final int OPERATOR_GREATER_THAN = 10;
    public static final int OPERATOR_GREATER_THAN_OR_EQUAL = 11;
    public static final int OPERATOR_IS_KIND_OF_CLASS = 14;
    public static final int OPERATOR_LESS_THAN = 12;
    public static final int OPERATOR_LESS_THAN_OR_EQUAL = 13;
    public static final int OPERATOR_MINUS = 2;
    public static final int OPERATOR_MOD = 5;
    public static final int OPERATOR_MULTIPLY = 3;
    public static final int OPERATOR_NOT_EQUAL = 9;
    public static final int OPERATOR_OR = 7;
    public static final int OPERATOR_UNDEFINED = 0;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Integer> f12309a;
    private static int b;

    static {
        kge.a(65231795);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>() { // from class: com.taobao.android.engine.expression.operator.BinaryOperator$1
            {
                put("||", 1);
                put("&&", 2);
                put("==", 6);
                put("!=", 6);
                put("<", 7);
                put("<=", 7);
                put(">", 7);
                put(">=", 7);
                put(riy.PLUS, 9);
                put("-", 9);
                put("*", 10);
                put("/", 10);
                put(riy.MOD, 10);
                put("is", 11);
            }
        };
        f12309a = hashMap;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            int length = entry.getKey().length();
            if (length > b) {
                b = length;
            }
        }
    }
}
