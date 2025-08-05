package com.xiaomi.push;

import android.content.Context;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class cv {

    /* renamed from: a  reason: collision with root package name */
    private int f24409a;

    public cv(int i) {
        this.f24409a = i;
    }

    public int a() {
        return this.f24409a;
    }

    public abstract String a(Context context, String str, List<bf> list);

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1801a(Context context, String str, List<bf> list) {
        return true;
    }
}
