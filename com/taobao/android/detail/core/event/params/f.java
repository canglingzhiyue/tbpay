package com.taobao.android.detail.core.event.params;

import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public String f9719a;
    public String b;
    public ArrayList<String> c;
    public long d;
    public long e;
    public long f;
    public String g;
    public int h;

    static {
        kge.a(139202456);
    }

    public f(String str, String str2, String str3, ArrayList<String> arrayList, long j, long j2, long j3) {
        this.f9719a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = str3;
        emu.a("com.taobao.android.detail.core.event.params.MsgParams");
    }
}
