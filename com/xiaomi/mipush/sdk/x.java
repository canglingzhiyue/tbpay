package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* loaded from: classes9.dex */
class x {

    /* renamed from: a  reason: collision with root package name */
    int f24339a = 0;

    /* renamed from: a  reason: collision with other field name */
    String f83a = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return !TextUtils.isEmpty(xVar.f83a) && xVar.f83a.equals(this.f83a);
    }
}
