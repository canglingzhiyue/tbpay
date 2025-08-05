package com.xiaomi.push;

import com.xiaomi.push.ak;
import com.xiaomi.push.du;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class dw extends ak.b {

    /* renamed from: a  reason: collision with root package name */
    ak.b f24437a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ du f243a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dw(du duVar) {
        this.f243a = duVar;
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: b */
    public void mo1827b() {
        du.b bVar = (du.b) this.f243a.f231a.peek();
        if (bVar == null || !bVar.a()) {
            return;
        }
        if (this.f243a.f231a.remove(bVar)) {
            this.f24437a = bVar;
        }
        ak.b bVar2 = this.f24437a;
        if (bVar2 == null) {
            return;
        }
        bVar2.mo1827b();
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: c */
    public void mo1828c() {
        ak.b bVar = this.f24437a;
        if (bVar != null) {
            bVar.mo1828c();
        }
    }
}
