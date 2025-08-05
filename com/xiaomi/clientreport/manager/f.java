package com.xiaomi.clientreport.manager;

import com.xiaomi.push.ah;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class f extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f24283a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a aVar) {
        this.f24283a = aVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return "100889";
    }

    @Override // java.lang.Runnable
    public void run() {
        int b;
        ExecutorService executorService;
        b = this.f24283a.b();
        if (b > 0) {
            executorService = this.f24283a.f17a;
            executorService.execute(new g(this));
        }
    }
}
