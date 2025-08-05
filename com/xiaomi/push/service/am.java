package com.xiaomi.push.service;

import com.xiaomi.push.ah;

/* loaded from: classes9.dex */
class am extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f24642a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ aw f925a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f926a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public am(String str, aw awVar, int i) {
        this.f926a = str;
        this.f925a = awVar;
        this.f24642a = i;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return this.f926a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f925a.a(this.f24642a);
    }
}
