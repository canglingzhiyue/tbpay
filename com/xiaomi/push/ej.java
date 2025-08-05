package com.xiaomi.push;

import android.content.Context;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes9.dex */
public class ej extends ei {
    public ej(Context context, int i) {
        super(context, i);
    }

    @Override // com.xiaomi.push.ei, com.xiaomi.push.ah.a
    /* renamed from: a */
    public ie mo1839a() {
        return ie.Storage;
    }

    @Override // com.xiaomi.push.ei, com.xiaomi.push.ah.a
    /* renamed from: a  reason: collision with other method in class */
    public String mo1839a() {
        return AgooConstants.REPORT_DUPLICATE_FAIL;
    }

    @Override // com.xiaomi.push.ei
    public String b() {
        return "ram:" + i.m2025a() + ",rom:" + i.m2029b() + "|ramOriginal:" + i.c() + ",romOriginal:" + i.d();
    }
}
