package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f24599a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f852a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(n nVar, String str, String str2, String str3) {
        this.f24599a = nVar;
        this.f852a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        context = this.f24599a.f849a;
        SharedPreferences.Editor edit = context.getSharedPreferences(this.f852a, 4).edit();
        edit.putString(this.b, this.c);
        edit.commit();
    }
}
