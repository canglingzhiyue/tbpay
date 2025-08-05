package com.taobao.mrt.mtop;

import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import tb.kge;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f18249a;
    public String b;
    public boolean c;
    public boolean d;
    public Map<String, String> e;
    public MethodEnum f;
    public boolean g;
    public boolean h;
    public Class<?> i;

    static {
        kge.a(-1222722402);
    }

    public b() {
        this.f = MethodEnum.GET;
        this.g = true;
        this.h = false;
    }

    public b(String str, String str2, boolean z, boolean z2, Map<String, String> map, Class<?> cls, MethodEnum methodEnum) {
        this.f = MethodEnum.GET;
        this.g = true;
        this.h = false;
        this.f18249a = str;
        this.b = str2;
        this.d = z;
        this.c = z2;
        this.e = map;
        this.i = cls;
        this.f = methodEnum;
    }
}
