package com.xiaomi.push;

import com.xiaomi.push.ah;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class aj extends ah.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ah f24349a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ah ahVar, ah.a aVar) {
        super(aVar);
        this.f24349a = ahVar;
    }

    @Override // com.xiaomi.push.ah.b
    void b() {
        Object obj;
        Map map;
        obj = this.f24349a.f90a;
        synchronized (obj) {
            map = this.f24349a.f91a;
            map.remove(this.f24347a.mo1839a());
        }
    }
}
