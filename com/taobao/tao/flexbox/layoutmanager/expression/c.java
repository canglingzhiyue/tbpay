package com.taobao.tao.flexbox.layoutmanager.expression;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f20396a;
    private static Set<String> b;
    private static Set<String> c;
    private static Set<String> d;
    private static Set<String> e;

    static {
        kge.a(-1115236300);
        f20396a = new HashSet();
        b = new HashSet();
        c = new HashSet();
        d = new HashSet();
        e = new HashSet();
        f20396a.add(riy.PLUS);
        f20396a.add("-");
        f20396a.add("*");
        f20396a.add("/");
        f20396a.add(">");
        f20396a.add(">=");
        f20396a.add("<");
        f20396a.add("<=");
        b.add("&&");
        b.add("||");
        d.add("==");
        d.add("!=");
        c.add(riy.AND_NOT);
        e.add("?:");
    }

    public static Object a(Object obj, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2ba76d88", new Object[]{obj, obj2, str});
        }
        if (d.contains(str)) {
            if (str.equals("==")) {
                return Boolean.valueOf(obj.equals(obj2));
            }
            if (str.equals("!=")) {
                return Boolean.valueOf(!obj.equals(obj2));
            }
        }
        if (f20396a.contains(str)) {
            Float f = (Float) obj;
            Float f2 = (Float) obj2;
            if (str.equals(riy.PLUS)) {
                return Float.valueOf(f.floatValue() + f2.floatValue());
            }
            if (str.equals("-")) {
                return Float.valueOf(f.floatValue() - f2.floatValue());
            }
            if (str.equals("*")) {
                return Float.valueOf(f.floatValue() * f2.floatValue());
            }
            if (str.equals("/")) {
                return Float.valueOf(f.floatValue() / f2.floatValue());
            }
            if (str.equals(">")) {
                if (f.floatValue() > f2.floatValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (str.equals(">=")) {
                if (f.floatValue() >= f2.floatValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (str.equals("<")) {
                if (f.floatValue() < f2.floatValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (str.equals("<=")) {
                if (f.floatValue() <= f2.floatValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        if (b.contains(str)) {
            Boolean valueOf = Boolean.valueOf(obj.toString());
            Boolean valueOf2 = Boolean.valueOf(obj2.toString());
            if (str.equals("&&")) {
                if (valueOf.booleanValue() && valueOf2.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (str.equals("||")) {
                if (valueOf.booleanValue() || valueOf2.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        throw new RuntimeException("invalid operator : " + str);
    }

    public static Object a(Object obj, Object obj2, Object obj3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("aab6982c", new Object[]{obj, obj2, obj3, str});
        }
        if (e.contains(str) && str.equals("?:")) {
            try {
                return ((Boolean) obj).booleanValue() ? obj2 : obj3;
            } catch (ClassCastException unused) {
                throw new RuntimeException("invalid condition of operator : " + str);
            }
        }
        throw new RuntimeException("invalid operator : " + str);
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (c.contains(str) && str.equals(riy.AND_NOT)) {
            try {
                if (((Boolean) obj).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } catch (ClassCastException unused) {
                throw new RuntimeException("invalid usage of operator: " + str);
            }
        }
        throw new RuntimeException("invalid operator : " + str);
    }
}
