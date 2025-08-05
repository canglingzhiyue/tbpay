package com.alibaba.android.aura.nodemodel.branch;

import com.alibaba.fastjson.annotation.JSONField;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    @JSONField(name = "code")

    /* renamed from: a  reason: collision with root package name */
    public String f2155a;
    @JSONField(name = "default")
    public String b;
    @JSONField(name = "operator")
    public String c;

    static {
        kge.a(1009670824);
    }

    public c() {
    }

    public c(String str, boolean z, String str2) {
        this.f2155a = str;
        this.b = String.valueOf(z);
        this.c = str2;
    }
}
