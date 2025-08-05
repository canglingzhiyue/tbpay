package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.push.ak;
import com.xiaomi.push.cw;
import com.xiaomi.push.el;
import com.xiaomi.push.service.bw;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class bx extends ak.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bw f24683a;

    /* renamed from: a  reason: collision with other field name */
    boolean f978a = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bx(bw bwVar) {
        this.f24683a = bwVar;
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: b */
    public void mo1827b() {
        try {
            el.a a2 = el.a.a(Base64.decode(cw.a(com.xiaomi.push.r.m2212a(), "https://resolver.msg.xiaomi.net/psc/?t=a", (List<com.xiaomi.push.bf>) null), 10));
            if (a2 == null) {
                return;
            }
            this.f24683a.f976a = a2;
            this.f978a = true;
            this.f24683a.e();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("fetch config failure: " + e.getMessage());
        }
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: c */
    public void mo1828c() {
        List list;
        List list2;
        bw.a[] aVarArr;
        el.a aVar;
        this.f24683a.f975a = null;
        if (this.f978a) {
            synchronized (this.f24683a) {
                list = this.f24683a.f977a;
                list2 = this.f24683a.f977a;
                aVarArr = (bw.a[]) list.toArray(new bw.a[list2.size()]);
            }
            for (bw.a aVar2 : aVarArr) {
                aVar = this.f24683a.f976a;
                aVar2.a(aVar);
            }
        }
    }
}
