package com.mobile.auth;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class O0O00o {
    private static ConcurrentHashMap<String, oooOoO> O000000o = new ConcurrentHashMap<>(16);

    public static void O000000o(String str, oooOoO oooooo) {
        O000000o.put(str, oooooo);
    }

    public static boolean O000000o() {
        return O000000o.isEmpty();
    }

    public static boolean O000000o(String str) {
        return !O000000o.containsKey(str);
    }

    public static void O00000Oo(String str) {
        O000000o.remove(str);
    }

    public static oooOoO O00000o0(String str) {
        return O000000o.get(str);
    }
}
