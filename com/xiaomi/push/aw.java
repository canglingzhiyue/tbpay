package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class aw {

    /* renamed from: a  reason: collision with root package name */
    static int f24361a;

    public static ar a(Context context) {
        if (j.m2117a()) {
            f24361a = 1;
            return new av(context);
        } else if (ao.a(context)) {
            f24361a = 2;
            return new ao(context);
        } else if (ay.a(context)) {
            f24361a = 4;
            return new ay(context);
        } else if (bc.a(context)) {
            f24361a = 5;
            return new bc(context);
        } else if (au.a(context)) {
            f24361a = 3;
            return new as(context);
        } else {
            f24361a = 0;
            return new bb();
        }
    }
}
