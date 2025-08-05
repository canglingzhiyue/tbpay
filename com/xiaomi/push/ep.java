package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ep implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f24460a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f328a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f329a;
    final /* synthetic */ String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ep(Context context, String str, int i, String str2) {
        this.f328a = context;
        this.f329a = str;
        this.f24460a = i;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        eo.c(this.f328a, this.f329a, this.f24460a, this.b);
    }
}
