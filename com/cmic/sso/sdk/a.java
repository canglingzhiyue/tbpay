package com.cmic.sso.sdk;

import com.mobile.auth.O00O0Oo;
import com.mobile.auth.O00oo000;
import com.mobile.auth.O0O000o;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f6470a;

    public a(int i) {
        this.f6470a = new ConcurrentHashMap<>(i);
    }

    public O00oo000 a() {
        O00oo000 o00oo000 = (O00oo000) this.f6470a.get("logBean");
        return o00oo000 != null ? o00oo000 : new O00oo000();
    }

    public void a(O00O0Oo o00O0Oo) {
        if (o00O0Oo != null) {
            this.f6470a.put("current_config", o00O0Oo);
        }
    }

    public void a(O00oo000 o00oo000) {
        if (o00oo000 != null) {
            this.f6470a.put("logBean", o00oo000);
        }
    }

    public void a(String str, int i) {
        if (str != null) {
            this.f6470a.put(str, Integer.valueOf(i));
        }
    }

    public void a(String str, long j) {
        if (str != null) {
            this.f6470a.put(str, Long.valueOf(j));
        }
    }

    public void a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f6470a.put(str, str2);
    }

    public void a(String str, boolean z) {
        if (str != null) {
            this.f6470a.put(str, Boolean.valueOf(z));
        }
    }

    public void a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return;
        }
        this.f6470a.put(str, bArr);
    }

    public byte[] a(String str) {
        if (str != null) {
            return (byte[]) this.f6470a.get(str);
        }
        return null;
    }

    public int b(String str, int i) {
        return (str == null || !this.f6470a.containsKey(str)) ? i : ((Integer) this.f6470a.get(str)).intValue();
    }

    public long b(String str, long j) {
        return (str == null || !this.f6470a.containsKey(str)) ? j : ((Long) this.f6470a.get(str)).longValue();
    }

    public O00O0Oo b() {
        O00O0Oo o00O0Oo = (O00O0Oo) this.f6470a.get("current_config");
        if (o00O0Oo != null) {
            return o00O0Oo;
        }
        O0O000o.O000000o("UmcConfigBean为空", "请核查");
        return new O00O0Oo.O000000o().O000000o();
    }

    public String b(String str) {
        return b(str, "");
    }

    public String b(String str, String str2) {
        return (str == null || !this.f6470a.containsKey(str)) ? str2 : (String) this.f6470a.get(str);
    }

    public boolean b(String str, boolean z) {
        return (str == null || !this.f6470a.containsKey(str)) ? z : ((Boolean) this.f6470a.get(str)).booleanValue();
    }

    public int c(String str) {
        return b(str, 0);
    }
}
