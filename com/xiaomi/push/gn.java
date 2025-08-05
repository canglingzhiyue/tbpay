package com.xiaomi.push;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class gn extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gm f24504a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(gm gmVar, String str) {
        super(str);
        this.f24504a = gmVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        gh ghVar;
        try {
            ghVar = this.f24504a.f24503a;
            ghVar.m1974a();
        } catch (Exception e) {
            this.f24504a.c(9, e);
        }
    }
}
