package com.mobile.auth;

import android.net.Network;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class O00OoOO0 {
    String O000000o;
    private final String O00000Oo;
    private final String O00000o;
    private final Map<String, String> O00000o0;
    private boolean O00000oO;
    private final String O00000oo;
    private Network O0000O0o;
    private long O0000OOo;
    private int O0000Oo;
    private final String O0000Oo0;
    private final O00Oo0 O0000OoO;

    public O00OoOO0(String str, O00Oo0 o00Oo0, String str2, String str3) {
        this(str, null, o00Oo0, str2, str3);
    }

    private O00OoOO0(String str, Map<String, String> map, O00Oo0 o00Oo0, String str2, String str3) {
        this.O00000oO = false;
        this.O00000Oo = str;
        this.O0000OoO = o00Oo0;
        this.O00000o0 = map == null ? new HashMap<>() : map;
        String str4 = "";
        this.O000000o = o00Oo0 == null ? str4 : o00Oo0.O00000Oo().toString();
        this.O00000o = str2;
        this.O00000oo = str3;
        this.O0000Oo0 = o00Oo0 != null ? o00Oo0.O000000o() : str4;
        O0000OoO();
    }

    private void O0000OoO() {
        this.O00000o0.put("sdkVersion", BuildConfig.CMCC_SDK_VERSION);
        this.O00000o0.put("Content-Type", "application/json");
        this.O00000o0.put("CMCC-EncryptType", "STD");
        this.O00000o0.put("traceId", this.O00000oo);
        this.O00000o0.put("appid", this.O0000Oo0);
        this.O00000o0.put("connection", "Keep-Alive");
    }

    public String O000000o() {
        return this.O00000Oo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O000000o(long j) {
        this.O0000OOo = j;
    }

    public void O000000o(Network network) {
        this.O0000O0o = network;
    }

    public void O000000o(String str, String str2) {
        this.O00000o0.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O000000o(boolean z) {
        this.O00000oO = z;
    }

    public boolean O00000Oo() {
        return this.O00000oO;
    }

    public String O00000o() {
        return this.O000000o;
    }

    public Map<String, String> O00000o0() {
        return this.O00000o0;
    }

    public String O00000oO() {
        return this.O00000o;
    }

    public String O00000oo() {
        return this.O00000oo;
    }

    public Network O0000O0o() {
        return this.O0000O0o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long O0000OOo() {
        return this.O0000OOo;
    }

    public O00Oo0 O0000Oo() {
        return this.O0000OoO;
    }

    public boolean O0000Oo0() {
        int i = this.O0000Oo;
        this.O0000Oo = i + 1;
        return i < 2;
    }
}
