package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.ah;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ce extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f24691a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Notification f989a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f990a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f991a;
    final /* synthetic */ String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ce(int i, String str, Context context, String str2, Notification notification) {
        this.f24691a = i;
        this.f991a = str;
        this.f990a = context;
        this.b = str2;
        this.f989a = notification;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        String b;
        b = cd.b(this.f24691a, this.f991a);
        return b;
    }

    @Override // java.lang.Runnable
    public void run() {
        cd.c(this.f990a, this.b, this.f24691a, this.f991a, this.f989a);
    }
}
