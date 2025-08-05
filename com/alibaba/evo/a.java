package com.alibaba.evo;

import tb.kge;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f2921a;
    private String b;

    static {
        kge.a(-1672507492);
    }

    public a(int i) {
        this.f2921a = i;
        int i2 = this.f2921a;
        if (i2 == 2002) {
            this.b = "SDK未初始化或初始化未完成";
        } else if (i2 != 2001) {
        } else {
            this.b = "参数不合法";
        }
    }

    public a(int i, String str) {
        this.f2921a = i;
        this.b = str;
    }
}
