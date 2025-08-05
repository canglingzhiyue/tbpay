package com.taobao.android.gateway.dinamic.expressionv2;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_CONST_LEN = 255;
    public static final int MAX_MTHNAME_LEN = 255;
    public static final int MAX_VARNAME_LEN = 255;
    public static final char TokenCMA = ',';
    public static final char TokenDLR = '@';
    public static final char TokenESC = '\\';
    public static final char TokenLBR = '{';
    public static final char TokenLPR = '(';
    public static final char TokenRBR = '}';
    public static final char TokenRPR = ')';
    public static final char TokenSEM = ';';
    public static final char TokenSQ = '\'';

    /* renamed from: a  reason: collision with root package name */
    public static boolean[][] f12704a = null;
    public static char[] b = null;
    public static char[] c = null;
    public static final int kNumTokens = 14;

    static {
        kge.a(591797253);
        f12704a = new boolean[][]{new boolean[]{false, true, false, false, false, false, true, false, false, false, false, false, false, false, true}, new boolean[]{false, false, true, false, false, false, false, false, false, false, false, false, false, false, true}, new boolean[]{false, false, true, true, false, false, false, false, false, false, false, false, false, false, true}, new boolean[]{false, true, false, false, true, false, true, false, false, false, false, true, false, false, true}, new boolean[]{false, false, false, false, true, true, false, false, false, true, false, false, false, false, true}, new boolean[]{false, false, false, false, false, true, false, false, false, true, true, false, true, true, true}, new boolean[]{false, false, false, false, false, false, false, true, true, false, false, false, false, false, true}, new boolean[]{false, false, false, false, false, false, false, true, true, false, false, false, false, false, true}, new boolean[]{false, false, false, false, false, true, false, false, false, true, true, false, false, true, true}, new boolean[]{false, true, false, false, true, false, true, false, false, false, false, true, false, false, true}, new boolean[]{false, true, false, false, false, false, true, false, false, false, false, false, false, false, true}, new boolean[]{false, true, false, false, false, false, true, false, false, false, false, false, false, false, true}, new boolean[]{false, false, false, false, false, true, false, false, false, true, false, false, false, true, true}, new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, true}};
        b = new char[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        c = new char[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public Pair<List, List> a(String str) {
        boolean z;
        int i;
        char[] cArr;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{this, str});
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c2 = charArray[0];
        if (c2 != '@' && c2 != '\'') {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Stack stack = new Stack();
        StringBuilder sb4 = sb;
        StringBuilder sb5 = sb2;
        StringBuilder sb6 = sb3;
        int i3 = 0;
        char c3 = 0;
        boolean z2 = false;
        boolean z3 = true;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length && c3 != 14) {
            if (z2) {
                cArr = charArray;
                i2 = 1;
                z2 = false;
            } else {
                char c4 = charArray[i3];
                if (!z3 || c4 != ' ') {
                    z = z2;
                    i = 0;
                } else {
                    z = z2;
                    i = 0;
                    while (c4 == ' ' && (i3 = i3 + 1) < length) {
                        i++;
                        c4 = charArray[i3];
                    }
                    if (i3 >= length) {
                    }
                }
                cArr = charArray;
                if (c4 != ',') {
                    if (c4 == ';') {
                        if (f12704a[c3][10]) {
                            arrayList.add(10);
                            arrayList2.add(" ");
                            stack.push(10);
                            com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateMethodSep");
                            z2 = z;
                            i2 = 1;
                            c3 = '\n';
                        }
                        z2 = z;
                        i2 = 1;
                        c3 = 14;
                    } else if (c4 == '@') {
                        if (f12704a[c3][1]) {
                            arrayList.add(1);
                            arrayList2.add(" ");
                            com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateMethodBegin");
                            z2 = z;
                            i2 = 1;
                            c3 = 1;
                        }
                        z2 = z;
                        i2 = 1;
                        c3 = 14;
                    } else if (c4 == '\\') {
                        if (c3 == 7 || c3 == 6) {
                            i2 = 1;
                            z2 = true;
                        }
                        z2 = z;
                        i2 = 1;
                        c3 = 14;
                    } else if (c4 == '{') {
                        if (f12704a[c3][3]) {
                            if (sb4.length() > 0 && sb4.length() <= 255) {
                                arrayList.add(2);
                                arrayList2.add(sb4.toString());
                                com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateMethodName");
                                StringBuilder sb7 = new StringBuilder();
                                i4++;
                                arrayList.add(3);
                                arrayList2.add(" ");
                                com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateMethodBodyBegin");
                                sb4 = sb7;
                                z2 = z;
                                i2 = 1;
                                c3 = 3;
                            }
                        }
                        z2 = z;
                        i2 = 1;
                        c3 = 14;
                    } else if (c4 == '}') {
                        if (f12704a[c3][5]) {
                            if (sb5.length() > 0) {
                                if (sb5.length() <= 255) {
                                    arrayList.add(4);
                                    arrayList2.add(sb5.toString());
                                    sb5 = new StringBuilder();
                                    com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateVarName");
                                }
                            }
                            i4--;
                            arrayList.add(5);
                            arrayList2.add(" ");
                            com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateMethodBodyEnd");
                            z2 = z;
                            i2 = 1;
                            c3 = 5;
                        }
                        z2 = z;
                        i2 = 1;
                        c3 = 14;
                    } else {
                        switch (c4) {
                            case '\'':
                                boolean[][] zArr = f12704a;
                                if (zArr[c3][6]) {
                                    arrayList.add(6);
                                    arrayList2.add(" ");
                                    com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateConstBegin");
                                    z2 = z;
                                    i2 = 1;
                                    c3 = 6;
                                    z3 = false;
                                    break;
                                } else {
                                    if (zArr[c3][8] && sb6.length() <= 255) {
                                        arrayList.add(7);
                                        arrayList2.add(sb6.toString());
                                        sb6 = new StringBuilder();
                                        com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateConstName");
                                        arrayList.add(8);
                                        arrayList2.add(" ");
                                        com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateConstEnd");
                                        z2 = z;
                                        i2 = 1;
                                        c3 = '\b';
                                        z3 = true;
                                        break;
                                    }
                                    z2 = z;
                                    i2 = 1;
                                    c3 = 14;
                                    break;
                                }
                            case '(':
                                if (f12704a[c3][11]) {
                                    arrayList.add(11);
                                    arrayList2.add(" ");
                                    i5++;
                                    stack.push(11);
                                    z2 = z;
                                    i2 = 1;
                                    c3 = 11;
                                    break;
                                }
                                z2 = z;
                                i2 = 1;
                                c3 = 14;
                                break;
                            case ')':
                                if (f12704a[c3][12]) {
                                    arrayList.add(12);
                                    arrayList2.add(" ");
                                    i5--;
                                    stack.push(12);
                                    z2 = z;
                                    i2 = 1;
                                    c3 = '\f';
                                    break;
                                }
                                z2 = z;
                                i2 = 1;
                                c3 = 14;
                                break;
                            default:
                                if (!f12704a[c3][2] || b[c4] == 0) {
                                    if (f12704a[c3][4] && c[c4] != 0) {
                                        if (i <= 0) {
                                            sb5.append(c4);
                                            z2 = z;
                                            i2 = 1;
                                            c3 = 4;
                                            break;
                                        }
                                    } else if (f12704a[c3][7]) {
                                        sb6.append(c4);
                                        z2 = z;
                                        i2 = 1;
                                        c3 = 7;
                                        break;
                                    }
                                    z2 = z;
                                    i2 = 1;
                                    c3 = 14;
                                    break;
                                } else {
                                    if (i <= 0) {
                                        sb4.append(c4);
                                        z2 = z;
                                        i2 = 1;
                                        c3 = 2;
                                        break;
                                    }
                                    z2 = z;
                                    i2 = 1;
                                    c3 = 14;
                                }
                                break;
                        }
                    }
                } else if (f12704a[c3][9]) {
                    if (sb5.length() > 0) {
                        if (sb5.length() <= 255) {
                            arrayList.add(4);
                            arrayList2.add(sb5.toString());
                            sb5 = new StringBuilder();
                            com.taobao.android.gateway.util.a.a("TokenizerState.kTokenizerStateVarName");
                        }
                        z2 = z;
                        i2 = 1;
                        c3 = 14;
                    } else if (c3 == 6) {
                        sb6.append(c4);
                        z2 = z;
                        i2 = 1;
                        c3 = 7;
                    }
                    arrayList.add(9);
                    arrayList2.add(" ");
                    z2 = z;
                    i2 = 1;
                    c3 = '\t';
                } else {
                    if (c3 == 6) {
                        sb6.append(c4);
                        z2 = z;
                        i2 = 1;
                        c3 = 7;
                    }
                    z2 = z;
                    i2 = 1;
                    c3 = 14;
                }
            }
            i3 += i2;
            charArray = cArr;
        }
        if (f12704a[c3][13]) {
            c3 = '\r';
        }
        if (i4 != 0 || i5 != 0) {
            return null;
        }
        int size = stack.size();
        if (size > 0 && (size & 1) == 0) {
            while (!stack.empty()) {
                if (((Integer) stack.pop()).intValue() != 10) {
                    return null;
                }
            }
        }
        if (c3 == 14) {
            return null;
        }
        return Pair.create(arrayList, arrayList2);
    }
}
