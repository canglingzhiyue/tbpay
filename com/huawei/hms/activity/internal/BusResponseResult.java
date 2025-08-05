package com.huawei.hms.activity.internal;

import android.content.Intent;

/* loaded from: classes4.dex */
public class BusResponseResult {

    /* renamed from: a  reason: collision with root package name */
    private Intent f7322a;
    private int b;

    public int getCode() {
        return this.b;
    }

    public Intent getIntent() {
        return this.f7322a;
    }

    public void setCode(int i) {
        this.b = i;
    }

    public void setIntent(Intent intent) {
        this.f7322a = intent;
    }
}
