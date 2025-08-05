package com.taobao.android.mnncv.mtop;

import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public String f14411a;
    public String b;
    public boolean c;
    public boolean d;
    public Map<String, String> e;
    public MethodEnum f;
    public boolean g;
    public boolean h;
    public Class<?> i;

    public f() {
        this.f = MethodEnum.GET;
        this.g = true;
        this.h = false;
    }

    public f(String str, String str2, boolean z, boolean z2, Map<String, String> map, Class<?> cls, MethodEnum methodEnum) {
        this.f = MethodEnum.GET;
        this.g = true;
        this.h = false;
        this.f14411a = str;
        this.b = str2;
        this.d = z;
        this.c = z2;
        this.e = map;
        this.i = cls;
        this.f = methodEnum;
    }
}
