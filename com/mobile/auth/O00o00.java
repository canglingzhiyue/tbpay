package com.mobile.auth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class O00o00 {
    private int O000000o;
    private Map<String, List<String>> O00000Oo;
    private String O00000o0;

    public O00o00(int i, Map<String, List<String>> map, String str) {
        this.O000000o = i;
        this.O00000Oo = map;
        this.O00000o0 = str;
    }

    public int O000000o() {
        return this.O000000o;
    }

    public Map<String, List<String>> O00000Oo() {
        Map<String, List<String>> map = this.O00000Oo;
        return map == null ? new HashMap() : map;
    }

    public boolean O00000o() {
        int i = this.O000000o;
        return i == 302 || i == 301;
    }

    public String O00000o0() {
        String str = this.O00000o0;
        return str == null ? "" : str;
    }
}
