package com.xiaomi.push;

/* loaded from: classes9.dex */
class ha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gx f24516a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f458a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ha(gx gxVar, String str) {
        this.f24516a = gxVar;
        this.f458a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        cs.a().a(this.f458a, true);
    }
}
