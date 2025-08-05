package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class be {

    /* renamed from: a  reason: collision with root package name */
    public int f24370a;

    /* renamed from: a  reason: collision with other field name */
    public String f133a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f134a = new HashMap();

    public String a() {
        return this.f133a;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", Integer.valueOf(this.f24370a), this.f134a.toString(), this.f133a);
    }
}
